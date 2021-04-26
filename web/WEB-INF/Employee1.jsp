 <html>
<head>
 <jsp:include page="headerEm.jsp"/>
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
 
      google.charts.load('current', {'packages':['line']});
      google.charts.setOnLoadCallback(drawChart);

    function drawChart() {

      var data = new google.visualization.DataTable();
      data.addColumn('number', 'Sales (£) Monday - Friday ');
      data.addColumn('number', 'Current Week');
      data.addColumn('number', 'Previous Week');
      data.addColumn('number', 'Adverage Week');
      data.addRows([
        [1, 500, 643, 450],
        [2,  300, 243, 300],
        [3,  456, 500, 460],
        [4,  673, 550, 500],
        [5,  764, 287, 480],
 
      ]);

      var options = {
        chart: {
          title: 'Total sales per Day- Becca Lambert',
          subtitle: 'in British Pounts £ (GBP)'
        },
        width: 900,
        height: 500,
        axes: {
          x: {
            0: {side: 'top'}
          }
        }
      };

      var chart = new google.charts.Line(document.getElementById('line_top_x'));

      chart.draw(data, google.charts.Line.convertOptions(options));
    }
  </script>

</head>
<body>
  <div id="line_top_x"></div>
</body>

<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['bar']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Month', 'Complaints'],
          ['JAN', 3],
          ['FEB', 1]
       
        ]);

        var options = {
          chart: {
            title: 'Company Performance',
            subtitle: 'Becca Lambert',
          },
          bars: 'horizontal' // Required for Material Bar Charts.
        };

        var chart = new google.charts.Bar(document.getElementById('barchart_material'));

        chart.draw(data, google.charts.Bar.convertOptions(options));
      }
    </script>
  </head>
  <body>
    <div id="barchart_material" style="width: 900px; height: 500px;"></div>
  </body>
  
 <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load("current", {packages:["corechart"]});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Clocking In time', 'percentage '],
          ['Lates',     4],
          ['On Time',      5],
          ['Late within 10 mins',  1],
         
        ]);


      var options = {
        legend: 'none',
        pieSliceText: 'label',
        title: 'Clocking in Times ',
        pieStartAngle: 100,
      };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="piechart" style="width: 900px; height: 500px;"></div>
  </body>
    <body>
        
        <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['table']});
      google.charts.setOnLoadCallback(drawTable);

      function drawTable() {
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Name');
        data.addColumn('string', 'Attitude');
        data.addColumn('string', 'Time Management');
        data.addColumn('string', 'Punctuality');
        data.addColumn('string', 'Management Relations');
       
       
        data.addRows([
          ['Becca Lambert', "5/20", "13/20", "17/20","10/20"],
         
        ]);

        var table = new google.visualization.Table(document.getElementById('table_div'));

        table.draw(data, {showRowNumber: true, width: '100%', height: '100%'});
      }
    </script>
  </head>
  <body>
    <div id="table_div"></div>
  </body>
jsp:include page="headerEm.jsp"/>
        </body>
</html>

