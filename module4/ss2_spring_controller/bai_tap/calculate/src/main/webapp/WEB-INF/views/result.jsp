<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="/calculator" method="">
        <h2>Calculator</h2>
        <input type="text" name="numberOne" value="${numberOne}">
        <input type="text" name="numberTwo" value="${numberTwo}"><br><br>
        <button type="submit" name="math" value="add">Addition(+)</button>
        <button type="submit" name="math" value="sub">Subtraction(-)</button>
        <button type="submit" name="math" value="multi">Multiplication(*)</button>
        <button type="submit" name="math" value="division">Division(/)</button>

    </form>
    <div style="width: 27%"><hr></div>
    <h2> Result: ${result}</h2>
</div>


</body>
</html>
