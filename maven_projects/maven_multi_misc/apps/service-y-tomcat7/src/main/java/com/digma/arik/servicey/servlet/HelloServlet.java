package com.digma.arik.servicey.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * how to run:
 * 1. ../../mvnw tomcat7:run
 * 2. browse to http://localhost:7123/service-y/HelloServlet
 *
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        LocalDateTime nowTime = LocalDateTime.now();

        PrintWriter writer = response.getWriter();
        writer.println("Hello from the servlet!");
        writer.println(" ");
        writer.println("The time is " + nowTime);
    }

}
