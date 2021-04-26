<%-- 
    Document   : TeamLeaderLoginSuccess
    Created on : 14-Feb-2021, 15:48:15
    Author     : BECCA
--%>

<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<title>Employee page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-blue-grey.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html, body, h1, h2, h3, h4, h5 {font-family: "Open Sans", sans-serif}
</style>
<body class="w3-theme-l5">

<!-- Navbar -->
<div class="w3-top">
 <div class="w3-bar w3-theme-d2 w3-left-align w3-large">
  <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2" href="javascript:void(0);" onclick="openNav()"><i class="fa fa-bars"></i></a>

  <div class="w3-dropdown-hover w3-hide-small">
    <button class="w3-button w3-padding-large" title="Notifications"><i class="fa fa-bell"></i><span class="w3-badge w3-right w3-small w3-green"></span></button>     
    <div class="w3-dropdown-content w3-card-4 w3-bar-block" style="width:300px">

    </div>
  </div>
 
 </div>
</div>

<!-- Navbar on small screens -->
<div id="navDemo" class="w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium w3-large">

</div>

<!-- Page Container -->
<div class="w3-container w3-content" style="max-width:1400px;margin-top:80px">    
  <!-- The Grid -->
  <div class="w3-row">
    <!-- Left Column -->
    <div class="w3-col m3">
      <!-- Profile -->
      <div class="w3-card w3-round w3-white">
        <div class="w3-container">
         <h4 class="w3-center">USER ID: 345678 </h4>
         <p class="w3-center"><img src="https://png.pngtree.com/png-vector/20191110/ourlarge/pngtree-avatar-icon-profile-icon-member-login-vector-isolated-png-image_1978396.jpg" class="w3-circle" style="height:106px;width:106px" alt="Avatar"></p>
         <hr>
         <p><i class="fa fa-pencil fa-fw w3-margin-right w3-text-theme"></i> Job Title: Team leader</p>
         <p><i class="fa fa-home fa-fw w3-margin-right w3-text-theme"></i> Branch: Bristol </p>
         <p><i class="fa fa-birthday-cake fa-fw w3-margin-right w3-text-theme"></i> Joined company on: 16th July 2008 </p>
        </div>
      </div>
  
      
     
      
  
    
    <!-- End Left Column -->
    </div>
    
    <!-- Middle Column -->
    <div class="w3-col m7">
    
      <div class="w3-row-padding">
        <div class="w3-col m12">
          <div class="w3-card w3-round w3-white">
            <div class="w3-container w3-padding">
              <h6 class="w3-opacity">WELCOME USER: Poppy Hunter</h6>
                          </div>
          </div>
        </div>
      </div>
         <h3> Please select one of the following options: <h3>
        <form method="post" action="UserServlet"> 
            
        <h4>Your Options:</h4> 
           
            <input type="radio" name="option" value="schedule">Check your schedule for the day  <br>  
            <input type="radio" name="option" value="viewPrices">View your Evaluation data  <br>
            <input type="radio" name="option" value="SelfEvaluation">Complete a Self Evaluation  <br>
            <input type="radio" name="option" value="EmployeeEvaluation">Complete an Employee Evaluation  <br>
            <input type="radio" name="option" value="Appointment">Book an appointment with manager <br>
            <input type="radio" name="option" value="Complaint"> Make a complaint <br>
           

            <input type=submit value="Confirm"> <br />
            </form>
      

    <!-- End Middle Column -->
    </div>
    
    <!-- Right Column -->
    <div class="w3-col m2">
  <form method="post" action="LogoutServlet.do"> 
        <a class="w3-bar-item w3-button" value="Log out"><input type="submit" value="Log out"> <br></a>
            </form>

      </div>
   
      
     
      
    <!-- End Right Column -->
    </div>
    
  <!-- End Grid -->
  </div>
  
<!-- End Page Container -->
</div>
<br>

<!-- Footer -->
<footer class="w3-container w3-theme-d3 w3-padding-16">

</footer>

<footer class="w3-container w3-theme-d5">
 
</footer>
 


</body>
</html> 