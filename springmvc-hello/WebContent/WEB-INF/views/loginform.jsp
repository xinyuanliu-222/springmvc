<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="login.page.title"/></title>
<style>
	span {
		color: red;
	}
</style>
</head>
<body>
<form:form method="post" action="login" modelAttribute="loginForm">
	<form:label path="username" for="username"><spring:message code="login.form.label.username"/></form:label>
	<form:input path="username" />
	<span><form:errors path="username" /></span>
	<br/>
	<form:label path="password" for="password"><spring:message code="login.form.label.password"/></form:label>
	<form:input path="password" />
	<span><form:errors path="password" /></span>
	<br/>
	<input type="submit" value='<spring:message code="login.form.submit"/>' />
</form:form>
</body>
</html>