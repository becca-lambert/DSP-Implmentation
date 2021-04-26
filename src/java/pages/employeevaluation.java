/*
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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.MyJBDC;
/**
 *
 * @author becca
 */
public class employeevaluation extends HttpServlet {

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
        
    
        
        
        //Get user input from addPatient
        String pname = (String)request.getParameter("employee");
     

        
          String iQ1 = request.getParameter("Q1").toString();
        int Q1 = Integer.parseInt(iQ1); //CONVERT STRING TO INT
         String iQ2 = request.getParameter("Q2").toString();
        int Q2 = Integer.parseInt(iQ2); //CONVERT STRING TO INT
         String iQ3 = request.getParameter("Q3").toString();
        int Q3 = Integer.parseInt(iQ3); //CONVERT STRING TO INT
         String iQ4 = request.getParameter("Q4").toString();
        int Q4 = Integer.parseInt(iQ4); //CONVERT STRING TO INT
         String iQ5 = request.getParameter("Q5").toString();
        int Q5 = Integer.parseInt(iQ5); //CONVERT STRING TO INT
         String iQ6 = request.getParameter("Q6").toString();
        int Q6 = Integer.parseInt(iQ6); //CONVERT STRING TO INT
         String iQ7 = request.getParameter("Q7").toString();
        int Q7 = Integer.parseInt(iQ7); //CONVERT STRING TO INT
         String iQ8 = request.getParameter("Q8").toString();
        int Q8 = Integer.parseInt(iQ8); //CONVERT STRING TO INT
         String iQ9 = request.getParameter("Q9").toString();
        int Q9 = Integer.parseInt(iQ9); //CONVERT STRING TO INT

        
        //Set variables to user input
        com.UserInput e=new com.UserInput();
        e.setEQ1(Q1);
        e.setEQ2(Q2);
        e.setEQ3(Q3);
        e.setEQ4(Q4);
        e.setEQ5(Q5);
        e.setEQ6(Q6);
        e.setEQ7(Q7);
        e.setEQ8(Q8);
        e.setEQ9(Q9);
        e.setEQname(pname);
        
        
        
        
        int status=MyJBDC.EmployeeEvaluation(e);
        if(status>0){
            out.println("<pSelf Evaluation Completed!</p>");
            
        }
        else{
            out.println("Error unable to complete self evaluation");
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
