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


<title>add-update Student</title>
</head>
<body>

<div class="container">



<form action="/RegistrationAppSecure/studentrecords/save" method="post">
	<p class="form-group h4 mb-4" >Student Registration Form</p>
	<!-- Add hidden form field to handle update -->
	<input type="hidden" name="id" value="${student.id}" />
	
	<div class="form-inline ">
		<input type="text" name="name" value="${student.name}" class="form-control mb-4 col-4" placeholder="name"/>
	</div>
	
	<div class="form-inline">
		<input type="text" name="department" value="${student.department}" class="form-control  mb-4 col-4" placeholder="department"/>
	</div>
	
	<div class="form-inline">
		<input type="text" name="country" value="${student.country}" class="form-control  mb-4 col-4" placeholder="country"/>
	</div>
	
	<button type="submit" class="btn btn-info col-2">Save</button>
</form>
<hr>

<a href="/RegistrationAppSecure/studentrecords/list" class="link-info">Back to student directory</a>
</div>

<!-- Add the bootstrap js, jquery and  popper -->
<script src="<c:url value="/static/js/jquery.min.js" />"></script>
<script src="<c:url value="/static/js/popper.min.js" />"></script>
<script src="<c:url value="/static/js/bootstrap.min.js" />"></script>
</body>
</html>