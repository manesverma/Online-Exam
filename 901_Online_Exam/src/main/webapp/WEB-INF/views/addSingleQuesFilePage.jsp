<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
  <h1>Hello Admin !!</h1><hr>
  
  <%@ taglib prefix="spring-form" uri="http://www.springframework.org/tags/form"%>
<a class="btn btn-default" href="${pageContext.request.contextPath}/home"> Logout</a><br>

<spring-form:form method="POST" action="" 
                                enctype="multipart/form-data" accept=".xlsx, .xls, .csv">
<br>Upload a Question File: <input type="file" name="file" id="fileUpload">
<br>
<input type="submit" value="Upload"  id="upload"  onclick="Upload()"/>

<script type="text/javascript" >
</script>
</spring-form:form>


