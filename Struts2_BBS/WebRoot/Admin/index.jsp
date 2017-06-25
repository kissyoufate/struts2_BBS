<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	后台首页
	<a href="/Struts2_BBS/admin/add">添加文章</a>
	<hr>
	<table border="1" cellpadding="5" cellspacing="0" align="center">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>description</th>
			<th>handle</th>
		</tr>
		<s:iterator value="lists" var="artic">
			<tr>
				<td><s:property value="#artic.id" /></td>
				<td><s:property value="#artic.name" /></td>
				<td><s:property value="#artic.description" /></td>
				<td><button onclick="if(confirm('确认删除么?')){window.location='/Struts2_BBS/admin/delete?id=<s:property value="#artic.id"/>'}">删除</button>| 
					<a href="/Struts2_BBS/admin/edit?id=<s:property value="#artic.id"/>" >编辑</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>