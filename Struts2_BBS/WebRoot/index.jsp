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
	前台首页
	<a href="/Struts2_BBS/admin/admin">进入管理后台</a>
	<hr>
	<table border="1" cellpadding="5" cellspacing="0" align="center">
		<tr>
			<th>文章标题</th>
			<th>文章内容</th>
			<th>连接地址</th>
		</tr>
		<s:iterator value="lists" var="artic">
			<tr>
				<td><s:property value="#artic.name" /></td>
				<td><s:property value="#artic.description" /></td>
				<td><a
					href='/Struts2_BBS/index/detail?id=<s:property value="#artic.id"/>'>详情查看</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>