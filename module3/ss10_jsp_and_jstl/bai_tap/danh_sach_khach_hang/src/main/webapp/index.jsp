<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 5/30/2022
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
<%--    <style>--%>
<%--      th,td,tr{--%>
<%--        border: 1px solid black;--%>
<%--      }--%>
<%--    </style>--%>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
  </head>
  <body>
  <h2 >Danh sách khách hàng</h2>
  <table class="table" >
    <tr>
      <th>Tên</th>
      <th>NGày sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach var="temp" items="${customerList}">
        <tr>
            <td>${temp.nameCustomer}</td>
            <td>${temp.birthDay}</td>
            <td>${temp.addressCustomer}</td>
            <td><img src="${temp.picUrl}" alt="" width="50px" ></td>
        </tr>

    </c:forEach>
  </table>
  </body>
</html>
