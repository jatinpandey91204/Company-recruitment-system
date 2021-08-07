<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Create an account</title>


<style>
h3 {text-align: center;}
</style>
</head>

<body>
<U><Bold><h3>Register</h3></Bold></U>
	<form id="regForm"  action="./registerdone"
		method="post" align="center"> 
		
		
		<table style="width: 50%" align="center">
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstname" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastname" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>Phone No</td>
				<td><input type="text" name="phone" /></td>
			</tr>
		</table>
		<div align="center">
			<input type="submit" value="Register">
			<a href="index.jsp">Home</a>
		</div>
	</form>
</body>
</html>
