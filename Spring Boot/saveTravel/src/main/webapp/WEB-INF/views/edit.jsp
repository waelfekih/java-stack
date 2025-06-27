<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Travel</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="container mt-5">
    <div>
        <h2 class="mb-4 text-primary">Edit Travel</h2>

        <!-- FIX: use travel.id, not tr.id -->
        <form:form action="/expenses/update/${travel.id}" method="post" modelAttribute="travel">

            <div class="mb-3">
                <label for="expense" class="form-label">Expense Name</label>
                <form:input path="expense" class="form-control" id="expense" />
                <form:errors path="expense" cssClass="text-danger" />
            </div>

            <div class="mb-3">
                <label for="vendor" class="form-label">Vendor:</label>
                <form:input path="vendor" class="form-control" id="vendor" />
                <form:errors path="vendor" cssClass="text-danger" />
            </div>

            <div class="mb-3">
                <label for="amount" class="form-label">Amount:</label>
                <form:input path="amount" type="number" step="0.01" class="form-control" id="amount" />
                <form:errors path="amount" cssClass="text-danger" />
            </div>

            <div class="mb-3">
                <label for="description" class="form-label">Description:</label>
                <form:textarea path="description" class="form-control" rows="3" id="description" />
                <form:errors path="description" cssClass="text-danger" />
            </div>

            <button type="submit" class="btn btn-success">Update</button>
        </form:form>
    </div>
</body>
</html>
