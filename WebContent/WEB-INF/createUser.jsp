<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<title>
	Spring MVC!
</title>

<head>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <script>
  $(function() {
    $( "#datepicker" ).datepicker({dateFormat: 'dd.mm.yy'});
  });
  </script>
</head>

<body>
<div align="center">
	<h1>${message}</h1>
		<fieldset style="display:inline; border-radius:1em;">
			<form:errors path="newUser.*" />
			<form action="/springTutorial/welcome/model" method="post">
				<input type="text" placeholder="Your name" name="name"></input>
				<br>
				<input type="password" placeholder="password" name="password"></input>
				<br>
				<input type="text" placeholder="Mobile number" name="mobileNumber"></input>
				<br>
				<input type="text" placeholder="Date birth dd.mm.yyyy" name="dateOfBirth" id="datepicker"></input>
				<br>
				Your skills:
				<br>
				<select name="skills" multiple>
					<option value="Spring MVC">Spring MVC</option>
					<option value="Java">Java</option>
					<option value="Android">Android</option>
					<option value="iOS">iOS</option>
				</select>
				<br>
				<input type="reset"></input>
				<br>
				<input type="submit"></input>
				<br>
			</form>
		</fieldset>
	<p>
	${time}
</div>
</body>
</html>