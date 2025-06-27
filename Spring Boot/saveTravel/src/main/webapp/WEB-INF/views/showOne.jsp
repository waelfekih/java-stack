<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Expense Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="container mt-5">
	<div class="d-flex justify-content-between">
		<h2 class="text-primary mb-4">Expense Details</h2>
		<a href="/expenses">Go Back</a>
	</div>
    


    <div class="card">
        <div class="card-body">
            <h5 class="card-title">${travel.expense}</h5>
            <p class="card-text"><strong>Vendor:</strong> ${travel.vendor}</p>
            <p class="card-text"><strong>Amount:</strong> $${travel.amount}</p>
            <p class="card-text"><strong>Description:</strong> ${travel.description}</p>
        </div>
    </div>

</body>
</html>
