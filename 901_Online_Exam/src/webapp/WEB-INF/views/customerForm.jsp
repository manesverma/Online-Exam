
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring-form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Save Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>Customer Form</h1>
	<hr>
	<a href="${pageContext.request.contextPath }/home"> Home Page</a>
	<hr>
	<c:url var="myaction" value="/cust/saveCust"></c:url>
	<spring-form:form action="${myaction}" method="post"
		modelAttribute="customer">
		<table>
			<c:if test="${!empty customer.name}">
				<tr>
					<td><spring-form:label path="customerId">
							<spring:message text="Customer Id" />
						</spring-form:label></td>
					<td><spring-form:input path="customerId" readonly="true"
							size="8" disabled="true" /> <spring-form:hidden
							path="customerId" /></td>
				</tr>
			</c:if>
			<tr>
				<td>Name:</td>
				<td><spring-form:input path="name" /></td>
				<td><spring-form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><spring-form:input path="email" /></td>
				<td><spring-form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><spring-form:input path="age" /></td>
				<td><spring-form:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><spring-form:select path="gender">
						<spring-form:option value="" label="Select Gender" />
						<spring-form:option value="MALE" label="Male" />
						<spring-form:option value="FEMALE" label="Female" />
					</spring-form:select></td>
				<td><spring-form:errors path="gender" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><spring-form:input path="birthday" placeholder="MM/dd/yyyy" /></td>
				<td><spring-form:errors path="birthday" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><spring-form:input path="phone" /></td>
				<td><spring-form:errors path="phone" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${!empty customer.name}">
						<input type="submit" value="Edit Customer" />
					</c:if> <c:if test="${empty customer.name}">
						<input type="submit" value="Add Customer" />
					</c:if></td>
			</tr>
		</table>
	</spring-form:form>
	<hr>
	List Of Customers
	<hr>
	<c:if test="${!empty customerList}">
		<table border="1">
			<tr>
				<th>Customer Id</th>
				<th>Name</th>
				<th>Email Id</th>
				<th>Age</th>
				<th>Gender</th>
				<th>Birthday</th>
			</tr>
			<c:forEach items="${customerList}" var="customer">
				<tr>
					<td>${customer.customerId}</td>
					<td>${customer.name}</td>
					<td>${customer.email }</td>
					<td>${customer.age }</td>
					<td>${customer.gender }</td>
					<td><fmt:formatDate pattern="dd-MMM-yyyy"
							value="${customer.birthday }" /></td>
					<td><a
						href="<c:url value='/cust/editCustomer/${customer.customerId}' />">Edit</a></td>
					<td><a
						href="<c:url value='/cust/deleteCustomer/${customer.customerId}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>