<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello world!
<form action="register.do" method="post">
	username:<input type="text" name="uname"><br>
	hobby:
	<select name="hobbies">
		<option value=""></option>
		<option value="swim">swim</option>
		<option value="run">run</option>
		<option value="jump">jump</option>		
	</select>
	<br>
	options:
	<input type="checkbox" name="options" value="option1">option1
	<input type="checkbox" name="options" value="option2">option2
	<input type="checkbox" name="options" value="option3">option3
	<br>
	<input type="submit" value="submit">
</form>
</body>
</html>