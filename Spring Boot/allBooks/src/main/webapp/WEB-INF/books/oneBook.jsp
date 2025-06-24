<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head><title>${book.title}</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">

	
</head>
<body>
	<div class="container">
		<h2 class="container mt-3 mb-5">${book.title}</h2>
			
		<p><b>Description : </b> ${book.description} </p>
		<p><b>Language : </b> ${book.language} </p>
		<p><b>Number of Pages : </b> ${book.numberOfPages} </p>
		
	</div>
    
	

	
	
	
	
</body>
</html>