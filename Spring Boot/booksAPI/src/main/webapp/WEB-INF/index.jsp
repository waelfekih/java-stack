<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head><title>All Books</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
    <h1 class="container text-center mt-3">All Books</h1>
	
	<div>
		<table class="container table table-striped mt-5">
			<thead>
				<tr class="text-center">
					<th>Title</th>
					<th>Description</th>
					<th>Language</th>
					<th>Number of Pages</th>
					<th>Show</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${books}">
					<tr class="text-center">
				    	<td>${book.title}</td>
				        <td>${book.description}</td>
				        <td>${book.language}</td>
				        <td>${book.numberOfPages}</td>
				        <td><a class="btn btn-sm btn-info" href="/books/${book.id}">View Book Details</a></td>
				    </tr>
				</c:forEach>
			</tbody>
				
			

	</div>
	
</body>
</html>