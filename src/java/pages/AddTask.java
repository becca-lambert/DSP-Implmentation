/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.MyJBDC;

/**
 *
 * @author BECCA
 */
public class AddTask extends HttpServlet {

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
        
        //Get user input from add0
        String pname = (String)request.getParameter("dob");
        String issue= (String)request.getParameter("br");
        String Cdate= (String)request.getParameter("kitchen");
        String MadeBy= (String)request.getParameter("bar");
        String service = (String)request.getParameter("service");
        String DayOff = (String)request.getParameter("day");
        
        
     
        //Set variables to user input
        com.UserInput e=new com.UserInput();
        e.setDate(pname);
        e.setBR(issue);
        e.setKIT(Cdate);
        e.setBAR(MadeBy);
        e.setSERVICE(service);
        e.setDF(DayOff);
    
       
        
        int status=MyJBDC.Schedule(e);
        if(status>0){
            //out.println(DayOff);
          // out.println("<p>New complaint added successfully!</p>");
            request.getRequestDispatcher("/WEB-INF/StaffEmail.jsp").forward(request, response);
        }
        else{
            out.println("Error making a complaint");
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