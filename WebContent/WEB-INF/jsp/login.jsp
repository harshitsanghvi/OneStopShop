<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form id="login-form" method="post" action="verify"
	commandName="login" role="form">
	<div class="form-group">
		<form:input path="uname" type="text" name="uname" id="uname"
			tabindex="1" class="form-control" placeholder="Username" />
		<!-- 															find way to add "required" tag later  -->
	</div>
	<div class="form-group">
		<form:input path="password" type="password" name="password"
			id="password" tabindex="2" class="form-control"
			placeholder="Password" />
	</div>
	<div class="form-group">
		<div class="row">
			<div class="col-sm-6 col-sm-offset-3">
				<input type="submit" name="login-submit" id="login-submit"
					tabindex="4" class="form-control btn btn-login" value="Log In">
			</div>
		</div>
	</div>
</form:form>
