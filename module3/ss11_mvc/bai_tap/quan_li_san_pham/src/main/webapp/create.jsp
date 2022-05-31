
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Create</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
    <h2>Create Product</h2>
    <p>
        <a href="/product">Back to customer list</a>
    </p>
    <form action="" method="post">
        <div class="mb-3 mt-3">
            <label >Id:</label>
            <input type="text" class="form-control" id="id" placeholder="Enter id" name="idProduct">
        </div>
        <div class="mb-3 mt-3">
            <label >Name product: </label>
            <input type="text" class="form-control" id="name" placeholder="Enter name" name="nameProduct">
        </div>
        <div class="mb-3 mt-3">
            <label >Cost product:</label>
            <input type="text" class="form-control" id="price" placeholder="Enter cost" name="priceProduct">
        </div>
        <div class="mb-3 mt-3">
            <label >Detail product:</label>
            <input type="text" class="form-control" id="detail" placeholder="Enter detail" name="detailProduct">
        </div>
        <div class="mb-3 mt-3">
            <label > Producer:</label>
            <input type="text" class="form-control" id="producer" placeholder="Enter producer" name="producer">
        </div>

        <button type="submit" class="btn btn-primary">Create</button>
    </form>
</div>
</body>
</html>
