<%-- 
    Document   : Appointment
    Created on : 20-Feb-2021, 21:44:18
    Author     : Becca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <title> Book a meeting with a manager</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-blue-grey.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="icon" href="https://th.bing.com/th/id/Re8a5dc5c2fce1bae8f255436160a730c?rik=X5Z1e5YTpDWcZQ&riu=http%3a%2f%2ficons.iconarchive.com%2ficons%2fhopstarter%2fsoft-scraps%2f256%2fButton-Blank-Blue-icon.png&ehk=tQR%2byTjwzjSrAk5KxS8cxHtTVRbIySTVW5EIqHIrmLc%3d&risl=&pid=ImgRaw">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>
 <style>
html, body, h1, h2, h3, h4, h5 {font-family: "Open Sans", sans-serif}
</style>
<body class="w3-theme-l5">

<!-- Navbar -->
<div class="w3-top">
 <div class="w3-bar w3-theme-d2 w3-left-align w3-large">
  
  <div class="w3-dropdown-hover w3-hide-small">
    <button class="w3-button w3-padding-large" </button>     
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
        
      </div>
  
      
     
      
  
    
    <!-- End Left Column -->
    </div>
    
    <!-- Middle Column -->
    <div class="w3-col m7">
    
      <div class="w3-row-padding">
        <div class="w3-col m12">
          <div class="w3-card w3-round w3-white">
            <div class="w3-container w3-padding">
              <h6 class="w3-opacity">WELCOME TO EVAL-SMART</h6>
                          </div>
          </div>
        </div>
      </div>
         <div class="w3-container" style="padding:32px">

            <jsp:include page="headerEm.jsp"/>
        <Pre>
        <form action="DatePicker">
          
            Reason for booking: <input type="text" name="reason">
        
            
            <label for="datepicker">Enter In Date Of Meeting:</label>
                <input type="text" name="dob" id="datepicker">
            
            <label for="cars">Choose a time:</label>
            <select name="times" id="times">
                <option value="08:00">08.00</option>
                <option value="09:00">09.00</option>
                <option value="10:00">10.00</option>
                <option value="11:00">11.00</option>
                <option value="12:00">12.00</option>
                <option value="13:00">13.00</option>
                <option value="14:00">14.00</option>
                <option value="15:00">15.00</option>
                <option value="16:00">16.00</option>
                <option value="17:00">17.00</option>
                <option value="18:00">18.00</option>

            </select>
             <label for="bakes">Choose a Manager:</label>
            <select name="manager" id="manager">
                <option value="SamSmith">Sam Smith</option>
                <option value="VictoriaBarry">Victoria Barry</option>
              

            </select>
            
            
          
             <a class="w3-bar-item w3-button" value="Submit"><input type="submit" value="Submit"> <br></a>
        </form>

        

        </pre>    
        
        
     </div>
    
    <!-- Right Column -->
    <div class="w3-col m2">
      <div class="w3-card w3-round w3-white w3-center">
        <div class="w3-container">
      
        </div>
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