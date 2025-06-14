<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head><title>Fruit List</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
    <h1 class="container text-center mt-3">Fruit Store</h1>
	<div class=container text-center>
		<table class="table table-striped mt-5">
				<thead class="text-center ">
					<tr>
						<th>Name</th>
						<th>Price ($)</th>
					</tr>
				</thead>
				
				<tbody class="text-center">
					<c:forEach var="fruit" items="${fruits}">
						<tr>
					    	<td>${fruit.name}</td>
					    	<td>${fruit.price}</td>
					    </tr>
					</c:forEach>
				</tbody>
	</div>
	
    
</body>
</html>
