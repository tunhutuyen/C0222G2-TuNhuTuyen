<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/15/2022
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Từ điển</title>
</head>
<body>
    <h2>Tìm từ điển</h2>
    <div>

            <label>Từ cần tìm:</label>
            <input type="text" name="word" value="${word}"><br><br>
            <label> Kết quả:</label>
            <input type="text" name="result" value="${result}" readonly><br>
    </div>
</body>
</html>
