

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring-form"
	uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 

<title>Login Page</title>
<style type="text/css">
.error {
	color: red;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body bgcolor="lightblue">
	<h1>User Login Page</h1>
	<hr>
	<h3>${msg}</h3>
	<h3>${error}</h3>
	<hr>
	<div>
		<%@ taglib prefix="spring-form" 
			uri="http://www.springframework.org/tags/form"%>
		<c:url var="myaction" value="/login/checkLogin"></c:url>
		<spring-form:form action="${myaction}" method="post"
			modelAttribute="loginObj">
	Enter Role:<spring-form:select path="loginRole" >
					<spring-form:option value="NONE" label="---SELECT---"></spring-form:option>
					<spring-form:option value="user"/>
					<spring-form:option value="admin"/>
				</spring-form:select>
			<br />
			<!-- login.setUsername -->
			<spring-form:errors path="loginRole" cssClass="error"></spring-form:errors>
			
	Enter User Email:<spring-form:input path="loginUserEmail" />
			<br />
			<!-- login.setUsername -->
			<spring-form:errors path="loginUserEmail" cssClass="error"></spring-form:errors>
	
	Enter Password :<spring-form:input path="loginPassword" />
			<br />
			<!-- login.setPassword -->
			<spring-form:errors path="loginPassword" cssClass="error"></spring-form:errors>

			<input type="submit" value="Login" />
		</spring-form:form>

<h3><a href="forgotPassword">Forgot Password </a></H3>
	</div>
</body>
</html>