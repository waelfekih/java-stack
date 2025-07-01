<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2>Edit Book</h2>

    <form:form action="/books/${book.id}/edit" method="post" modelAttribute="book">
        <div class="mb-3">
            <form:label path="title" class="form-label">Title</form:label>
            <form:input path="title" class="form-control" />
            <form:errors path="title" class="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="author" class="form-label">Author</form:label>
            <form:input path="author" class="form-control" />
            <form:errors path="author" class="text-danger"/>
        </div>

        <div class="mb-3">
            <form:label path="thoughts" class="form-label">Thoughts</form:label>
            <form:textarea path="thoughts" class="form-control" />
            <form:errors path="thoughts" class="text-danger"/>
        </div>

        <button type="submit" class="btn btn-primary">Update</button>
    </form:form>
</div>

</body>
</html>
