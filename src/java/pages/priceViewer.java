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
public class priceViewer extends HttpServlet {
    
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
        PrintWriter out = response.getWriter();

        out.print("<table border='1' width='100%'");
        out.print("<tr><th>Price in £ per 10 min Surgery </th>");
       // out.print (getprice()+ "</td><td>" );
        List<com.UserInput> list = MyJBDC.getprice();
        
        

       
            
            

        for (com.UserInput e:list) {
            //out.print("<tr><td>" + e.getID()+ "</td><td>" + e.getName()+ "</td><td>" + e.getReason()+ "</td><td>" + e.getTime()+ "</td><td>" + e.getDate() + "</td><td>" + "<input type='radio' name='deleteRadio' value='"+e.getID() + "'>" + "</td><tr>");
            out.print("<tr><td>" + e.getprice()+ "</td><td>" );
            
        }
 
        out.print("</table>");
        
        
        
        
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