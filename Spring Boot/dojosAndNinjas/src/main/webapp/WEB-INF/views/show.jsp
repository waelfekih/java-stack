<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Ninjas</title>
</head>
<body>
    <h1>All Ninjas</h1>
    <table border="1">
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
                <th>Dojo</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${ninjas}" var="ninja">
                <tr>
                    <td>${ninja.firstName}</td>
                    <td>${ninja.lastName}</td>
                    <td>${ninja.age}</td>
                    <td>${ninja.dojo.name}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
