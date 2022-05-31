
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="mynavbar">
            <form class="d-flex" method="">
                <input class="form-control me-2" type="text" placeholder="Search" name="search">
                <button class="btn btn-primary" type="button">Search</button>
            </form>
        </div>
    </div>
</nav>
<h2>Search Product</h2>
<a href="/product">Back to product list</a>
<table class="table">
    <tr>
        <th>Id-Product</th>
        <th>Product</th>
        <th>Price</th>
    </tr>
    <c:forEach items="${product}" var="temp">
        <tr>
            <td>${temp.idProduct}</td>
            <td>${temp.nameProduct}</td>
            <td>${temp.priceProduct}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
