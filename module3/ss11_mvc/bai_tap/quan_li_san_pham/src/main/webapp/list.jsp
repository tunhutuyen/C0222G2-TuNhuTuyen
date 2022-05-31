
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <h2>List Product</h2>
    <a href="/product?action=create">Create product</a>
    <table class="table">
        <tr>
            <th>Id-Product</th>
            <th>Product</th>
            <th>Price</th>
<%--            <th>Detail</th>--%>
<%--            <th>Producer</th>--%>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${productList}" var="temp">
            <tr>
                <td>${temp.idProduct}</td>
                <td>${temp.nameProduct}</td>
                <td>${temp.priceProduct}</td>
<%--                <td>${temp.detailProduct}</td>--%>
<%--                <td>${temp.producer}</td>--%>
                <td><a href="/product?action=edit&id=${temp.idProduct}">edit</a></td>
                <td><a href="/product?action=edit&id=${temp.idProduct}">delete</a></td>

            </tr>
        </c:forEach>
    </table>
</body>
</html>
