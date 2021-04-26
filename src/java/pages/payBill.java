//*
 //* To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
 // and open the template in the editor.
// */
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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

import model.MyJBDC;


/**
 *
 * @author becca
 */
public class payBill extends HttpServlet {
    
public static void main(String[] args) {
      
   }
    
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
        
        
        com.UserInput e=new com.UserInput();
        e.setCName(name);
      
        
        out.print("<table border='1' width='100%'");
        out.print("<tr><th>PatientID</th><th>AppointmentDate</th><th>AmountDue</th><th>PatientType</th><th>Medication</th></tr>");
        List<com.UserInput> list = MyJBDC.paybill(e);
 

        
        for(com.UserInput x:list){
            
            out.print("<tr><td>" + x.getName()
                    + "</td><td>" + x.getDate()
                    + "</td><td>" + x.getAmountDue()
                    + "</td><td>" + x.getType()
                    + "</td><td>" + x.getMedi()
                    + "</td></tr>");

        }
        out.print("</table>");
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