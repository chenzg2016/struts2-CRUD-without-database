<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>User List</title>
<style type="text/css">
table {
border: 1px solid black;
border-collapse: collapse;
}
table thead tr th {
border: 1px solid black;
padding: 3px;
background-color: #cccccc;
}
table tbody tr td {
border: 1px solid black;
padding: 3px;
}
</style>
<script type="text/javascript" src="../scripts/jquery-1.7.2.js"></script> 
<script type="text/javascript" src="../scripts/jquery.tablesorter.js"></script> 
<script>
	$(document).ready(function(){ 
	//第一列不进行排序(索引从0开始) 
		$.tablesorter.defaults.headers = {0: {sorter: false}}; 
		$(".tablesorter").tablesorter(); 
	});
	function checkform(){
		var isSelected = {};
		isSelected = document.getElementsByName("ids");
		var count = 0;
		for(var i=0;i<isSelected.length;i++){
		    if(isSelected[i].checked==true){
		    	count ++;
		    }
		}
		if(count > 0){
			return true;
		}else{
			alert("请选中需要删除的数据！");
			return false;
		}
	}
</script>
</head>
<body> 
<h2>User List</h2>
<s:form action="Remove" theme="simple">
	<table cellspacing="0"  id="myTable" class="tablesorter">
	<thead>
		<tr>
			<th>Select</th>
			<th>ID</th>
			<th>loginname</th>
			<th>Password</th>
			<th>Name</th>
			<th>Operation</th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="users">
			<tr>
				<td><input type="checkbox"  name="ids" value='<s:property value="id" />' /></td>
				<td><s:property value="id" /></td>
				<td><s:property value="loginname" /></td>
				<td><s:hidden value="password" /></td>
				<td><s:property value="name" /></td>
				<td>
					<a href='<s:url action="Edit"><s:param name="id" value="id" /></s:url>'>
					修改
					</a>
					&nbsp;
					<a href='<s:url action="Remove"><s:param name="id" value="id" /></s:url>'>
					删除
					</a>
				</td>
			</tr>
		</s:iterator>
	</tbody>
	</table>
	<s:submit value="批量删除" onclick = "return checkform()"/><a href="Edit.jsp">新增</a>
</s:form> 
</body>
</html>