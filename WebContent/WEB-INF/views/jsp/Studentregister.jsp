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
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/validation.css"/>
<title>Create an account</title>


<style>
h3 {text-align: center;}
</style>
</head>

<body>
<div class= "container" >
<U><Bold><h3>Register</h3></Bold></U>
	<form id="regForm"  action="./registerdone"
		method="post" align="center"> 
		
		
	<div>
			<input type="text" name="username" />
			<label for="E" class="ALL">	UserName</label>
				
			</div>
			<div>
			<input type="password" name="password" />
			<label for="E" class="ALL">	Password</label>
				
			</div>
			<div>
			<input type="text" name="firstname" />
			<label for="E" class="ALL">	First Name</label>
				
			</div>
			<div>
			<input type="text" name="lastname" />
			<label for="E" class="ALL">	Last Name</label>
				
			</div>
			<div>
			<input type="text" name="email" />
			<label for="E" class="ALL">Email</label>
				
			</div>
			<div>
			<input type="text" name="address" />
			<label for="E" class="ALL">Address</label>
				
			</div>
			
			<div>
			<input type="text" name="phone" />
			<label for="E" class="ALL">Phone No</label>
				
			</div>
		<div align="center">
			<input type="submit" value="Register">
			<a href="index.jsp">Home</a>
		</div>
	</form>
</body>
</html>
