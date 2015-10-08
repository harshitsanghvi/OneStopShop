<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<!-- My Style -->
<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
</head>
<body>
Welcome!
<div id="item" class="item">
	<h2>${title}</h2>
	<h4>${description}</h4>
	<img id="${image}" src="../../img/coconuts.jpg" width="200" height="200" alt="Item image">
	<p>price: $${price}</p>
	<input type="button" name="purchase" id="${item}PurchaseButton" class="form-control btn btn-login" value="Purchase">
</div>
</body>
</html>