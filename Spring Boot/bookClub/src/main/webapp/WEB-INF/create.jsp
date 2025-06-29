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
        <h2 class="mb-0">Add a Book to Your Shelf</h2>
        <a href="/books">Back to the Shelves</a>
    </div>

    <!-- Form Card -->
    <div class="container mt-5">
        <div>
            <div>
                <form:form action="/books/create" method="post" modelAttribute="book">
                    
                    <!-- Title Field -->
                    <div class="mb-3">
                        <form:label path="title" class="form-label fw-semibold">Title</form:label>
                        <form:input type="text" path="title" class="form-control"/>
                        <form:errors path="title" class="text-danger"/>
                    </div>

                    <!-- Author Field -->
                    <div class="mb-3">
                        <form:label path="author" class="form-label fw-semibold">Author Name</form:label>
                        <form:input path="author" class="form-control"/>
                        <form:errors path="author" class="text-danger"/>
                    </div>

                    <!-- Thoughts Field -->
                    <div class="mb-3">
                        <form:label path="thoughts" class="form-label fw-semibold">My Thoughts</form:label>
                        <form:textarea path="thoughts" class="form-control" rows="4"/>
                        <form:errors path="thoughts" class="text-danger"/>
                    </div>

                    <!-- Submit Button -->
                    <div class="d-grid">
                        <button type="submit" class="btn btn-primary">Create Book</button>
                    </div>

                </form:form>
            </div>
        </div>
    </div>

</body>
</html>
