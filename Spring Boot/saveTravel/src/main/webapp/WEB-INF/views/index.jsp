<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <title>Save Travel</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" 
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" 
          crossorigin="anonymous">
</head>
<body>
    <h1 class="container text-center mt-3 text-primary">Save Travels</h1>

    <!-- TABLE OF TRAVELS -->
    <div>
        <table class="container table table-striped table-bordered mt-5">
            <thead>
                <tr class="text-center">
                    <th>Expense</th>
                    <th>Vendor</th>
                    <th>Amount</th>
					<th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="tr" items="${travels}">
                    <tr class="text-center">
                        <td><a href="/expenses/${tr.id}">${tr.expense}</td>
                        <td>${tr.vendor}</td>
                        <td>
                            <fmt:formatNumber value="${tr.amount}" type="number" minFractionDigits="2" maxFractionDigits="2" />
                        </td>
						<td class="d-flex gap-1 justify-content-center"><a href="/expenses/edit/${tr.id}" class="btn btn-warning">Edit
						<a href="/expenses/delete/${tr.id}" class="btn btn-danger">Delete	
						</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="container text-center mt-3">
        <h3>Add New Expense</h3>
        <form:form action="/expenses" method="post" modelAttribute="travel">
            <p class="mt-2">
                <form:label path="expense">Expense Name:</form:label>
                <form:input type="text" path="expense"/>
                <div class="text-danger">
                    <form:errors path="expense"/>
                </div>
            </p>

            <p class="mt-2">
                <form:label path="vendor">Vendor:</form:label>
                <form:input type="text" path="vendor"/>
                <div class="text-danger">
                    <form:errors path="vendor"/>
                </div>
            </p>

            <p class="mt-2">
                <form:label path="amount">Amount:</form:label>
                <form:input type="number" step="0.01" path="amount"/>
                <div class="text-danger">
                    <form:errors path="amount"/>
                </div>
            </p>

            <p class="mt-2">
                <form:label path="description">Description:</form:label>
                <form:textarea path="description"/>
                <div class="text-danger">
                    <form:errors path="description"/>
                </div>
            </p>

            <input type="submit" value="Submit" class="btn btn-success"/>
        </form:form>
    </div>
</body>
</html>
