<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link href="/OneStopShop/css/bootstrap.min.css" rel="stylesheet">
<link href="/OneStopShop/css/font-awesome.min.css" rel="stylesheet">
<link href="/OneStopShop/css/prettyPhoto.css" rel="stylesheet">
<link href="/OneStopShop/css/price-range.css" rel="stylesheet">
<link href="/OneStopShop/css/animate.css" rel="stylesheet">
<link href="/OneStopShop/css/main.css" rel="stylesheet">
<link href="/OneStopShop/css/responsive.css" rel="stylesheet">


<form:form id="login-form" method="post" action="verify"
	commandName="login" role="form">
	

	<div class="form-group">
		<form:input path="uname" type="text"
			tabindex="1" class="form-control" placeholder="Username" />
			<form:errors path="uname"/>
	</div>
	<div class="form-group">
		<form:input path="password" type="password"
			tabindex="2" class="form-control" placeholder="Password" />
			<form:errors path="password"/>
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

