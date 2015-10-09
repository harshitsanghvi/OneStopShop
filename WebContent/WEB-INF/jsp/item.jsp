<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${item.title}</title>
</head>
<body>
				<li>
					<tr>
						<td>tacos</td>
						<td><h2>${item.title}</h2></td>
						<td><h4>${item.description}</h4></td>
						<td><img id="image" src="${pageContext.request.contextPath}${item.image}" width="400"
							height="400" alt="Product image" /></td>
						<td><h4>Rs. ${item.price}</h4></td>
						<td><input type="button" name="purchase" id="${item.title}PurchaseButton"
							class="form-control btn btn-login" value="Add to Cart"></td>
					</tr>
				</li>
</body>
</html>