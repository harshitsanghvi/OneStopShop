<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${item.title}</title>
<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<!-- My Style -->
<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
</head>
<body>
	<ul class="products">
				<li>
						<h2>${item.title}</h2>
						<h4>${item.description}</h4>
						<a href="item/${item.id}"><img id="image" src="${pageContext.request.contextPath}${item.image}" width="200"
							height="200" alt="Product image" /></a>
						<h4>Rs. ${item.price}</h4>
						<input type="button" name="purchase" id="${item.title}PurchaseButton"
							class="form-control btn btn-login" value="Add to Cart">
				</li>
	</ul>
</body>
</html>