<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/15/2022
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Chuyen doi tien te</title>
  </head>
  <body>
    <form method="" action="/convertor">
      <label>Số lượng: </label>
      <input type="text" name="amount" value="${amount}"> USD<br>
      <label> Kết quả đổi: </label>
      <input type="text" name="result" readonly value="${result}">VND<br>
      <button type="submit"> Quy đổi</button>
    </form>

  </body>
</html>
