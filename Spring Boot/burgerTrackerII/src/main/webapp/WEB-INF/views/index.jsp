<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head><title>Burger Tracker II</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
    <h1 class="container text-center mt-3 text-primary">Burger Tracker</h1>
	
	<div>
		<table class="container table table-striped table-bordered mt-5">
			<thead>
				<tr class="text-center">
					<th>Burger Name</th>
					<th>Restaurant Name</th>
					<th>Rating (0 -- 5)</th>
					<th>Edit</th>	
				</tr>
			</thead>
			<tbody>
				<c:forEach var="burger" items="${burgers}">
					<tr class="text-center">
						<td>${burger.burgerName}</td>
						<td>${burger.restaurantName}</td>
						<td>${burger.rating}</td>
						<td><a href="/burgers/${burger.id}/edit" class="btn btn-warning">Edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<div class="container text-center mt-3">
	    <h3>Add New Burger</h3>
	    <form:form action="/burgers" method="post" modelAttribute="burger">
	      
			<p class="mt-2">
				<form:label path="burgerName">Burger Name :</form:label>
				<form:input type="text" path="burgerName"/>
				<div class="text-danger">
					<form:errors path="burgerName"/>
				</div>
				
	        <p class="mt-2">
	            <form:label path="restaurantName">Restaurant Name :</form:label>
	            <form:input type="text" path="restaurantName"/>
				<div class="text-danger">
					<form:errors path="restaurantName"/>
				</div>
	        </p>
	        <p class="mt-2 border-1">
	            <form:label path="rating">Rating :</form:label>
	            <form:input type="number" path="rating"/>
				<div class="text-danger">
					<form:errors path="rating"/>
				</div>
	        </p>
			<p class="mt-2 border-1">
				<form:label path="notes">Notes :</form:label>
				<form:textarea path="notes"/>
				<div class="text-danger">
					<form:errors path="notes"/>
				</div>
			</p>
	        <input type="submit" value="Submit" class="btn btn-success"/>
	    </form:form>    
	</div>
</body>
</html>