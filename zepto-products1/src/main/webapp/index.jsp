<html>

<body>

<h2>Product Registration Form</h2>

<form action="product/addProduct" method="post">

    <label>Product Name:</label><br>
    <input type="text" name="productName"><br><br>

    <label>Brand:</label><br>
    <input type="text" name="brand"><br><br>

    <label>Category:</label><br>
    <input type="text" name="category"><br><br>

    <label>Quantity:</label><br>
    <input type="number" name="quantity"><br><br>

    <label>Price:</label><br>
    <input type="number" step="0.01" name="price"><br><br>

    <label>Description:</label><br>
    <textarea name="description" rows="4" cols="30"></textarea><br><br>

    <input type="submit" value="Save Product">

</form>


<a href="product/showSearchPage">Search Product</a>

</body>
</html>