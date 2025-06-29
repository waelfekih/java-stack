<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login and Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h1 class="text-center mb-3">Book Club</h1>
    <p class="text-center mb-5">A place for friends to share thoughts on books</p>

    <div class="row justify-content-center">
        <!-- Registration Form -->
        <div class="col-md-5">
            <div class=" mb-4">
                <div><h3>Register</h3></div>
                <div >
                    <form:form action="/register" method="post" modelAttribute="newUser" cssClass="needs-validation">
                        <div class="mb-3">
                            <form:label path="name" class="form-label">Name</form:label>
                            <form:input path="name" class="form-control"/>
                            <form:errors path="name" class="text-danger"/>
                        </div>
                        <div class="mb-3">
                            <form:label path="email" class="form-label">Email</form:label>
                            <form:input path="email" class="form-control"/>
                            <form:errors path="email" class="text-danger"/>
                        </div>
                        <div class="mb-3">
                            <form:label path="password" class="form-label">Password</form:label>
                            <form:password path="password" class="form-control"/>
                            <form:errors path="password" class="text-danger"/>
                        </div>
                        <div class="mb-3">
                            <form:label path="confirm" class="form-label">Confirm Password</form:label>
                            <form:password path="confirm" class="form-control"/>
                            <form:errors path="confirm" class="text-danger"/>
                        </div>
                        <button type="submit" class="btn btn-primary w-100">Register</button>
                    </form:form>
                </div>
            </div>
        </div>

        <!-- Login Form -->
        <div class="col-md-5">
            <div>
                <div><h3>Log In</h3></div>
                <div>
                    <form:form action="/login" method="post" modelAttribute="newLogin">
                        <div class="mb-3">
                            <form:label path="email" class="form-label">Email</form:label>
                            <form:input path="email" class="form-control"/>
                            <form:errors path="email" class="text-danger"/>
                        </div>
                        <div class="mb-3">
                            <form:label path="password" class="form-label">Password</form:label>
                            <form:password path="password" class="form-control"/>
                            <form:errors path="password" class="text-danger"/>
                        </div>
                        <button type="submit" class="btn btn-success w-100">Login</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>