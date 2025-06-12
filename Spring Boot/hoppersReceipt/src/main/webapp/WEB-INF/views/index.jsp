<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- /src/main/webapp/WEB-INF/views/index.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Receipt</title>
</head>
<body>
    <h1>Costumer Name : ${name}</h1>
    <p>Item Name: ${itemName}</p>
    <p>Price: $${price}</p>
    <p>Description: ${description}</p>
    <p>Vendor: ${vendor}</p>
</body>
</html>
