<!DOCTYPE html>
<html>
<title>
	Spring MVC!
</title>

<body>
<div align="center">
	<h1>${message}</h1>
		<fieldset>
			<form action="/springTutorial/welcome/" method="post">
				<input type="text" placeholder="Your name" name="name"></input>
				<br>
				<input type="password" placeholder="password" name="password"></input>
				<br>
				<input type="submit"></input>
				<br>
			</form>
		</fieldset>
</div>
</body>
</html>