<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="EN">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
</head>

<body>
<!-- thus modelAttribute will bind the form data to modelAttribute in the controller -->
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" /> <br> <br>
		Last Name: <form:input path="lastName" /> <br> <br>
		Age: <form:input path="age" /> <br> <br> 
		Postal Code: <form:input type="text" path="postalCode" /> <br> <br> 
		Course Code: <form:input path="courseCode" /> <br> <br>
		<form:button type="submit">Submit</form:button>
	</form:form>
</body>
</html>