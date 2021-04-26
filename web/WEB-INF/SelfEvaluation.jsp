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
        <h1>Self Evaluation</h1>
        <form method="POST" action="SelfEvaluation">  
              <table>
            <tr>
             Do you consider yourself punctual ?
            <input type='radio' name='Q1' value='5'> Strongly Agree  <input type='radio' name='Q1' value='4'> Agree <input type='radio' name='Q1' value='3'> Neutral <input type='radio' name='Q1' value='0'> Disagree <br>
             Do you feel like you have the full support your management team ?
            <input type='radio' name='Q2' value='5'> Strongly Agree  <input type='radio' name='Q2' value='4'> Agree <input type='radio' name='Q2' value='3'> Neutral <input type='radio' name='Q2' value='0'> Disagree <br>
             Do you always complete your assigned tasks on time ? 
             <input type='radio' name='Q3' value='5'> Strongly Agree  <input type='radio' name='Q3' value='4'> Agree <input type='radio' name='Q3' value='3'> Neutral <input type='radio' name='Q3' value='0'> Disagree <br>
             Are you happy in your working environment ?
             <input type='radio' name='Q4' value='5'> Strongly Agree  <input type='radio' name='Q4' value='4'> Agree <input type='radio' name='Q4' value='3'> Neutral <input type='radio' name='Q4' value='0'> Disagree <br>
             Do you meet your assigned deadlines?
             <input type='radio' name='Q5' value='5'> Strongly Agree  <input type='radio' name='Q5' value='4'> Agree <input type='radio' name='Q5' value='3'> Neutral <input type='radio' name='Q5' value='0'> Disagree <br>
             Do you feel like you need more support to fulfil your full potential in your job
             <input type='radio' name='Q6' value='5'> Strongly Agree  <input type='radio' name='Q6' value='4'> Agree <input type='radio' name='Q6' value='3'> Neutral <input type='radio' name='Q6' value='0'> Disagree <br>
             Do you feel like you allocate your time well when completing your designated tasks?
             <input type='radio' name='Q7' value='5'> Strongly Agree  <input type='radio' name='Q7' value='4'> Agree <input type='radio' name='Q7' value='3'> Neutral <input type='radio' name='Q7' value='0'> Disagree <br>
             Do you feel like you have a good working relationship with your co-workers ?
             <input type='radio' name='Q8' value='5'> Strongly Agree  <input type='radio' name='Q8' value='4'> Agree <input type='radio' name='Q8' value='3'> Neutral <input type='radio' name='Q8' value='0'> Disagree <br>
             Do you feel like you are working at your maximum performance ?
             <input type='radio' name='Q9' value='5'> Strongly Agree  <input type='radio' name='Q9' value='4'> Agree <input type='radio' name='Q9' value='3'> Neutral <input type='radio' name='Q9' value='0'> Disagree <br>
            </tr>
        </table>
            <td> <input type="submit" value="Confirm"/></td>
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