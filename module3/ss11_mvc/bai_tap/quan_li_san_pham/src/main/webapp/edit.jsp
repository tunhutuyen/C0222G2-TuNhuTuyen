
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
    <h2>Create Product</h2>
    <h2>Edit Product</h2>
    <p>
        <c:if test='${message != null}'>
    <h2><span>${"message"}</span></h2>
    </c:if>
    </p>
    <p>
        <a href="/product">Back to customer list</a>
    </p>
    <form action="" method="post">
        <div class="mb-3 mt-3">
            <label >Name product: </label>
            <input type="text" class="form-control" id="name" name="nameProduct" value="${product.nameProduct}">
        </div>
        <div class="mb-3 mt-3">
            <label >Cost product:</label>
            <input type="text" class="form-control" id="price" name="priceProduct" value="${product.priceProduct}">
        </div>
        <div class="mb-3 mt-3">
            <label >Detail product:</label>
            <input type="text" class="form-control" id="detail" name="detailProduct" value="${product.detailProduct}">
        </div>
        <div class="mb-3 mt-3">
            <label > Producer:</label>
            <input type="text" class="form-control" id="producer" name="producer" value="${product.producer}">
        </div>

        <button type="submit" class="btn btn-primary">Update</button>
    </form>
</div>
</body>
</html>
