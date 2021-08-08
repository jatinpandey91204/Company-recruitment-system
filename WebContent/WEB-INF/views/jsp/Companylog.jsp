<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<%--  <link href="<c:url value="/WEB-INF/resources/css/validation.css"/>"/>  --%>
 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/validation.css"/>

<title>Login an account</title>

</head>

<body>
<div class= "container" >
<h1>Login</h1>
	<form id="loginForm" modelAttribute="login" action="./loginP"
		method="post">
		
			
			<div>
			<input type="text" name="username" />
			<label for="E" class="ALL">	UserName</label>
				
			</div>
			<div>
			<input type="password" name="password" />
				<label for="E" class="ALL">Password</label>
				
			</div>
			
		</table>
		
		<div align="center">
			<input type="submit" value=" Login"id="login" name="login">
			 <a href="index.jsp"><button class="button">Home</button></a> 

		</div>
	</form>
	</div>
</body>

</html>
