<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap Core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<!-- My Style -->
<link href="../css/login.css" rel="stylesheet">
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
													<form id="login-form" action="process" method="post"
														role="form">
														<div class="form-group">
															<input type="email" name="email" id="email" tabindex="1"
																class="form-control" placeholder="Email" value=""
																required>
														</div>
														<div class="form-group">
															<input type="password" name="password" id="password"
																tabindex="2" class="form-control" placeholder="Password"
																required>
														</div>
														<div class="form-group text-center" style="display: none">
															<input type="checkbox" tabindex="3" class=""
																name="remember" id="remember"> <label
																for="remember"> Remember Me</label>
														</div>
														<div class="form-group">
															<div class="row">
																<div class="col-sm-6 col-sm-offset-3">
																	<input type="submit" name="login-submit"
																		id="login-submit" tabindex="4"
																		class="form-control btn btn-login" value="Log In">
																</div>
															</div>
														</div>
													</form>
												</div>
												<div class="col-lg-12 tab-pane fade" id="tab2default">
													<form id="register-form" action="register" method="post"
														role="form">
														<div class="form-group">
															<input type="email" name="email" id="email" tabindex="1"
																class="form-control" placeholder="Email Address"
																value="" required>
														</div>
														<div class="form-group">
															<input type="password" name="password" id="rPassword"
																tabindex="2" class="form-control" placeholder="Password"
																required>
														</div>
														<div class="form-group">
															<input type="password" name="confirm-password"
																id="confirm-password" tabindex="3" class="form-control"
																placeholder="Confirm Password" onblur="match()" required>
														</div>
														<div class="form-group">
															<input type="text" name="firstName" id="firstName"
																tabindex="4" class="form-control"
																placeholder="First Name" value="" required>
														</div>
														<div class="form-group">
															<input type="text" name="lastName" id="lastName"
																tabindex="5" class="form-control"
																placeholder="Last Name" value="" required>
														</div>
														<div class="form-group">
															<input type="tel" name="phoneNumber" id="phoneNumber"
																tabindex="6" class="form-control"
																placeholder="Phone Number" value="" required>
														</div>
														<div class="form-group">
															<div class="row">
																<div class="col-sm-6 col-sm-offset-3">
																	<input type="submit" name="register-submit"
																		id="register-submit" tabindex="7"
																		class="form-control btn btn-register"
																		value="Register Now">
																</div>
															</div>
														</div>
													</form>
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
	<script src="../js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>