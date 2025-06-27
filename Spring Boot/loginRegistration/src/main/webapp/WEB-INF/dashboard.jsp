<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Dashboard</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container mt-3">
	<h1>Welcome, <c:out value="${user.username}"/>!</h1>
	<p>This is your dashboard. Nothing to see here yet.</p>
	<p><a href="/logout" class="btn btn-danger">logout</a></p>
</div>

</body>
</html>