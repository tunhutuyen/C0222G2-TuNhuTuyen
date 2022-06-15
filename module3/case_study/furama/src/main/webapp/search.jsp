<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/5/2022
  Time: 5:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search Customer</title>
    <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="mycss.css">
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
                            <h2>Edit Customer</h2>
                        </div>
                        <div class="col-sm-12 bg-primary">
                            <p>${message}</p>
                        </div>
                        <div>
                            <a href="/customer">Create customer</a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12 bg-primary">
                            <div class="container" style="background: #636464">
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th scope="col">ID</th>
                                        <th scope="col">Name Customer</th>
                                        <th scope="col">Day of birth</th>
                                        <th scope="col">Gender</th>
                                        <th scope="col">Number phone</th>
                                        <th scope="col">Address</th>
                                        <th scope="col">Type</th>
                                        <th scope="col">Edit</th>
                                        <th scope="col">Delete</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="temp" items="${customers}">
                                        <tr>
                                            <td>${temp.idCustomer}</td>
                                            <td>${temp.nameCustomer}</td>
                                            <td>${temp.birthdayCustomer}</td>
                                            <td>
                                                <c:if test="${temp.genderCustomer == 1}">
                                                    Nam
                                                </c:if>
                                                <c:if test="${temp.genderCustomer == 0}">
                                                    Nữ
                                                </c:if>
                                            </td>
                                            <td>${temp.phoneCustomer}</td>
                                            <td>${temp.addressCustomer}</td>
                                            <td>
                                                <c:if test="${temp.idCustomerType == 1}">
                                                    Diamond
                                                </c:if>
                                                <c:if test="${temp.idCustomerType == 2}">
                                                    Platinium
                                                </c:if>
                                                <c:if test="${temp.idCustomerType == 3}">
                                                    Gold
                                                </c:if>
                                                <c:if test="${temp.idCustomerType == 4}">
                                                    Silver
                                                </c:if>
                                                <c:if test="${temp.idCustomerType == 5}">
                                                    Member
                                                </c:if>
                                            </td>
                                            <td><a href="/customer?action=edit&id=${temp.idCustomer}">Edit</a></td>
                                            <td><a href="/customer?action=delete&id=${temp.idCustomer}">Delete</a></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="bg-light text-center text-lg-start" >
        <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2); ">
            © 2020 Copyright:
            <a class="text-dark" href="https://mdbootstrap.com/">MDBootstrap.com</a>
        </div>
    </footer>
</div>
</body>
<script src="bootstrap/bootstrap.bundle.min.js"></script>
</html>
