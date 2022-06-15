<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/13/2022
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="main">
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-12 bg-success">
                <div class="row">
                    <div class="col-sm-12 bg-primary">
                        <h2>Create Customer</h2>
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
                                <div class="mb-3">
                                    <label for="nameCustomer" class="form-label">Name Customer</label>
                                    <input type="text" class="form-control" id="nameCustomer" name="name">

                                </div>
                                <div class="mb-3">
                                    <label for="birthdayCustomer" class="form-label">Date</label>
                                    <input type="date" class="form-control" id="birthdayCustomer" name="date">

                                </div>
                                <div class="mb-3">
                                    <label for="genderCustomer" class="form-label">Gender</label>
                                    <select name="gender" id="genderCustomer">
                                        <option value="1">Nam</option>
                                        <option value="0">Nữ</option>
                                    </select>

                                </div>
                                <div class="mb-3">
                                    <label for="idCardCustomer" class="form-label">Card</label>
                                    <input type="text" class="form-control" id="idCardCustomer" name="card">

                                </div>
                                <div class="mb-3">
                                    <label for="phoneCustomer" class="form-label">Phone number</label>
                                    <input type="text" class="form-control" id="phoneCustomer" name="phone">

                                </div>
                                <div class="mb-3">
                                    <label for="emailCustomer" class="form-label">Email</label>
                                    <input type="text" class="form-control" id="emailCustomer" name="email">

                                </div>
                                <div class="mb-3">
                                    <label for="addressCustomer" class="form-label">Address</label>
                                    <input type="text" class="form-control" id="addressCustomer" name="address">

                                </div>

                                <div class="mb-3">
                                    <label for="idTypeCustomer" class="form-label">ID Customer Type</label>
                                    <select class="form-select" name="idType" id="idTypeCustomer">
                                        <option selected>Select type customer</option>
                                        <c:forEach items="${customerTypes}" var="item">
                                            <option  value="${item.idCustomerType}"> ${item.nameCustomerType} </option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <button type="submit" class="btn btn-primary" style="background: #0c4128">Create
                                </button>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
