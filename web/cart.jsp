<%@ page import="com.lucas.nolting.models.Cart" %><%--
  Created by IntelliJ IDEA.
  User: lucas
  Date: 9/24/18
  Time: 7:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="StyleBuilderClasses.css">
    <title>Cart</title>
</head>
<body>
<div id="header" class="header">
    <div id="nav">

        <a class = "navItemLarge" id="homeName" href="index.jsp">Rocks and Rocks Alone</a>
        <a class="navItem" id="productList" href="productDetail.jsp">Product List</a>
        <a class="navItem" id="cart" href="DisplayCart">Cart</a>
        <a class="navItemSmall" id="goToGitHub"
           href="https://github.com/TheMightyBoops/DistJavaProjectOne">
            View this page's sourcecode</a>
    </div>
</div>

<%
    Cart cart = (Cart) request.getAttribute("cart");
    if(cart != null) {
        out.print(cart.displayCart());
    } else {
        out.print("Your cart is empty.");
    }
%>
<form action="${pageContext.request.contextPath}/ClearCart" method="post">
    <button class="buttonDefault" name="clearCart" type="submit" value="clearCart">Clear Cart</button>
</form>
</body>
</html>
