<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 5/29/2022
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Product Discount</h2>
  <form action="/product" method="post">
    <label> Sản phẩm: </label><br>
    <input type="text" name="product-description" placeholder="Mô tả sản phẩm: "/><br>
    <label> Giá sản phẩm: </label><br>
    <input type="text" name="cost-product" placeholder="Giá sản phẩm: "/><br>
    <label> Tỉ lệ : </label><br>
    <input type="text" name="percent-product" placeholder="Tỉ lệ chiết khẩu: "/><br>
    <input type = "submit" id = "submit" value = "Calculate"/>
  </form>
  </body>
</html>
