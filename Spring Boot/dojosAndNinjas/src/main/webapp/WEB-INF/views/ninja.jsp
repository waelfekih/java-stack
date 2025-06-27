<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head><title>Create Ninja</title></head>
<body>
<h2>Create a Ninja</h2>
<form:form method="POST" action="/ninjas/create" modelAttribute="ninja">
    <form:label path="firstName">First Name:</form:label>
    <form:input path="firstName"/><br/>

    <form:label path="lastName">Last Name:</form:label>
    <form:input path="lastName"/><br/>

    <form:label path="age">Age:</form:label>
    <form:input path="age"/><br/>

    <form:label path="dojo">Dojo:</form:label>
    <form:select path="dojo.id">
        <form:options items="${dojos}" itemValue="id" itemLabel="name"/>
    </form:select><br/>

    <input type="submit" value="Create"/>
</form:form>
</body>
</html>
