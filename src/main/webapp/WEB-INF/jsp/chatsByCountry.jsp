
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);
      
      var chatsByCountry = '<c:out value="${chatsByCountry}"/>';
      
      var data = {
    	        <c:forEach items="${chatsByCountry}" var="chat" varStatus="loop">
    	            '${chat[0]}': ${chat[1]}${!loop.last ? ',' : ''}
    	        </c:forEach>
    	    };
      var array = Object.keys(data).map(function (key) {return [key, data[key]]});
      array.unshift(['Country', 'Messages Count']);
  	    
      console.log(array);
      
      function drawChart() { 	  
        var data = google.visualization.arrayToDataTable(
          array
        );

        var options = {
          title: 'Message count by country'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    
    <div id="piechart" style="width: 900px; height: 500px;"></div>

  </body>
</html>