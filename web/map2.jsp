<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx" class="no-js">
<%@ page import="service.*" %>
<%@ page import="bean.*" %>
<%@ page import="java.util.*" %>

<head>
	<!-- Mobile Specific Meta -->
	

	<!--
            CSS
            ============================================= -->
	
	<link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css"
   integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
   crossorigin=""/>
<script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"
   integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
   crossorigin=""></script>
   
   <link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
   
   
</head>


<body>
    
    
      <%
      PositionService ps=new PositionService();
      %>
           <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="http://localhost:43830/localisation/qst1.jsp">Afficher les smartphones d’un utilisateur <span class="sr-only">(current)</span></a>
                    </li>

                    <li class="nav-item active">
                        <a class="nav-link" href="http://localhost:43830/localisation/graphe2.jsp">Afficher un graphe qui illustre le nombre des positions récupérer par 
smartphone </a>
                    </li>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="http://localhost:43830/localisation/graphe3.jsp">Afficher un graphe qui illustre le nombre des positions récupérer par 
smartphone </a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="http://localhost:43830/localisation/map2.jsp">Afficher les positions d’un utilisateur entre deux dates dans une map</a>
                    </li>
                   

                </ul>
              
            </div>
           </nav><br><br>
	<!-- Start Header Area -->
	
	
	<!-- Start Banner Area -->
	
	<!-- End Banner Area -->
	
	<!-- Start Button -->
	

	<!-- Start Align Area -->
	<div class="whole-wrap pb-100">
		<div class="container">

				 
			
	
			<div class="section-top-border">
			<br>
			<br>
			<center>
			<div id="map" style="width: 600px; height: 400px; position: relative; outline: none;" class="leaflet-container leaflet-touch leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom" tabindex="0"></div>
			</center>
				
			</div>
		</div>
	</div>
	


	<!-- start footer Area -->

	<!-- End footer Area -->
	
	<script>
	var mymap = L.map('map').setView([31.613627, -7.990826], 13);

	L.tileLayer('http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
	    maxZoom: 18,
	    attribution: 'Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors, ' +
	                 '<a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, ' +
	                 'Imagery © <a href="http://mapbox.com">Mapbox</a>',
	    id: 'mapbox.streets'
	}).addTo(mymap);
        <%for(Position p:ps.findAll() ){%>
            var market = L.market([<%=p.getLatitude()%>,<%=p.getLongitude()%>].addTo(mymap));
            
           <%
        }%> 

	
	</script>

	


</body>

</html>
