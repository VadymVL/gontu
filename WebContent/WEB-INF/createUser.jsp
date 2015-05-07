<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<title>
	Spring MVC!
</title>

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
				<input type="text" placeholder="Date birth mm/dd/yyyy" name="dateOfBirth"></input>
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
</div>
<p>
${time}
</body>
</html>