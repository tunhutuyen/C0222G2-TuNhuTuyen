<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/15/2022
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>$Title$</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h2>Sandwich</h2>
<div style="width: 25%">
  <form action="/sandwich" method="">
    <div class="mb-3 form-check" style="float: left">
      <input type="checkbox" class="form-check-input" id="lettuce" name="spice" value="Lettuce">
      <label class="form-check-label" for="lettuce">Lettuce</label>
    </div>
    <div class="mb-3 form-check" style="float: left">
      <input type="checkbox" class="form-check-input" id="tomato" name="spice" value="Tomato">
      <label class="form-check-label" for="tomato">Tomato</label>
    </div>
    <div class="mb-3 form-check" style="float: left">
      <input type="checkbox" class="form-check-input" id="mustard" name="spice" value="Mustard">
      <label class="form-check-label" for="mustard">Mustard</label>
    </div>
    <div class="mb-3 form-check" style="float: left">
      <input type="checkbox" class="form-check-input" id="sprouts" name="spice" value="Sprouts">
      <label class="form-check-label" for="sprouts">Sprouts</label>
    </div>
    <div style="clear: left"><hr style="width: 100%"></div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
  <h3>Sandwich have spice: </h3>
    <c:forEach var="item" items="${spice}">
      <p>${item.toString()}</p>
    </c:forEach>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</html>
