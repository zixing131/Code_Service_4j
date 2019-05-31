var personelAttr = {};

function init() {
	$("#center").mCustomScrollbar({
		theme : "minimal-dark",
		scrollSpeed : 50,
		scrollInertia : 100
	});
	$("#west").mCustomScrollbar({
		theme : "minimal-dark",
		scrollSpeed : 50,
		scrollInertia : 100
	});

	initPersonPanel();
	initPersonWork();
	initTeamWork();  
}

function initPersonPanel() {
	// 获取当前人的信息
	tcCore.get({
		url : "employeeDS/getCurrentEmployeeInfo.ssm",
		success : function(data) {
			$("#name").html(data.name);
			$("#phone").html(data.phone);
			$("#deptIdShow").html(data.deptIdShow);
			$("#jobName").html(data.jobName);

		}
	});
	// 可以直接编辑自己的信息
}

function initPersonWork() {
	// 获取当前人的目标和业绩
	var date = new Date();
	window.now = date;
	window.monthNum = date.format("yyyyMM");
	window.monthStr = date.format("yyyy-MM");
	var monthStr = date.format("yyyy年MM月");
	$("#myGoalPanel")
			.panel(
					{
						title : "我的绩效&nbsp;<a href='#' style='text-decoration:none;'></a>"
								+ monthStr
					});

	tcCore
			.get({
				url : "kpiCaculateDS/excuteCaculateCurrent.ssm",
				loadingMsg : "正在计算该月绩效",
				success : function(data) {
					tcCore
							.post({
								url : "kpiResultDS/queryCurrent.ssm",
								data:{
									monthStr:window.monthStr,
									monthNum:window.monthNum
								},
								loadingMsg : "正在获取月度绩效",
								success : function(data) {
									if (data && data.length > 0) {
										var html = [];
										$(data).each(function(i, o) {
											if(o.varDesc){
												var width = 0;
												var p = "0";
												if( o.goal&& o.goal!==0){
													width = parseFloat(o.staticValue)/o.goal;
													
													if(width!==0){
														p = (width*100)+"%";
													}
													if(width>1){
														width = 1;
													}
												}
												html.push("<div>");
												html
														.push("<span style='display:inline-block;height:20px;line-height:0px;margin-right:20px;'>"
																+ o.varDesc
																+ "</span>");
												html
														.push("<span style='display:inline-block;background-color:#eee;height:15px;width:300px;margin-right:20px;'>" +
																"<a style='background-color:#30a7e7;height:15px;display:inline-block;width:"+(width*100)+"%;'></a>" +
																"</span>");
												html
														.push("<span >"
																+ o.staticValue
																+ "/"
																+ o.goal+"&nbsp;("
																+ p+")</span>");
												html.push("</div>");
											}			
										});
										if(html.join("")==""){
											$("#mygoal")
											.addClass("no_goal")
											.html(
													"未设置绩效目标&nbsp;&nbsp;&nbsp;<a href=''>点击设置我的目标</a>");
										}else{
											$("#mygoal").html(html.join(""));
										}
										
									} else {
										$("#mygoal")
												.addClass("no_goal")
												.html(
														"未设置绩效目标&nbsp;&nbsp;&nbsp;<a href=''>点击设置我的目标</a>");
									}
								}
							});

				}
			});
}

function initSubJob() {
	tcCore.get({
		url : "employeeJobDS/getCurrentAllSubJob.ssm",
		success : function(data) {
			if (!data || data.length == 0) {
				// 不初始化下级
				$("#teamPanel").remove();
			} else {
				initTeamPanel();
				initJobTree(data);
			}
		}
	});
}

function initJobTree(data) {
	$("#jobTree").treegrid({
		idField : 'jobroleId',
		collapsible : true,
		treeField : 'jobroleName',
		fitColumns : true,
		border : false,
		iconCls : "icon-grid",
		headerCls : "gridHeaderCls",
		showHeader : false,
		columns : [ [ {
			title : '名称',
			field : 'jobroleName',
			width : 180,
			formatter:function(value,row){
				//icon-tree-nurse
				if(row.children&&row.children.length>0){
					row.iconCls = "icon-tree-manager";
				}else{
					if(value.indexOf("医生")>=0){
						row.iconCls = "icon-tree-doc";
					}else if(value.indexOf("客服")>=0){
						row.iconCls = "icon-tree-cs";
					}else if(value.indexOf("医助")>=0 ||value.indexOf("导医")>=0 ){
						row.iconCls = "icon-tree-nurse";
					}else{
						row.iconCls = "icon-tree-normal";
					}
				}
				return value;
			}
		} ,{
			title : '操作',
			field : '23',
			width : 180,
			formatter:function(value,row){
				return "<a class='grid_link'   onclick='setKpiGrade(\""+row.jobroleId+"\")' >指标&梯度</a>&nbsp;&nbsp;"+"<a class='grid_link' onclick='setGoal(\""+row.jobroleId+"\")'>目标</a>";
			}
		}] ],
		onSelect : function(rowData) {
			if($("#teamPanelGrid").data().datagrid){
				$("#teamPanelGrid").datagrid("loadData",[]);
			}
			
			getKpiByJob(rowData.jobroleId);
		},
		onLoadSuccess : function(row) {
			//$(this).treegrid('enableDnd', row ? row.id : null);
			var data = $("#jobTree").treegrid("getData");
			if(data!=null&&data.length>0){
				 $("#jobTree").treegrid("select",data[0].jobroleId);
			}
		}
	});
	$("#jobTree").treegrid("loadData", data);
}

function initTeamPanel() {

	var date = new Date();

	var monthStr = date.format("yyyy年MM月");

	$("#teamPanel")
			.panel(
					{
						title : "员工绩效&nbsp;<a onclick='preMonth()'  class='grid_link' style='text-decoration:none;'>&lt;</a>"
								+"<label id='month'>" +monthStr+"</label><a onclick='nextMonth()'  class='grid_link' style='text-decoration:none;'>&gt;</a>"
					});
}

function preMonth(){
	var lastMonthDate = window.now;  //上月日期  
	lastMonthDate.setDate(1);  
	lastMonthDate.setMonth(lastMonthDate.getMonth()-1);  
	window.now = lastMonthDate;
	
	
	var monthStr = lastMonthDate.format("yyyy年MM月");
	window.monthNum = lastMonthDate.format("yyyyMM");
	window.monthStr = lastMonthDate.format("yyyy-MM");
	$("#month").html(monthStr);
	var data =  $("#jobTree").treegrid("getSelected");
	getKpiByJob(data.jobroleId);
}

function nextMonth(){
	var lastMonthDate = window.now;  //上月日期  
	lastMonthDate.setDate(1);  
	lastMonthDate.setMonth(lastMonthDate.getMonth()+1);  
	window.now = lastMonthDate;
	
	
	var monthStr = lastMonthDate.format("yyyy年MM月");
	window.monthNum = lastMonthDate.format("yyyyMM");
	window.monthStr = lastMonthDate.format("yyyy-MM");
	$("#month").html(monthStr);
	var data =  $("#jobTree").treegrid("getSelected");
	getKpiByJob(data.jobroleId);
}

function setGoal(jobId){
	tcCore.openWindowOnTop(context + "/app/oms/kpigoal/KpiGoalShow.jsp?jobId="+jobId+"&month="+window.monthStr, null,
			null, function(result) {
				// 关闭窗口的回调
			}, {
				title : "设置目标",
				width : 800,
				height : 600
			});
}

function setKpiGrade(jobId){
	tcCore.openWindowOnTop(context + "/app/oms/kpi/KpiJobSearchSimple.jsp?jobId="+jobId+"&month="+window.monthStr, null,
			null, function(result) {
				// 关闭窗口的回调
			}, {
				title : "设置指标梯度",
				width : 800,
				height : 600
			});
}

function getKpiByJob(jobId) {
	window.jobId = jobId;
	tcCore.get({
		url : "employeeJobDS/getByJobId.ssm?jobId=" + jobId,
		loadingMsg : "正在获取人员信息",
		success : function(data) {
			if (data && data.length > 0) {
				window.teamList = data;
				tcCore.post({
					url : "kpiCaculateDS/excuteCaculate.ssm",
					data : {//Long jobId, String monthStr,int monthNum
						employeeList : window.teamList
					},
					loadingMsg : "正在计算月度绩效",
					success : function(data) {
						tcCore.post({
							url : "kpiResultDS/queryListByJobIdAndMonth.ssm",
							data : {
								jobId : window.jobId,
								monthNum:window.monthNum,
								monthStr:window.monthStr
							},
							loadingMsg : "正在获取月度绩效",
							success : function(data) {
								initTeamGrid(data);
							}
						});
					}
				});
			}else{
				//该职务下没有设置人员
			}
		}
	});
}

function initTeamGrid(data) {
	if (data && data.length > 0) {
		if(!$("#teamPanelGrid").data().datagrid){
			$("#teamPanelGrid").datagrid({
				border : true,
				fitColumns : true,
				bodyCls : "no-top-border",
				columns : [ [{
					field : "name",
					title : "姓名",
					width:140
				}, {
					field : "orgName",
					title : "部门",
					width:100
				},{
					field : "jobName",
					title : "职务",
					width:100
				}, {
					field : "varDesc",
					title : "指标",
					width:80,
					formatter: function(value, row, index) {
						if(value==null||value==""){
							return "<a style='cursor:pointer;'>设置指标</a>";
						}
						return value;
					}
				}, {
					field : "goal",
					title : "目标",
					width:80
				}, {
					field : "staticValue",
					title : "完成情况",
					width:140,
					formatter : function(value, row, index) {
						return value
					}
				}, {
					field : "value",
					title : "绩效",
					width:140,
				} ] ]
			});
		}
		
		//构造合并项
		var merges = [{
			index: 2,
			rowspan: 2
		},{
			index: 5,
			rowspan: 2
		},{
			index: 7,
			rowspan: 2
		}];
//		var tempId = -1;
//		var count = 0;
//		var index = 0;
//		$(data).each(function(i,o){
//			if(tempId==-1){
//				tempId = o.employeeId;
//			}
//			index++;
//			if(tempId == o.employeeId){
//				count++;
//			}else{
//				merges.push({
//					index: 5,
//					rowspan: count
//				});
//				count = 0;
//				tempId = = o.employeeId;
//			}
//		});
//		
//		debugger;
		$("#teamPanelGrid").datagrid("loadData",data);
	} else {
//		$("#teamPanelGrid").addClass("no_goal").html(
//				"未设置绩效目标&nbsp;&nbsp;&nbsp;<a href=''>点击设置</a>");
	}
}

function initTeamWork() {
	// 获取所有下级角色
	initSubJob();
}

/**
 * 修改密码
 */
function onShowUpdatePWD() {
	tcCore.openWindowOnTop(context + "/app/index/modifyPassword.jsp", null,
			null, function(result) {
				// 关闭窗口的回调
			}, {
				title : "修改密码",
				width : 520,
				height : 300
			});
}

$(document).ready(function() {
	init();
});