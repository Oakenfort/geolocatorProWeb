<%-- 
    Document   : graphe2
    Created on : 17 déc. 2021, 07:46:40
    Author     : HIND
--%>

<%@page import="bean.Smartphone"%>
<%@page import="service.SmartphoneService"%>
<%@page import="service.PositionService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
          <script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>
          
           <link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        
        
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
        <h1>GRAPHE</h1>
        <div>
            <canvas id="myChart"></canvas>
        </div>
        <script>
            Chart.defaults.global.title.display = true;
            Chart.defaults.global.title.text = "pas de titre";
            Chart.defaults.global.elements.point.raduis = 10;
        </script>
        <script>
            <%  PositionService positionService=new PositionService();
                
                SmartphoneService smartphoneService=new SmartphoneService();
            %>
            var ctx = document.getElementById('myChart').getContext('2d');
            var chart = new Chart(ctx, {
                // The type of chart we want to create
                type: 'bar',
                // The data for our dataset
                data: {
                    labels: [<% for (Smartphone s : smartphoneService.findAll()) {%>"<%= s.getImei()%>",<% }%>""],
                            datasets: [{
                                    data: [<% for (Smartphone s : smartphoneService.findAll()) {%><%= positionService.nbrPositionParSmart(s.getImei())%>,<% }%>0],
                                    lineTension: 0,
                                    backgroundColor: 'rgb(0, 0, 0,0.80)',
                                    borderColor: 'rgb(0, 0, 0)',
                                    borderWidth: 4,
                                    pointBackgroundColor: '#007bff',
                                    label:"nombre des positions par smartphone"

                                }]
                },
                
                
              
                
                
                
                // Configuration options go here
                options: {
                    title: {
                        text: "Evolution "
                    },
                    elements: {
                        point: {
                            radius: 10
                        }
                    }

                }
            });

        </script>
    </body>
</html>
