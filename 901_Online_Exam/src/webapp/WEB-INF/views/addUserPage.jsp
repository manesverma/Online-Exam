<h1>${title }</h1>
<hr>
|
<a href="user/userList"> List All User</a>
|
<a href="home"> Home Page</a>
<hr>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring-form"
	uri="http://www.springframework.org/tags/form"%>

<hr>
<h3>${msg }</h3>
<hr>
<div><!-- private Integer id;
	private String firstName;
	private String lastName;
	private String email; -->

	<c:url var="myaction" value="/user/addUser"></c:url>
	<spring-form:form action="${myaction}" method="post"
		modelAttribute="user">
	Enter User Id:<spring-form:input path="id" />
		<br />
		<!-- login.setUsername -->
		<spring-form:errors path="id" cssClass="error"></spring-form:errors>
	
	Enter FirstName:<spring-form:input path="firstName" />
		<br />
		<!-- login.setUsername -->
		<spring-form:errors path="firstName" cssClass="error"></spring-form:errors>
	
	Enter LastName:<spring-form:input path="lastName" />
		<br />
		<!-- login.setUsername -->
		<spring-form:errors path="lastName" cssClass="error"></spring-form:errors>
	
	Enter Email :<spring-form:input path="email" />
		<br />
		<!-- login.setPassword -->
		<spring-form:errors path="email" cssClass="error"></spring-form:errors>

		<input type="submit" value="Add User" />
	</spring-form:form>

</div>