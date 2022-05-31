<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 5/31/2022
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h2>Detail Product</h2>
<a href="/product">Back to product list</a>
<table class="table">
    <tr>
        <th>Id-Product</th>
        <th>Product</th>
        <th>Price</th>
        <th>Detail</th>
        <th>Producer</th>
    </tr>
    <tr>
        <td>${product.idProduct}</td>
        <td>${product.nameProduct}</td>
        <td>${product.priceProduct}</td>
        <td>${product.detailProduct}</td>
        <td>${product.producer}</td>
    </tr>
</table>
</body>
</html>
