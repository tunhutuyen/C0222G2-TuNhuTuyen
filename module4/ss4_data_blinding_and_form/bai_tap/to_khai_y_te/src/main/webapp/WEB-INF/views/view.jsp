<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tờ khai y tế</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        .radioTravel{
            padding-left: 5px;
        }
    </style>
</head>
<body>
<form:form action="create" method="post" modelAttribute="declaration">
    <div class="container">
        <div class="text-center">
            <div><h3> Tờ Khai Y tế </h3></div>
            <div><b>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT DỂ
                PHÒNG CHỐNG BỆNH TRUYỀN NHIỄM</b></div>
            <div><h5 style="color: red">Khuyến cáo : khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử
                lí hình sự</h5></div>
        </div>

        <div>
            <b>Họ và tên (ghi chữ IN HOA)<span style="color: red">(*)</span>:</b>
            <form:input path="name" class="form-control" required="required"/>
        </div>
        <div>
            <table style="width: 100%;">
                <tr>
                    <th>Năm sinh<span style="color: red">(*)</span></th>
                    <th>Giới tính<span style="color: red">(*)</span></th>
                    <th>Quốc tịch<span style="color: red">(*)</span></th>
                </tr>
                <tr>
                    <td>
                        <form:input type="date" path="dayOfBirth" class="form-control" required="required"/>
                    </td>
                    <td>
                        <form:select path="gender" class="form-control" required="required">
                            <form:option value="Nam">Nam</form:option>
                            <form:option value="Nữ">Nữ</form:option>
                            <form:option value="Khác">Khác</form:option>
                        </form:select>
                    </td>
                    <td>
                        <form:select path="national" class="form-control" required="required">
                            <form:option value="Việt Nam">Việt Nam</form:option>
                            <form:option value="Lào">Lào</form:option>
                            <form:option value="Đông Lào">Đông Lào</form:option>
                        </form:select>
                    </td>
                </tr>
            </table>
        </div>
        <div>
            <b>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác<span style="color: red">(*)</span></b>
            <div>
                <form:input path="idCard" class="form-control" required="required"/>
            </div>
        </div>

        <div>
            <b>Thông tin đi lại<span style="color: red">(*)</span></b>
            <div>
                <form:radiobutton id="radioOne" path="travelInformation" value="Tàu bay" required="required"/><label
                    for="radioOne" class="radioTravel">Tàu bay</label>
                <form:radiobutton id="radioTwo" path="travelInformation" value="Tàu thuyền" required="required"/><label
                    for="radioTwo" class="radioTravel">Tàu thuyền</label>
                <form:radiobutton id="radioThree" path="travelInformation" value="Ô tô" required="required"/><label
                    for="radioThree" class="radioTravel">Ô tô</label>
                <form:radiobutton id="radioFour" path="travelInformation" value="khác" required="required"/><label
                    for="radioFour" class="radioTravel">Khác</label>
            </div>
        </div>
        <div>
            <table style="width: 100%">
                <tr>
                    <th>Số hiệu phương tiện:</th>
                    <th>Số ghế:</th>
                </tr>
                <tr>
                    <td><form:input path="idTravel" class="form-control"/></td>
                    <td><form:input path="seat" class="form-control" /></td>
                </tr>
            </table>
        </div>
        <div>
            <table style="width: 100%">
                <tr>
                    <th>Ngày khởi hành<span style="color: red">(*)</span></th>
                    <th>Ngày kết thúc<span style="color: red">(*)</span></th>
                </tr>
                <tr>
                    <td><form:input type="date" path="dateOfDepartment" class="form-control" required="required"/></td>
                    <td><form:input type="date" path="dateOfArrival" class="form-control" required="required"/></td>
                </tr>
            </table>
        </div>
        <div>
            <b>Trong 14 ngày qua anh/chị có đi đến tỉnh/thành phố nào?<span style="color: red">(*)</span></b>
            <div>
                <form:textarea path="localPassed" class="form-control" required="required"/>
            </div>
        </div>
        <br>
        <div class="text-center">
            <button class="btn btn-primary">Gửi tờ khai</button>
        </div>

    </div>
</form:form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
