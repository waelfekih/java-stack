<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head><title>Create Dojo</title></head>
<body>
<h2>Create a Dojo</h2>
<a href="/ninjas"> Create a Ninja
<form:form method="POST" action="/dojos/create" modelAttribute="dojo">
    <form:label path="name">Name:</form:label>
    <form:input path="name"/>
    <input type="submit" value="Create"/>
</form:form>
</body>
</html>
