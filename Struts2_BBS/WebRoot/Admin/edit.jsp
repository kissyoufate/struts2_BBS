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
编辑
<hr>
<form action="/Struts2_BBS/admin/editHandle" method="post">
	<input type="hidden" name="id" value='<s:property value="artic.id"/>'>
	文章名字:<input type="text" name="name" value='<s:property value="artic.name"/>'><br>
	文章内容:<input type="text" name="description" value='<s:property value="artic.description"/>'><br>
	<input type="submit" value="保存">
</form>
</body>
</html>