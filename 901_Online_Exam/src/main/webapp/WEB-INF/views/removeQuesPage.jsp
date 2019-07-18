<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring-form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete Question Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>    
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script></head>
<body>
<br>
<a class="btn btn-default" href="${pageContext.request.contextPath}/home"> Logout</a><br><hr>
	
	<h1>List Of Questions</h1>
	<hr>

	<c:if test="${!empty questionList}">
		<table border="1">
			<tr>
				 <th>Question Id</th> 
				<th>Question Desc</th>
				<th>Question Subject</th>
				<th>Option First</th>
				<th>Option Second</th>
				<th>Option Third</th>
				<th>Option Fourth</th>
				<th>Correct Option </th>
				<th>Level</th>
			</tr>
			<c:forEach items="${questionList}" var="question">
				<tr>
					<td>${question.questionId}</td>
					<td>${question.questionDesc}</td>
					<td>${question.questionSubject }</td>
					<td>${question.optionFirst}</td>
					<td>${question.optionSecond }</td>
					<td>${question.optionThird }</td>
					<td>${question.optionFourth }</td>
					<td>${question.correctOption }</td>
					<td>${question.questionLevel }</td>
					<td><a
						href="<c:url value='/question/removeQuestion/${question.questionId}' />">Delete</a></td>
					</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>