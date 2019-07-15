<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>Register</h1>
<form action="user_detail" method="post">
			<table style="with: 50%">
				<tr>
					<td>Full name</td>
					<td><input type="text" name="full_name" /></td>
				</tr>
                <tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact" /></td>
				</tr>
					
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
                <tr>
                <td>City</td>
					<td><input type="text" name="city" /></td>
				</tr>
                <tr>

					<td>State</td>
					<td><input type="text" name="State" /></td>
				
</tr>
 <tr>

					<td>Dob</td>
					<td><input type="date" name="dob" /></td>
				
</tr>
 <tr>

					<td>Year of Completion</td>
					<td><input type="date" name="yoc" /></td>
				

</tr></table>
			<button type="button" allign="center" >Register</button></form>

  <div class="form-group">
                            <div class="g-recaptcha" data-sitekey="6LfKURIUAAAAAO50vlwWZkyK_G2ywqE52NU7YO0S" data-callback="verifyRecaptchaCallback" data-expired-callback="expiredRecaptchaCallback"></div>
                            <input class="form-control d-none" data-recaptcha="true" required data-error="Please complete the Captcha">
                            <div class="help-block with-errors"></div>
                        </div>
</body>
</html>