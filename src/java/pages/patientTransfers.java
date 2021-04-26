/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

import model.MyJBDC;


/**
 *
 * @author jack
 */
public class patientTransfers extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
       
       //Get user input from add0
       String name = (String)request.getParameter("transfer");
       String date= (String)request.getParameter("transDate");
       String place= (String)request.getParameter("destination");
       // String transferID= (String)request.getParameter("transferID");
      
        //Set variables to user input
       com.UserInput e=new com.UserInput();
       e.settransferID(name);
       e.setDate(date);
       e.setPlace(place);
       
       // e.settransferID(transferID);
        
       int status=MyJBDC.savetransferID(e);
        if(status>0){
           out.println("<p>Patient Added To Transfer List Successfully!</p>");
            request.getRequestDispatcher("LoginSuccessDoctor.jsp").include(request, response);
       }
        else{
            out.println("Error, Unable to Add Patient To Transfer List");
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
