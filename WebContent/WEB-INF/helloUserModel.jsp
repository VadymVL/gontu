<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>
   			Hello new user, <font color="blue">${newUser.name}</font>!<br>
			Your password is <font color="green">${newUser.password}</font>.<br>
			You have born <font color="maroon">${newUser.dateOfBirth}</font>.<br>
			I can call to you by number <font color="orange">${newUser.mobileNumber}</font>.<br>
			And your skills is <font color="skyblue">${newUser.skills}</font>!<br>
		</h3>
		<p>
		${time}
		<br>
		${time2}
		<br>
		${time3}
	</div>
</body>
</html>