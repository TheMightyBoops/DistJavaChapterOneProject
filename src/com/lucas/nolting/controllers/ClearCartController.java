package com.lucas.nolting.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClearCartController  extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
         final String CART_PATH = "/cart.jsp";

         response.setContentType("text/html");
        RequestDispatcher view = request.getRequestDispatcher(CART_PATH);

        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for (Cookie c : cookies) {
                c.setMaxAge(0);
                response.addCookie(c);
            }
        }
        view.forward(request, response);

    }
}
