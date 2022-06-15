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
    <title>Edit Customer</title>
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
                                <form method="post" action="">
                                    <c:if test="${customer != null}">
                                        <input type="hidden" name="idCustomer"
                                               value="<c:out value='${customer.idCustomer}' />"/>
                                    </c:if>
                                    <div class="mb-3">
                                        <label for="nameCustomer" class="form-label">Name Customer</label>
                                        <input type="text" class="form-control" id="nameCustomer" name="name"
                                               value="${customer.nameCustomer}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="birthdayCustomer" class="form-label">Date</label>
                                        <input type="date" class="form-control" id="birthdayCustomer" name="date"
                                               value="${customer.birthdayCustomer}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="genderCustomer" class="form-label">Gender</label>
                                        <input type="text" class="form-control" id="genderCustomer" name="gender"
                                               value="${customer.genderCustomer}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="idCardCustomer" class="form-label">Card</label>
                                        <input type="text" class="form-control" id="idCardCustomer" name="card"
                                               value="${customer.idCardCustomer}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="phoneCustomer" class="form-label">Phone number</label>
                                        <input type="text" class="form-control" id="phoneCustomer" name="phone"
                                               value="${customer.phoneCustomer}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="emailCustomer" class="form-label">Email</label>
                                        <input type="text" class="form-control" id="emailCustomer" name="email"
                                               value="${customer.emailCustomer}">

                                    </div>
                                    <div class="mb-3">
                                        <label for="addressCustomer" class="form-label">Address</label>
                                        <input type="text" class="form-control" id="addressCustomer" name="address"
                                               value="${customer.addressCustomer}">

                                    </div>
                                    <div class="mb-3">

                                        <label for="idTypeCustomer" class="form-label">ID Customer Type</label>
                                        <select class="form-select" name="idType" id="idTypeCustomer">
                                            <c:forEach items="${customerTypes}" var="item">
                                                <c:if test="${item.idCustomerType == customer.idCustomerType}">
                                                    <option selected value="${item.idCustomerType}">${item.nameCustomerType}</option>
                                                </c:if>
                                                <c:if test="${item.idCustomerType != customer.idCustomerType}">
                                                    <option value="${item.idCustomerType}"> ${item.nameCustomerType} </option>
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
<script src="bootstrap/bootstrap.bundle.min.js"></script>
</html>
