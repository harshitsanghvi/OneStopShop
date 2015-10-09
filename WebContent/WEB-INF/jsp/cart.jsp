<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your Cart</h1>
	
	
	<table cellpadding="10px" border="1" style="border-collapse: collapse">
	<c:forEach items="${sessionScope[cart]}" var="c">
		<tr>
		<%-- <td>${c.id}</td>
		<td>${c.title}</td>
		<td>${c.description}</td>
		<td>${c.price}</td>
		<td>${c.image}</td>
		<td>${c.orderDetail}</td>
		<td>${c.weight}</td> --%>
		<td>${c.id}</td>
		<td>${c.name}</td>
		<td>${c.price}</td>
		<td>${c.quantity}</td>
		
		<td>
		<a href= "./remove.htm?id=${c.id}" onclick="return confirm("Are you sure?")"> Remove </a>
		</td>
		</tr>
	</c:forEach>
	<tr>
	<td colspan="2">
	Total : "${sessionScope[total]}"
	</table>
	
		<a href= "/OneStopShop/cart/form"> Continue Shopping</a> 
	
</body>
</html>