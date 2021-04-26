/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MyJBDC;

/**
 *
 * @author camer
 */
@WebServlet(name = "DatePicker", urlPatterns = {"/DatePicker"})
public class DatePicker extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        
        String username = null;
        Cookie userCookie[] = request.getCookies();
        if (userCookie != null) {
            for (int i = 0; i < userCookie.length; i++) {
                if (userCookie[i].getName().equals("username")) // Retrieve username from the cookie
                {
                    username = userCookie[i].getValue();
                }
            }
            response.setContentType("text/html");
            out.println(" Hello!   " + username);
        } 
        
        
        
        String name = ((String)username);
        String reason = (String)request.getParameter("reason");
        String date = (String)request.getParameter("dob");
        String time = (String)request.getParameter("times");
        String manager = (String)request.getParameter("manager");
        
        
        
        
        //String userName = session.getAttribute("userName");
        
        
        
        
        
        
        
        com.UserInput e = new com.UserInput();
        e.setReason(reason);
        e.setDate(date);
        e.setTime(time);
        e.setName(name);
        e.setDN(manager);
        
        int status = MyJBDC.savedate(e);
        if (status > 0) {
            out.println("<p>New Date added successfully!</p>");
           // request.getRequestDispatcher("LoginSuccessClient.jsp").include(request, response);
        } else {
            out.println("Error unable to add date");
        }
        out.close();

        
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
