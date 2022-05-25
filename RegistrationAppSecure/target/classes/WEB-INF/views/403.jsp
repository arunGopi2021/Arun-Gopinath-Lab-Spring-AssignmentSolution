<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<body>
	<h1>HTTP Status 403 - Access is denied</h1>
	<h2>${msg}</h2>
	
	
	<p>Click this <a href="/RegistrationAppSecure/studentrecords/list" >link</a> to return to students directory.</p>
	<p>Click this <a href="/RegistrationAppSecure/logout" >link</a> to logout from the application.</p>
</body>
</html>