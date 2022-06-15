<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/8/2022
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Edit Employee</title>
    <link rel="stylesheet" href="../bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../mycss.css">
</head>

<body>
<div>
    <div>
    </div>
    <div class="navbar navbar-expand-lg navbar-dark bg-dark navbar-header-2">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <div class="col-8">
                    <ul class="navbar-nav me-auto navbar-header-ul">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/employee">Employee</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/customer">Customer</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/service">Service</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/contract">Contract</a>
                        </li>
                    </ul>
                </div>
                <div class="col-4 d-flex nav-header-div-2">
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="main">
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12 bg-success">
                    <div class="row">
                        <div class="col-sm-12 bg-primary">
                            <h2>Edit Employee</h2>
                        </div>
                        <div class="col-sm-12 bg-primary">
                            <p>${message}</p>
                        </div>
                        <div>
                            <a href="/employee">Create Employee</a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12 bg-primary">
                            <div class="container" style="background: #636464">
                                <form method="post" action="">
                                    <c:if test="${employee != null}">
                                        <input type="hidden" name="idEmployee"
                                               value="<c:out value='${employee.idEmployee}' />"/>
                                    </c:if>
                                    <div class="mb-3">
                                        <label for="nameEmployee" class="form-label">Name Employee</label>
                                                                         <input type="text" class="form-control" id="nameEmployee" name="name"
                                               value="${employee.nameEmployee}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="dateOfBirthEmployee" class="form-label">Date</label>
                                        <input type="date" class="form-control" id="dateOfBirthEmployee" name="date"
                                               value="${employee.dateOfBirthEmployee}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="idCardEmployee" class="form-label">Card</label>
                                        <input type="text" class="form-control" id="idCardEmployee" name="card"
                                               value="${employee.idCardEmployee}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="salaryEmployee" class="form-label">Salary</label>
                                        <input type="text" class="form-control" id="salaryEmployee" name="salary"
                                               value="<fmt:formatNumber pattern="#" value="${employee.salaryEmployee}"/>">

                                    </div>
                                    <div class="mb-3">
                                        <label for="numberPhoneEmployee" class="form-label">Phone</label>
                                        <input type="text" class="form-control" id="numberPhoneEmployee" name="phone"
                                               value="${employee.numberPhoneEmployee}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="emailEmployee" class="form-label">Email</label>
                                        <input type="text" class="form-control" id="emailEmployee" name="email"
                                               value="${employee.emailEmployee}">
                                    </div>
                                    <div class="mb-3">
                                        <label for="addressEmployee" class="form-label">Address</label>
                                        <input type="text" class="form-control" id="addressEmployee" name="address"
                                               value="${employee.addressEmployee}">
                                    </div>

                                    <div class="mb-3">
                                        <label for="idPosition" class="form-label">Position</label>
                                        <select class="form-select" name="position" id="idPosition">
                                            <c:forEach items="${positions}" var="item">
                                                <c:if test="${item.idPosition == employee.idPosition}">
                                                    <option selected value="${item.idPosition}">${item.namePosition}</option>
                                                </c:if>
                                                <c:if test="${item.idPosition != employee.idPosition}">
                                                    <option value="${item.idPosition}"> ${item.namePosition} </option>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="mb-3">
                                        <label for="idDegree" class="form-label">Education Degree</label>
                                        <select class="form-select" name="degree" id="idDegree">
                                            <c:forEach items="${educationDegrees}" var="item">
                                                <c:if test="${item.idDegree == employee.idDegree}">
                                                    <option selected value="${item.idDegree}">${item.nameDegree}</option>
                                                </c:if>
                                                <c:if test="${item.idDegree != employee.idDegree}">
                                                    <option value="${item.idDegree}"> ${item.nameDegree} </option>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="mb-3">
                                        <label for="idDivision" class="form-label">Division</label>
                                        <select class="form-select" name="division" id="idDivision">
                                            <c:forEach items="${divisions}" var="item">
                                                <c:if test="${item.idDivision == employee.idDivision}">
                                                    <option selected value="${item.idDivision}">${item.nameDivision}</option>
                                                </c:if>
                                                <c:if test="${item.idDivision != employee.idDivision}">
                                                    <option value="${item.idDivision}"> ${item.nameDivision} </option>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                    </div>

                                    <button type="submit" class="btn btn-primary" style="background: #0c4128">Edit</button>
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">
        <div class="container-fluid">
            <div>
                <p>@Furama - hotel</p>
            </div>
        </div>
    </div>
</div>
</body>
<script src="../bootstrap/bootstrap.bundle.min.js"></script>
</html>
