<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- this model attribute will bind the form data to model attribute in the controller -->
    <form:form action="processForm" modelAttribute="student">    
        First name : <form:input path="firstname" />
        <br>
        Last name : <form:input path="lastname" />
        <br>
        Age : <form:input path="age" />
        <br>
        Postal Code : <form:input path="postalcode" />
        <br>
        Course Code : <form:input path="coursename" />
        <br>
        <form:button type="submit">Submit</form:button>
    </form:form>
</body>
</html>