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
    <title>Cart</title>
</head>
<body>
<%
    Cart cart = (Cart) request.getAttribute("cart");
    out.print(cart.displayCart());
%>
</body>
</html>
