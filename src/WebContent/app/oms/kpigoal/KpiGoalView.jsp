 
 
 
  <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String context = request.getContextPath();
%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>首页</title>
<meta name="keywords" content="index">
</head>

<body>
	<%@ include file="../../includeScript.jsp"%>

	<script src='js/KpiGoalView.js'></script>

	<div class="easyui-layout" data-options="fit:true">

		<div id='center' data-options="region:'center',border:false">

			<form id="kpiGoalForm" class='view-form' method="post">
				<table cellspacing='10'>

					<div id='kpiGoalFormPanel' title="KpiGoal信息"
						style="width: 100%; font-size: 13px;">     
						        
					<tr>
						<td align='right' class='td-label'>考核对象类型</td>
						<td><label id='kpiObjType' data-ssbtype='int'
							name="kpiObjType"></label></td>
					</tr>
					       
						               
						               
						               
						               
				</table>
		</div>
		</form>

		<div data-options="region:'south',split:true,border:false"
			style="height: 40px;">
			<div class='edit-form-btn' style='float: right; margin-right: 5px;'>
				<a class="easyui-linkbutton oper"
					data-options="iconCls:'icon-form-undo'" onclick='cancel()'>关闭</a>
			</div>
		</div>
	</div>
</body>
</html>
