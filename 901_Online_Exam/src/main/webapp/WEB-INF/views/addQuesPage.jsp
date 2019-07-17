<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
  <h1>Hello Admin !!</h1><hr>
<h3>Today is : ${today }</h3><hr>
<a class="btn btn-default" href="${pageContext.request.contextPath}/home"> Logout</a><br>
<!--  <a class="btn btn-info" href="user/addUserForm">Select Subject</a><br> -->
<a href="${pageContext.request.contextPath}/question/addSingleQues">Add a Single Question</a><br>
<a href="${pageContext.request.contextPath}/question/addSingleQuesFile">Upload a Question File</a>
