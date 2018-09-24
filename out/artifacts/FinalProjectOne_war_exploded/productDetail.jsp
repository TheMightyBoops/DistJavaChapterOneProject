<%--
  Created by IntelliJ IDEA.
  User: lucas
  Date: 9/19/18
  Time: 9:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ProductDetail</title>
</head>
<body>
<div id="header" class="header">
    <div id="nav">

        <a class = "navItemLarge" id="homeName" href="index.xhtml">Rocks and Rocks Alone</a>
        <a class="navItem" id="productList" href="productList.xhtml">Product List</a>
        <a class="navItem" id="productDetail" href="productDetail.xhtml">Product Detail</a>
        <a class="navItem" id="cart" href="cart.xhtml">Cart</a>
        <a class="navItemSmall" id="goToGitHub"
           href="https://github.com/TheMightyBoops/DistJavaProjectOne">
            View this page's sourcecode</a>
    </div>
</div>
<form action="ProductController" method="POST">
    <div id="main">
        <h3>Product detail</h3>

        <h5>Old Gray:</h5>
        <p>This classic is the most basic standard rock we do at Rocks and Rocks alone</p>
        <button class="navItemSmall" name="oldGray" value="oldGray">Add it to your order!</button>

        <h5>Classic Granite:</h5>
        <p>Add a little style and flair to your rock, you only live once.</p>
        <button class="navItemSmall" name="granite">Add it to your order!</button>

        <h5>Dark Slate:</h5>
        <p>Like a chalkboard, but you buy it from us </p>
        <button class="navItemSmall" name="slate">Add it to your order!</button>
    </div>
</form>
<div id="footer">
    <div id="contact">
        <a id="email">placeHolder@this.com</a>
        <br />
        <p id = "address"> This will be the address here</p>
    </div>
</div>
</body>
</html>