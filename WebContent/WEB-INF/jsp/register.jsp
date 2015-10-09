<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<!-- My Style -->
<link href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet">
</head>
<body>
	<form:form id="register-form" method="post" action="addUser"
		commandName="register" role="form">
		<div class="form-group">
			<form:input path="uname" type="text" name="uname" id="uname"
				tabindex="1" class="form-control" placeholder="Username" />
		</div>
		<div class="form-group">
			<form:input path="password" type="password" tabindex="2"
				class="form-control" placeholder="Password" />
		</div>
		<div class="form-group">
			<input type="password" name="confirm-password" id="confirm-password"
				tabindex="3" class="form-control" placeholder="Confirm Password"
				onblur="match()">
		</div>
		<div class="form-group">
			<form:input path="firstName" type="text" tabindex="4"
				class="form-control" placeholder="First Name" />
		</div>
		<div class="form-group">
			<form:input path="lastName" type="text" tabindex="5"
				class="form-control" placeholder="Last Name" />
		</div>
		<div class="form-group">
			<form:input path="phone" type="number" tabindex="6"
				class="form-control" placeholder="Phone Number" />
		</div>
		<div class="form-group">
			<form:input path="addressLineOne" type="text" tabindex="7"
				class="form-control" placeholder="Address Line One" />
		</div>
		<div class="form-group">
			<form:input path="addressLineTwo" type="text" tabindex="8"
				class="form-control" placeholder="Address Line Two" />
		</div>
		<div class="form-group">
			<form:input path="city" type="text" tabindex="9" class="form-control"
				placeholder="City" />
		</div>
		<div class="form-group">
			<form:input path="state" type="text" tabindex="10"
				class="form-control" placeholder="State" />
		</div>
		<div class="form-group">
			<form:input path="country" type="text" tabindex="11"
				class="form-control" placeholder="Country" />
		</div>
		<div class="form-group">
			<form:input path="zip" type="text" name="zip" id="zip" tabindex="12"
				class="form-control" placeholder="Zip Code" />
		</div>
		<div class="form-group">
			<div class="row">
				<div class="col-sm-6 col-sm-offset-3">
					<input type="submit" name="register-submit" id="register-submit"
						tabindex="7" class="form-control btn btn-register"
						value="Register Now">
				</div>
			</div>
		</div>
	</form:form>
	<!-- /.intro-header -->

	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>