<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <!-- Header -->
    <div class="container mt-4 d-flex justify-content-between align-items-center">
        <h2 class="mb-0">${book.title}</h2>
        <a href="/books">Back to the Shelves</a>
    </div>

    <div class="container mt-5">
		<h4><b><span class="text-danger">${user.name}</span> read <span class="text-info">${book.title}</span> by <span class="text-success">${book.author}</span> </b></h4>
		
		<p class="mt-5">Here are ${user.name}'s thoughts</p>
		<p class="mt-5 border border-dark p-3"><b>${book.thoughts}</b></p>

	</div>

</body>
</html>