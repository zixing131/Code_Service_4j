 
 
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

	<script src='js/FunctionView.js'></script>

	<div class="easyui-layout" data-options="fit:true">

		<div id='center' data-options="region:'center',border:false">

			<form id="functionForm" class='view-form' method="post">
				<table cellspacing='10'>

					<div id='functionFormPanel' title="Function信息"
						style="width: 100%; font-size: 13px;">     
						             
						   					<tr>
						<td align='right' class='td-label'>描述</td>
						<td><label id='remark' data-ssbtype='text'
							name="remark"></label></td>
					</tr>
					        
						   					<tr>
						<td align='right' class='td-label'>资源标识</td>
						<td><label id='uri' data-ssbtype='text'
							name="uri"></label></td>
					</tr>
					        
						    
					<tr>
						<td align='right' class='td-label'>类型-combobox</td>
						<td><label id='type' data-ssbtype='int'
							name="type"></label></td>
					</tr>
					       
						      
					<tr>
						<td align='right' class='td-label'>排序index</td>
						<td><label id='orderIndex' data-ssbtype='int'
							name="orderIndex"></label></td>
					</tr>
					       
						        
					<tr>
						<td align='right' class='td-label'>创建日期</td>
						<td><label id='createDate' data-ssbtype='date'
							name="createDate"></label></td>
					</tr>
					     
						     					<tr>
						<td align='right' class='td-label'>创建人</td>
						<td><label id='createBy' data-ssbtype='text'
							name="createBy"></label></td>
					</tr>
					        
						       					<tr>
						<td align='right' class='td-label'>最后更新人</td>
						<td><label id='lastUpdateBy' data-ssbtype='text'
							name="lastUpdateBy"></label></td>
					</tr>
					        
						          
					<tr>
						<td align='right' class='td-label'>最后更新时间</td>
						<td><label id='lastUpdateDate' data-ssbtype='date'
							name="lastUpdateDate"></label></td>
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
