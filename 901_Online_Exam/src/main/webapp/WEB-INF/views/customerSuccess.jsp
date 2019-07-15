<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib prefix="fmt" 
uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<html>
<head>	<title>Customer Saved Successfully</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <script src="/webjars/jquery/jquery.min.js"></script>    
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h1>	Customer Saved Successfully.</h1>
<hr>
| <a href="${pageContext.request.contextPath}/cust/addCustomerForm"> Customer Form</a> <!-- customer controllers -->
<hr>
<strong>Customer Name:${customer.name}</strong><br>
<strong>Customer Email:${customer.email}</strong><br>
<strong>Customer Age:${customer.age}</strong><br>
<strong>Customer Gender:${customer.gender}</strong><br>
<strong>Customer Birthday:
<fmt:formatDate value="${customer.birthday}" 
type="date" /></strong><br>

</body>
</html>
