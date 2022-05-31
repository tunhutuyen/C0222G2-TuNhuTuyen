<%@ page import="java.io.PrintWriter" %>
<%@ page import="model.Calculator" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 5/30/2022
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        PrintWriter writer = response.getWriter();
        Calculator calculators= new Calculator();
        try{
            float result = calculators.calculate(numberOne,numberTwo,character);
            writer.println(firstNumber+" " + operator+" " + secondNumber + " = " + result);
        }catch(Exception e){
            writer.println("Error: "+ e.getMessage());
        }
    %>
</body>
</html>
