<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/7/2022
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<head>
    <title>Customer</title>
    <link rel="stylesheet" href="../bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
    <style>
        .modal-dialog {
            width: 100%;
            max-width: none;
            height: auto;
            margin: 0;
        }
    </style>
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
                    <form class="d-flex" action="/employee" method="">
                        <input type="hidden" name="action" value="search">
                        <input class="form-control me-2" type="text" placeholder="Search" aria-label="Search"
                               name="name" value="">
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
                            <h2>List Employee</h2>
                        </div>
                        <div class="col-sm-12 bg-primary">
                            <p>${message}</p>
                        </div>
                        <div>
                            <a href="/employee?action=create" style="color: black;">Create Employee</a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12 bg-primary">
                            <div class="container-fluid" style="background: #636464">
                                <table id="tableCustomer" class="table table-striped table-bordered"
                                       style="width: 100%">
                                    <thead>
                                    <tr>
                                        <th scope="col">ID</th>
                                        <th scope="col">Name Employee</th>
                                        <th scope="col">Day of birth</th>
<%--                                        <th scope="col">Id Card</th>--%>
                                        <th scope="col">Salary</th>
                                        <th scope="col">Number phone</th>
<%--                                        <th scope="col">Mail</th>--%>
                                        <th scope="col">Address</th>
                                        <th scope="col">Position</th>
                                        <th scope="col">Education degree</th>
                                        <th scope="col">Division</th>
                                        <th scope="col">Edit</th>
                                        <th scope="col">Delete</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="temp" items="${employeeDTOS}">
                                        <tr>
                                            <td>${temp.idEmployee}</td>
                                            <td>${temp.nameEmployee}</td>
                                            <td>${temp.dateOfBirthEmployee}</td>
<%--                                            <td>${temp.idCardEmployee}</td>--%>
                                            <td ><fmt:formatNumber pattern="#,###" value="${temp.salaryEmployee}"/></td>
                                            <td>${temp.numberPhoneEmployee}</td>
<%--                                            <td>${temp.emailEmployee}</td>--%>
                                            <td>${temp.addressEmployee}</td>
                                            <td>${temp.namePositionEmployee}</td>
                                            <td>${temp.degreeEmployee}</td>
                                            <td>${temp.divisionEmployee}</td>
                                            <td><a href="/employee?action=edit&id=${temp.idEmployee}">Edit</a></td>
                                            <td>
                                                <button type="submit" class="btn btn-primary" data-bs-toggle="modal"
                                                        data-bs-target="#e${temp.idEmployee}">
                                                    Delete
                                                </button>
                                                    <%--    Modal to delete--%>
                                                <div class="modal fade" id="e${temp.idEmployee}" tabindex="-1"
                                                     aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                    <div class="modal-dialog">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <h5 class="modal-title" id="exampleModalLabel">Are U sure U want to delete it?</h5>
                                                                <button type="button" class="btn-close"
                                                                        data-bs-dismiss="modal"
                                                                        aria-label="Close"></button>
                                                            </div>
                                                            <div class="modal-body">
                                                                <table id="tableCustomer1"
                                                                       class="table table-striped table-bordered"
                                                                       style="width: 100%">
                                                                    <thead>
                                                                    <tr>
                                                                        <th scope="col">ID</th>
                                                                        <th scope="col">Name Employee</th>
                                                                        <th scope="col">Day of birth</th>
                                                                        <th scope="col">Card</th>
                                                                    </tr>
                                                                    </thead>
                                                                    <tbody>
                                                                    <tr>
                                                                        <td>${temp.idEmployee}</td>
                                                                        <td>${temp.nameEmployee}</td>
                                                                        <td>${temp.dateOfBirthEmployee}</td>
                                                                        <td>${temp.idCardEmployee}</td>
                                                                    </tr>
                                                                    </tbody>
                                                                </table>

                                                            </div>
                                                            <div class="modal-footer">
                                                                <button type="button" class="btn btn-secondary"
                                                                        data-bs-dismiss="modal">No
                                                                </button>
                                                                <form action="/employee?action=delete&id=${temp.idEmployee}" method="post">
                                                                    <button type="submit" class="btn btn-primary">Yes</button>
                                                                </form>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                    <%--    End Modal to delete--%>
                                            </td>
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
    <footer class="bg-light text-center text-lg-start">
        <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2); ">
            © 2020 Copyright:
            <a class="text-dark" href="https://mdbootstrap.com/">MDBootstrap.com</a>
        </div>
    </footer>
</div>
</body>
<script src="../bootstrap/bootstrap.bundle.min.js"></script>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</html>