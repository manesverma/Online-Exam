<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>    
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<h1>User List</h1>
<hr>
| <a href="${pageContext.request.contextPath }/home"> Home Page</a> 
<hr>
<%-- <c:if test="${ userList empty }">
	<h2 style="color: red">User Records Not found</h2>
</c:if> --%>
<%-- <c:if test="${userList !empty }"> --%>
	<table>
		<tr>
			<th>User Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Id</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName }</td>
				<td>${user.email }</td>
			</tr>
		</c:forEach>
	</table>
<%-- </c:if> --%>