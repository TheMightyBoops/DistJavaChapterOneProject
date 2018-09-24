<%@ page import="com.lucas.nolting.models.Product" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: lucas
  Date: 9/19/18
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
    <link rel="stylesheet" type="text/css" href="StyleBuilderClasses.css"/>
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
<!-- unique stuff -->

<%
        Product product = (Product) request.getAttribute("product");

        if(product != null) {
                out.print("<h2>"+ product.getName() + "</h2>");
                out.print("<h3>" + product.getPrice() + "</h3>");
                out.print("<p>" + product.getDescription() + "</p>");
                out.print("<img src=\"" + product.getImage() + "\" " +
                        "height=\"100\" width=\"100\">");
        } else { out.print("error");}

%>

</body>
</html>
