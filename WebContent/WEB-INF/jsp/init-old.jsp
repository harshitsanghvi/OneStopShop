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
	<div class="intro-header">
		<div class="container">

			<div class="row">
				<div class="col-lg-12">
					<div class="intro-message">
						<h1>OneStopShop</h1>
						<h3>Your one stop for anything and everything.</h3>
						<hr class="intro-divider">

						<div class="container">
							<div class="row">
								<div class="col-md-6 col-md-offset-3">
									<div class="panel with-nav-tabs panel-default">
										<div class="panel-heading">
											<ul class="nav nav-tabs">
												<li class="active"><a href="#tab1default"
													id="login-form-link" data-toggle="tab">Login</a></li>
												<li><a href="#tab2default" id="register-form-link"
													data-toggle="tab">Register</a></li>
											</ul>
										</div>
										<div class="panel-body">
											<div class="tab-content">
												<div class="col-lg-12 tab-pane fade in active"
													id="tab1default">
													<iframe src="login"></iframe>
												</div>
												<div class="col-lg-12 tab-pane"
                                                    id="tab2default">
													<iframe src="register"></iframe>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>

		</div>
	</div>
	<!-- /.intro-header -->

	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>