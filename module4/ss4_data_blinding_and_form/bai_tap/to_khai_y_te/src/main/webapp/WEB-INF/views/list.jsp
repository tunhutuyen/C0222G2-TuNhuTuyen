<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/19/2022
  Time: 12:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Hiển thị khai báo y tế</title>
</head>
<body>
<fieldset>
    <legend>Tờ Khai Chi Tiết</legend>
    <div> Tên : ${declarationNew.name}</div>
    <div> Ngày Sinh: ${declarationNew.dayOfBirth}</div>
    <div> Giới Tính : ${declarationNew.gender}</div>
    <div> Quốc Gia : ${declarationNew.national}</div>
    <div> Căn Cước : ${declarationNew.idCard}</div>
    <div> Thông Tin Đi lại : ${declarationNew.travelInformation}</div>
    <div> Số Hiệu : ${declarationNew.idTravel}</div>
    <div> Số Ghế : ${declarationNew.seat}</div>
    <div> Ngày Bắt Đầu : ${declarationNew.dateOfDepartment}</div>
    <div> Ngày Kết Thúc : ${declarationNew.dateOfArrival}</div>
    <div> Thông tin đi lại trong 14 ngày : ${declarationNew.localPassed}</div>
</fieldset>
</body>
</html>
