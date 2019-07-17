<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
  <h1>Hello Admin !!</h1><hr>
  
  <%@ taglib prefix="spring-form" uri="http://www.springframework.org/tags/form"%>
<a class="btn btn-default" href="${pageContext.request.contextPath}/home"> Logout</a><br>

<br>Select a Subject:
<spring-form:select path="questionSubject" >
					<spring-form:option value="NONE" label="---SELECT---"/>
					<spring-form:option value="Java"/>
					<spring-form:option value="PHP"/>
					<spring-form:option value="SQL"/>
					<spring-form:option value="C/C++"/>
					<spring-form:option value="Python"/>
					<spring-form:option value="C#/.Net"/>
				</spring-form:select>
		<br>
<br>Upload a Question File:
<br>Submit

