<!DOCTYPE html>
<html>
<title>
	Spring MVC 
</title>

<body>
	<div align="center">
		<h3>
			<%if(request.getAttribute("path") != null){%>
    			Your path is <font color="maroon">${path}</font>.
    		<%} else {%>
    			Hello new user, <font color="blue">${name}</font>!<br>
				Your password is <font color="green">${password}</font>.
    		<%}%>
		</h3>
	</div>
${time}
</body>
</html>