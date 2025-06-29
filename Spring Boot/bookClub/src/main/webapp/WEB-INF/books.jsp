<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Club Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4 d-flex justify-content-between align-items-center">
        <h2>Welcome, ${user.name}</h2>
        <a href="/logout" class="btn btn-danger">Logout</a>
    </div>

    <div class="container mt-3 d-flex justify-content-between align-items-center">
        <p class="mb-0">Books from everyone's shelves</p>
        <a href="/books/new" class="btn btn-primary">+ Add a book to my shelf!</a>
    </div>

    <div class="container mt-4">
        <table class="table table-striped table-hover">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <th>Author Name</th>
                    <th>Posted By</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="book" items="${books}">
                    <tr>
                        <td>${book.id}</td>
                        <td><a href="/books/${book.id}">${book.title}</td>
                        <td>${book.author}</td>
						<td><c:out value="${book.user.name}"/></td>
                    </tr>
                </c:forEach>
            </tbody> 
        </table>
    </div>
</body>
</html>
