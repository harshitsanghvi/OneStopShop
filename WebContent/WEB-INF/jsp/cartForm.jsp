<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="cart" action="/OneStopShop/cart/addCart" method="POST">
	<%-- ShippingWeight: <form:label path="shippingWeight"/><br/>
	Description: <form:label path="description"/><br/>
	OrderDetail: <form:label path="orderDetail"/><br/>
	Price: <form:label path="price"/><br/>
	Weight: <form:label path="weight"/><br/>	 --%>
	Id: <form:input path="id"/><br/>	 
	Name: <form:input path="name"/><br/>	 
	Price: <form:input path="price"/><br/>	 
	Quantity: <form:input path="quantity"/><br/>	 
	
	
	<input type="submit" value="Add TO Cart"/>

</form:form>
</body>
</html>