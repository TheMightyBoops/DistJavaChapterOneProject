package com.lucas.nolting.controllers;

import com.lucas.nolting.models.Cart;
import com.lucas.nolting.models.CartLineItem;
import com.lucas.nolting.models.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;



public class CartController extends HttpServlet {
    private static final String  CART_PATH = "/cart.jsp";

    public void doPost(HttpServletRequest rq, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        RequestDispatcher view = rq.getRequestDispatcher(CART_PATH);

        String[] productName = rq.getParameterValues("addToCart");
        String[] quantity = rq.getParameterValues("quantity");
        //HttpSession httpSession = rq.getSession();
        Cookie setName = new Cookie("itemName", productName[0]);
        Cookie setQuan = new Cookie("quantity", quantity[0]);

        setName.setMaxAge(60*60*24);
        res.addCookie( setName );

        setQuan.setMaxAge(60*60*24);
        res.addCookie( setQuan );


        Cookie itemCookie = null;
        Cookie[] itemCookies = null;
        PrintWriter out = res.getWriter();

        Cart cart = new Cart();//(Cart) httpSession.getAttribute("cart");000
        itemCookies = rq.getCookies();

        Product product = null;
        CartLineItem cartLineItem = null;

        if(itemCookies != null) {
            for(int i = 0; i < itemCookies.length; ++i) {
                itemCookie = itemCookies[i];
                out.println(itemCookie.getValue());
                if(itemCookie.getName().equals("itemName")) {
                    product = new Product(itemCookie.getValue());
                } else if(itemCookie.getName().equals("quantity")) {
                    cartLineItem = new CartLineItem(
                            product.getName(),
                            product.getPrice(),
                            Integer.parseInt(product.getId()),
                            Integer.parseInt(itemCookie.getValue())
                            );
                    cart.addItem(cartLineItem);
                }
            }

            rq.setAttribute("cart", cart);
        }
        view.forward(rq, res);
    }

}
