package com.devcolibri.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ���� on 21.11.2015.
 */
public class MainServlet extends HttpServlet {
    //@Override
    protected void goGet(HttpServletRequest req , HttpServletResponse resp )
           throws ServletException , IOException {
        PrintWriter out = resp.getWriter();
        out.print("<h1>Hello Setvlet</h1>");
        

    }
    /* @Override
     protected void goPost(HttpServletRequest req , HttpServletResponse resp )
             throws ServletException , IOException {
         super.doPost(req,resp);

     }  */
}
