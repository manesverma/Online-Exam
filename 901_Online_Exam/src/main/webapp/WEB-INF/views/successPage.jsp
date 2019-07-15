<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <script src="/webjars/jquery/jquery.min.js"></script>    
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script><meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body bgcolor="lightgreen">
<h1>${msg}</h1>
<hr>
| <a href="${pageContext.request.contextPath }/home"> Logout</a> 
<hr>
Welcome , ${loginObj.username }
<br>Congratulations! You entered the beautiful world of 
Spring MVC Form :)
</body>
</html>