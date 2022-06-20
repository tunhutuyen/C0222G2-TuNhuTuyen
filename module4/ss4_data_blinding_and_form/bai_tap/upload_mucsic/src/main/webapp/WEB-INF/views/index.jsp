<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/15/2022
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>UPLOAD MUSIC</title>
</head>
<body>
  <form:form action="/music/upload" method="post" modelAttribute="music">
  <h1>Upload</h1>
  <fieldset>
    <legend> Box Music</legend>
    <table>
      <tr>
        <td>The Song</td>
        <td><form:input path="nameSong"/></td>
      </tr>
      <tr>
        <td>Show Artist</td>
        <td><form:input path="showArtist"/></td>
      </tr>
      <tr>
        <td>Type</td>
        <td>
          <form:select path="typeMusic">
            <form:option value="Nhạc đồng quê"> Nhạc đồng quê</form:option>
            <form:option value="Pop"> Pop</form:option>
            <form:option value="Jazz"> Jazz</form:option>
            <form:option value="Rock"> Rock</form:option>
            <form:option value="R&B"> R&B</form:option>
            <form:option value="Hip hop"> Hip hop</form:option>
          </form:select>
        </td>
      </tr>
      <tr>
        <td>Link</td>
        <td>
          <form:select path="link">
            <form:option value="https://zingmp3.vn/album/Vi-Me-Anh-Bat-Chia-Tay-Single-Miu-Le-Karik-Chau-Dang-Khoa/6BOEEZ99.html"> Vì mẹ anh bắt chia tay</form:option>
            <form:option value="https://zingmp3.vn/bai-hat/Nguoi-Ve-Tu-Long-Dat-Don-Ho/ZW669D9E.html">Người Về Từ Lòng Đất</form:option>
            <form:option value="https://zingmp3.vn/album/Sea-Shanty-Wellerman-Xd-Kaan-Pars/67OZFC7W.html">Sea Shanty</form:option>
            <form:option value="https://zingmp3.vn/album/Ngay-Tho-Phong-Max-Remix-Single-Tang-Duy-Tan/6BWZEWEO.html">Ngây thơ</form:option>
            <form:option value="https://www.youtube.com/watch?v=XA4cHkMeyw4">Dạ Vũ</form:option>
            <form:option value="https://www.youtube.com/watch?v=kPnIqaEP2W0">Tìm</form:option>
          </form:select>
        </td>
      </tr>

      <tr>
        <td></td>
        <td>
          <button type="submit" value="update" >Update</button>
            <button type="reset" value="cancel" >Cancel</button>
        </td>
      </tr>
    </table>
  </fieldset>
  </form:form>

  <fieldset>
    <legend>Box Music</legend>
    <div>The song : ${musicNew.nameSong}</div>
    <div> Artist : ${musicNew.showArtist}</div>
    <div>Type : ${musicNew.typeMusic}</div>
    <div>Link : <iframe width="800px" height="auto" title="the song" src="${musicNew.link}" allowfullscreen> </iframe> </div>
  </fieldset>

  </body>
</html>
