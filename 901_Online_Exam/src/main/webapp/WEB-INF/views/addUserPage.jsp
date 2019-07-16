<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 


<h1>${title }</h1>
<hr>
|
<a href="${pageContext.request.contextPath}/home"> Home Page</a>
<hr>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring-form" uri="http://www.springframework.org/tags/form"%>

<hr>
<h3>${msg }</h3>
<hr>
<div>

	<c:url var="myaction" value="/user/addUser"></c:url>
	<spring-form:form action="${myaction}" method="post"
		modelAttribute="user">
	
	Enter User Name:<spring-form:input path="userName" />
		<br />
		<spring-form:errors path="userName" cssClass="error"></spring-form:errors>
	
	Enter Email:<spring-form:input path="userEmail" />
		<br />
		<spring-form:errors path="userEmail" cssClass="error"></spring-form:errors>
	
	Enter Date of Birth:<spring-form:input   path="userDob" />
		<br />
		<spring-form:errors path="userDob" cssClass="error"></spring-form:errors>
	
	Enter Mobile :<spring-form:input path="userMobile" />
		<br />
		<spring-form:errors path="userMobile" cssClass="error"></spring-form:errors>

		<input type="submit" value="Add User" />
	</spring-form:form>

</div>