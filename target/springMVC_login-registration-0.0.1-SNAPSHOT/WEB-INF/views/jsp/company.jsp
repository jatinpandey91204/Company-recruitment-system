<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
    
<html>
<style>
h2 {text-align: center;}

</style>

<body>
	<h2><U>Register Data</U> &emsp;&emsp;&emsp;
	
<a href="index.jsp" class="btn btn-primary" role="button">Home</a> </h2>
	


	<table class="table table-striped" >
		<th>id</th>
		<th>Username</th>
		<th>Password</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Email</th>
		<th>Address</th>
		<th>Phone</th>
		 <th>Update</th>
		<th>Delete</th>
		
		<c:forEach var="user" items="${listEmp}" varStatus="status">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.firstname}</td>
				<td>${user.lastname}</td>
				<td>${user.email}</td>
				<td>${user.address}</td>
				<td>${user.phone}</td>
			 <td><a href="editemp/${user.id}">Edit</a></td> 
			<td><a href="deleteemp/${user.id}">Delete</a></td>  
			</tr>
		</c:forEach>
	</table>

</body>
</html>
    