<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<h1>${title }</h1>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring-form"
	uri="http://www.springframework.org/tags/form"%>

<h1>Hello Admin !!</h1>
<hr>

<div>

	<a class="btn btn-default" href="${pageContext.request.contextPath}/home"> Logout</a><br>
	
	
	<c:url var="myaction" value="/question/addSingleQues"></c:url>
	<spring-form:form action="${myaction}" method="post" modelAttribute="question">

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
		<spring-form:errors path="questionSubject" cssClass="error"></spring-form:errors>

		<br>Upload a Question:
<spring-form:input path="questionDesc" />
		<br>
		<spring-form:errors path="questionDesc" cssClass="error"></spring-form:errors>

		<br>Enter first option:
<spring-form:input path="optionFirst" />
		<br>
		<spring-form:errors path="optionFirst" cssClass="error"></spring-form:errors>

		<br>Enter second option:
<spring-form:input path="optionSecond" />
		<br>
		<spring-form:errors path="optionSecond" cssClass="error"></spring-form:errors>

		<br>Enter the third option:
<spring-form:input path="optionThird" />
		<br>
		<spring-form:errors path="optionSecond" cssClass="error"></spring-form:errors>

		<br>Enter the fourth option:
<spring-form:input path="optionFourth" />
		<br>
		<spring-form:errors path="optionFourth" cssClass="error"></spring-form:errors>

		<br>Enter the correct option:
<spring-form:input path="correctOption" />
		<br>
		<spring-form:errors path="correctOption" cssClass="error"></spring-form:errors>

		<br>
		<input type="submit" value="Add Question" />

	</spring-form:form>

</div>
