<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Book Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-5">
        
    	<h2>${book.title}</h2>
            
        <h6>${book.description}</h6>
            
                <h6>${book.language}</h6>
            
                <h6>${book.numberOfPages}</h6>
            
        <a href="/books" class="btn btn-secondary mt-3">Back to All Books</a>
    </div>
</body>
</html>
