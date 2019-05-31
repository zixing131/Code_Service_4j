 
  <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String context = request.getContextPath();
%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Share查询</title>
<meta name="keywords" content="index">
</head>

<body>
	<%@ include file="../../includeScript.jsp"%>

	<script src='js/ShareSearch.js'></script>
	
	<div class="easyui-layout" data-options="fit:true">

		<div id='center' class='search_main' data-options="region:'center',border:false">
	
	<form id="shareForm" class='search-form' method="post">
		<table cellpadding="10" style='width:100%;'>
			<tr>
				<td>
					<table id="shareTable" style='width:100%;' >
						       
						<tr >
						     
							
							<td align='right' class='td-label'>分享人id</td>
							<td><input class="easyui-textbox" type="text"
								id="employeeId"  name="employeeId" data-options="height:30"></input></td>
       
						     
							
							<td align='right' class='td-label'>分享人名称</td>
							<td><input class="easyui-textbox" type="text"
								id="employeeName"  name="employeeName" data-options="height:30"></input></td>
       
						   
							
 

						<td align='right' class='td-label'>分享时间</td>
						<td><input type="hidden" id='createdate' value='1'
							data-ssbtype='dateRange' name="createdate"></input> <input
							class="easyui-datebox" type="text" id='createdateStart'
							data-ssbtype='date'
							data-options="formatter:tcCoreformatter,parser:tcCoreParser,width:120,height:30"></input>
							- <input class="easyui-datebox" type="text"
							id='createdateEnd' data-ssbtype='date'
							data-options="formatter:tcCoreformatter,parser:tcCoreParser,width:120,height:30"></input>
						</td>  						</tr>
						     
						<tr class='shouldhidden'>
						   
							
								<td align='right' class='td-label'>分享商品id</td>
							<td>
						<input class=" easyui-numberbox" type="text"
						id='goodsid' data-ssbtype='int'
						name="goodsid" data-options="height:30,width:200"></input>
								</td>
       
						   
							
							<td align='right' class='td-label'>分享商品名称</td>
							<td><input class="easyui-textbox" type="text"
								id="goodsname"  name="goodsname" data-options="height:30"></input></td>
       
						   
							
							<td align='right' class='td-label'>分享位置</td>
							<td><input class="easyui-textbox" type="text"
								id="sharesite"  name="sharesite" data-options="height:30"></input></td>
  						</tr>
						     
						<tr class='shouldhidden'>
						   
							
							<td align='right' class='td-label'>分享url</td>
							<td><input class="easyui-textbox" type="text"
								id="shareurl"  name="shareurl" data-options="height:30"></input></td>
       
						   
							
							<td align='right' class='td-label'>点击量</td>
							<td>
						<input class=" easyui-numberbox" type="text"
						id='chicknum' data-ssbtype='int'
						name="chicknum" data-options="height:30,width:200"></input>
								</td>
   
					</table>
				</td>

				<td align='left' style='width:180px;'>
					<a class='moreBtn' id='moreConditionBtn'>更多↓</a>
					<a href="#" class="easyui-linkbutton search" style='margin-left:30px;'
					data-options="iconCls:'icon-form-search-btn'"
					onclick='queryShare()'>查询</a></td>
			</tr>
		</table>
	</form>
	
	<div id='operbtn' class='operbtn'>
		<a href="#" class="easyui-linkbutton" onclick="addData()">新增</a> <a
			href="#" class="easyui-linkbutton" onclick="editDataBtnClick()">修改</a>
		<a href="#" class="easyui-linkbutton" onclick="deleteDataBtnClick()">删除</a>
		<a href="#" class="easyui-linkbutton" onclick="print()">打印</a>
	</div>
	<div id='shareGridDiv' style='width: 100%'>
		<table id='shareGrid'></table>
	</div>
	<div id="shareGridPager" />
	</div>
	</div>
</body>
</html>
