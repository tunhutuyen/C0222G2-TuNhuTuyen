<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 5/31/2022
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
    <h2>Delete Product</h2>
    <h4>Are U sure? U want to delete!</h4>
    <form action="" method="post">
        <div class="mb-3 mt-3">
            <label >Id:</label>
            <input type="text" class="form-control" id="id"  name="idProduct" value="${product.idProduct}">
        </div>
        <div class="mb-3 mt-3">
            <label>Name product: </label>
            <input type="text" class="form-control" id="name" name="nameProduct" value="${product.nameProduct}">
        </div>
        <div class="mb-3 mt-3">
            <label>Cost product:</label>
            <input type="text" class="form-control" id="price" name="priceProduct" value="${product.priceProduct}">
        </div>
        <div class="mb-3 mt-3">
            <label>Detail product:</label>
            <input type="text" class="form-control" id="detail" name="detailProduct" value="${product.detailProduct}">
        </div>
        <div class="mb-3 mt-3">
            <label> Producer:</label>
            <input type="text" class="form-control" id="producer" name="producer" value="${product.producer}">
        </div>

        <button type="submit" class="btn btn-primary">Delete</button>
        <p>
            <a href="/product" style="text-decoration: none">NO Delete</a>
        </p>
    </form>
    <h3>${message}</h3>
</div>
</body>
</html>
