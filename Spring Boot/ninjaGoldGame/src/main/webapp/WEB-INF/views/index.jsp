<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ninja Gold Game</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">

    <div class="container d-flex justify-content-around">

        <!-- FARM -->
        <form action="${pageContext.request.contextPath}/farm" method="post" class="border border-dark p-3 text-center">
            <h3>Farm</h3>
            <p>Earns (10–20 gold)</p>
            <input name="gold" class="form-control w-auto mx-auto mb-2" type="number" placeholder="Enter gold" required />
            <button class="btn btn-success">Find Gold!</button>
        </form>

        <!-- CAVE -->
        <form action="${pageContext.request.contextPath}/cave" method="post" class="border border-dark p-3 text-center">
            <h3>Cave</h3>
            <p>Earns (5–10 gold)</p>
            <input name="gold" class="form-control w-auto mx-auto mb-2" type="number" placeholder="Enter gold" required />
            <button class="btn btn-success">Find Gold!</button>
        </form>

        <!-- HOUSE -->
        <form action="${pageContext.request.contextPath}/house" method="post" class="border border-dark p-3 text-center">
            <h3>House</h3>
            <p>Earns (2–5 gold)</p>
            <input name="gold" class="form-control w-auto mx-auto mb-2" type="number" placeholder="Enter gold" required />
            <button class="btn btn-success">Find Gold!</button>
        </form>

        <!-- QUEST -->
        <form action="${pageContext.request.contextPath}/quest" method="post" class="border border-dark p-3 text-center">
            <h3>Quest</h3>
            <p>Earns (0–50 gold)</p>
            <input name="gold" class="form-control w-auto mx-auto mb-2" type="number" placeholder="Enter gold" required />
            <button class="btn btn-success">Find Gold!</button>
        </form>

    </div>

    <c:if test="${not empty earnedGold}">
        <div class="alert alert-success mt-3">
            You earned <strong>${earnedGold}</strong> gold!<br />
            New total gold: <strong>${newGold}</strong> at ${timestamp} 
        </div>
    </c:if>

    <c:if test="${not empty message}">
        <div class="alert alert-danger mt-3">${message}</div>
    </c:if>

</body>
</html>
