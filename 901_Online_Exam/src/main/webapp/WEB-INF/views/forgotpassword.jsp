<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reset Password</title>
</head>
<body>
<center>
            <form action="#" th:action="@{/forgot-password}" th:object="${user}" method="post">
                <table>
                    <tr>
                        <td><label for="emailId">Email</label></td>
                        <td><input th:field="*{emailId}" type="text" name="emailId"></input></td>
                    </tr>
                    <tr>
                        <td><input type="reset" value="Clear"/></td>
                        <td><input type="submit" value="Reset Password"></input></td>
                    </tr>
                </table>
            </form>
        </center>
</body>
</html>