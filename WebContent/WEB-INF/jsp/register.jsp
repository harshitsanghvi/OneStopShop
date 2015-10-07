<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="login" commandName="login">
		<table>
			<tr>
				<td><form:label path="fName">First Name</form:label></td>
				<td><form:input path="fName" /></td>
			</tr>
			<tr>
				<td><form:label path="lName">Last Name</form:label></td>
				<td><form:input path="lName" /></td>
			</tr>
			<tr>
				<td><form:label path="uName">Username</form:label></td>
				<td><form:input path="uName" /></td>
			</tr>
			<tr>
				<td><form:label path="phoneNumber">Phone Number</form:label></td>
				<td><form:input path="phoneNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><form:label path="dob">Date of Birth</form:label></td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>