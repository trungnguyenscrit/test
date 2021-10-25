/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Trung
 */
public class Servlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs 
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String a = request.getParameter("a");
        String b = request.getParameter("b");
//        String global = req.getServletContext().getInitParameter("global"); cách gọi biến cục bộ ra
        String valueA = this.getInitParameter("user");
        String valueB = this.getInitParameter("password");
        if (a.equalsIgnoreCase(valueA) && b.equalsIgnoreCase(valueB)) {
            response.getWriter().println("Login successful!");
        } else {
            response.getWriter().println("Login Failed!");
        }
    }

   
}
