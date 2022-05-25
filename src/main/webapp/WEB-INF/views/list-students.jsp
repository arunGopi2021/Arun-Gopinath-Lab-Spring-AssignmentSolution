<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- Adding the JSTL tags -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<!DOCTYPE html>
<html>
<head>

<!-- Add the meta tags -->
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Add the bootstrap css -->
<link href="<c:url value="/static/css/bootstrap.min.css" />" rel="stylesheet"> 


<title>students</title>
</head>
<body>

<div class="container">
<br>
<h3>Student Directory</h3>
<hr>
<p>Click this <a href="/RegistrationAppSecure/logout" class="link-info" >link</a> to logout from the application.</p>
<hr>




<table class="table table-bordered table-striped">
	<thead class="">
		<tr>
			<th colspan="4"><a href="/RegistrationAppSecure/studentrecords/add" class="btn btn-primary btn-sm mb-3">Add Student</a></th>
		</tr>
		<tr>
			<th>Name</th>
			<th>Department</th>
			<th>Country</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="tempStudent">
			<tr>
				<td><c:out value="${tempStudent.name}"></c:out></td>
				<td><c:out value="${tempStudent.department}"></c:out></td>
				<td><c:out value="${tempStudent.country}"></c:out></td>
				<td>
				<a href="/RegistrationAppSecure/studentrecords/update?id=${tempStudent.id }" class="btn btn-info btn-sm mb-2">Update</a>
				<a href="/RegistrationAppSecure/studentrecords/delete?id=${tempStudent.id}" class="btn btn-secondary btn-sm mb-2">Delete</a>	
				</td>
			</tr>
		</c:forEach>
	</tbody>



</table>
</div>

<!-- Add the bootstrap js, jquery and  popper -->
<script src="<c:url value="/static/js/jquery.min.js" />"></script>
<script src="<c:url value="/static/js/popper.min.js" />"></script>
<script src="<c:url value="/static/js/bootstrap.min.js" />"></script>
</body>
</html>