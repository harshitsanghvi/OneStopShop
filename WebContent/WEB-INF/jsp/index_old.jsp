<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
	<ul class="products">
		<table>
			<c:forEach items="${items}" var="item">
				<li>
					<tr>
						<td><h2>${item.title}</h2></td>
						<td><h4>${item.description}</h4></td>
						<td><a href="item/${item.id}"><img id="image" src="${pageContext.request.contextPath}${item.image}" width="200"
							height="200" alt="Product image" /></a></td>
						<td><h4>Rs. ${item.price}</h4></td>
						<td><input type="button" name="purchase" id="${item.title}PurchaseButton"
							class="form-control btn btn-login" value="Add to Cart"></td>
					</tr>
				</li>
			</c:forEach>
		</table>
	</ul>
</body>
</html>