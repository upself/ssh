<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<s:form action="register">
	<s:label>Name</s:label><s:text name="username"></s:text><br>
	<s:label>Sex:</s:label><s:radio list="{'M':'Male','F':'Female'}" listKey="key" listValue="value"></s:radio>
</s:form>
</body>
