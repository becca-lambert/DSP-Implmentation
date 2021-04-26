<%-- 
    Document   : LoginSuccessAdmin
    Created on : 05-Feb-2021, 02:26:17
    Author     : BECCA
--%>

<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
    <link rel="icon" href="https://th.bing.com/th/id/OIP.hMKr7k5Ww4BRPZy3pAI5TAHaG1?pid=Api&w=155&h=143&rs=1">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
        <title>WELCOME ADMIN</title>
    </head>
    <body>
        
        
          
 
        <h3> Please select one of the following options: <h3>
        <form method="post" action="UserServlet"> 
            
        <h4>Calendar options:</h4> 
            <input type="radio" name="option" value="calendar">Book an appointment with a Doctor <br>
            <input type="radio" name="option" value="schedule">Check daily surgery schedule <br>  
        <h4>Payment Options:</h4> 
            <input type="radio" name="option" value="payBill">Pay A Bill <br>
            <input type="radio" name="option" value="viewBills">View Outstanding Bills <br>
            <input type="radio" name="option" value="createInvoice">Create an Invoice <br>
            <input type="radio" name="option" value="Rprescription"> Request Prescription <br>
            <input type="radio" name="option" value="viewPrices"viewPrices>View  Prices <br>

            <input type=submit value="Confirm"> <br />
            </form>
    </body>
</html>
