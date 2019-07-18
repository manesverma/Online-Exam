<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 


<h1>${title }</h1>
<hr>
<a href="${pageContext.request.contextPath}/home"> Home Page</a>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring-form" uri="http://www.springframework.org/tags/form"%>

<h3>${msg }</h3>
<hr>
<div>

	<c:url var="myaction" value="/user/addUser"></c:url>
	<spring-form:form action="${myaction}" method="post"
		modelAttribute="user">
	
	Enter Full Name:<spring-form:input path="userName" />
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
		
	Enter Street :<spring-form:input path="userStreet" />
		<br />
		<spring-form:errors path="userStreet" cssClass="error"></spring-form:errors>
	
	Enter City :<spring-form:input path="userCity" />
		<br />
		<spring-form:errors path="userCity" cssClass="error"></spring-form:errors>
	
	Enter State :<spring-form:input path="userState" />
		<br />
		<spring-form:errors path="userState" cssClass="error"></spring-form:errors>

     Enter Country :<spring-form:input path="userCountry" />
		<br />
		<spring-form:errors path="userCountry" cssClass="error"></spring-form:errors>
	
    Enter Password:<spring-form:password path="userPassword" />
        <br/>
        <spring-form:errors path="userPassword" cssClass="error"></spring-form:errors>
		<input type="submit" value="Register" />
	
	</spring-form:form>

</div>