<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h2>Setting</h2>
<form:form method="post" action="update" modelAttribute="save">
    <table>
        <tr>
            <td><form:label path="language">Language: </form:label></td>
            <td><form:select path="language">
<%--                <select class="form-select" aria-label="Default select example" id="idLanguage">--%>

                    <form:option value="english">English</form:option>
                    <form:option value="vietnamese">Vietnamese</form:option>
                    <form:option value="japanese">Japanese</form:option>
                    <form:option value="chinese">Chinese</form:option>
<%--                </select>--%>
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size: </form:label></td>
            <td><label>Show </label><form:select path="pageSize">
                <form:option value="5">5</form:option>
                <form:option value="10">10</form:option>
                <form:option value="15">15</form:option>
                <form:option value="25">25</form:option>
                <form:option value="50">50</form:option>
                <form:option value="100">100</form:option>
            </form:select>
                <label>Enable spam filter</label>
            </td>
        </tr>
        <tr>
            <td><form:label path="enable">Spam filter: </form:label></td>
            <td><form:checkbox path="enable"/> Enable spam filter</td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature: </form:label></td>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <td><button type="submit" value="submit">Update</button></td>
            <td><button type="reset" value="submit">Cancle</button></td>
        </tr>
    </table>
</form:form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
