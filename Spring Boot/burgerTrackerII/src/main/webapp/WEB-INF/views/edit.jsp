<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Burger</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="container mt-5">
    <div>
        <h2 class="mb-4 text-primary">Edit Burger</h2>

        <form:form action="/burgers/${burger.id}/update" method="post" modelAttribute="burger">
            <input type="hidden" name="id" value="${burger.id}" />

            <div class="mb-3">
                <label for="burgerName" class="form-label">Burger Name</label>
                <form:input path="burgerName" cssClass="form-control" id="burgerName" />
                <form:errors path="burgerName" cssClass="text-danger" />
            </div>

            <div class="mb-3">
                <label for="restaurantName" class="form-label">Restaurant Name</label>
                <form:input path="restaurantName" cssClass="form-control" id="restaurantName" />
                <form:errors path="restaurantName" cssClass="text-danger" />
            </div>

            <div class="mb-3">
                <label for="rating" class="form-label">Rating (0 to 5)</label>
                <form:input path="rating" type="number" cssClass="form-control" min="0" max="5" id="rating" />
                <form:errors path="rating" cssClass="text-danger" />
            </div>

            <div class="mb-3">
                <label for="notes" class="form-label">Notes (min 3 characters)</label>
                <form:textarea path="notes" cssClass="form-control" rows="3" id="notes" />
                <form:errors path="notes" cssClass="text-danger" />
            </div>

            <button type="submit" class="btn btn-success">Update Burger</button>
        </form:form>
    </div>
</body>
</html>
