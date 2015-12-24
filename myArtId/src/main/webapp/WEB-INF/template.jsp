<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tmp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div id="head">
		<h1>This is head</h1>
	</div>
	<div id="body">
		<div id="left-body">
			<tmp:insertAttribute name="lb" />
		</div>
		<div id="right-body">
			<tmp:insertAttribute name="rb" />
		</div>
	</div>
	<div id="footer">
		<h2>This is footer</h2>
	</div>
</body>
</html>