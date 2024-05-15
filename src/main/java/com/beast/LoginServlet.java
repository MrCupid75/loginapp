package com.beast;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
            String username = req.getParameter("uname");
            PrintWriter out = res.getWriter();
            out.println("Hello " + username);
    }
}
