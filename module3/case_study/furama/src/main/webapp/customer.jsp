<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer</title>
    <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css">
    <style>
        .modal-dialog {
            width: 100%;
            max-width: none;
            height: auto;
            margin: 0;
        }
    </style>
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
                    <form class="d-flex" action="/customer" method="">
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
                            <h2>List Customer</h2>
                        </div>
                        <div class="col-sm-12 bg-primary">
                            <p>${message}</p>
                        </div>
                        <div>
                            <a href="/customer?action=create" style="color: black;">Create customer</a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12 bg-primary">
                            <div class="container" style="background: #636464">
                                <table id="tableCustomer" class="table table-striped table-bordered"
                                       style="width: 100%">
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
                                            <td>
                                                <button type="submit" class="btn btn-primary" data-bs-toggle="modal"
                                                        data-bs-target="#e${temp.idCustomer}">
                                                    Delete
                                                </button>
                                                    <%--    Modal to delete--%>
                                                <div class="modal fade" id="e${temp.idCustomer}" tabindex="-1"
                                                     aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                    <div class="modal-dialog">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <h5 class="modal-title" id="exampleModalLabel">Modal
                                                                    title</h5>
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
                                                                        <th scope="col">Name Customer</th>
                                                                        <th scope="col">Day of birth</th>
                                                                        <th scope="col">Gender</th>
                                                                        <th scope="col">Number phone</th>
                                                                        <th scope="col">Address</th>
                                                                        <th scope="col">Type</th>
                                                                    </tr>
                                                                    </thead>
                                                                    <tbody>
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
                                                                    </tr>
                                                                    </tbody>
                                                                </table>

                                                            </div>
                                                            <div class="modal-footer">
                                                                <button type="button" class="btn btn-secondary"
                                                                        data-bs-dismiss="modal">No
                                                                </button>
                                                                <form action="/customer?action=delete&id=${temp.idCustomer}" method="post">
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
<script src="bootstrap/bootstrap.bundle.min.js"></script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
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
