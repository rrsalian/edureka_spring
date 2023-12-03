<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Customer City</th>
		</tr>
		<c:forEach items="${customers}" var="customer">
			<tr>
				<td>${customer.customerId}</td>
				<td>${customer.customerName}</td>
				<td>${customer.customerCity}</td>
			</tr>
		</c:forEach>	
	</table>
</body>
</html>