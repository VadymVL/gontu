<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Hello, this is default page, and now is</h2>
	<h2>${time}</h2>
<br>
	<h1>
		<a href="create">Create new user</a>
	</h1>
<br>
<div style="display:table; text-align:left;">
	<h2>System info:</h2>
	<h2>OS:${osname}</h2>
	<h2>Ver:${osver}</h2>
	<h2>Arch:${osarch}</h2>
</div>
${time}
</center>

<span style="float: right">
    <a href="?lang=en">en</a> 
    <a href="?lang=ru">ru</a>
    <a href="?lang=uk">uk</a> 
    <a href="?lang=ua">ua</a>
</span>
<p><spring:message code="label.registration"/></p>
<p><spring:message code="label.login"/></p>



</body>
</html>