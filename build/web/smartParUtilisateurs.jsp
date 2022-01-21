<%-- 
    Document   : smartParUtilisateurs
    Created on : 17 déc. 2021, 00:52:07
    Author     : HIND
--%>

<%@page import="bean.Smartphone"%>
<%@page import="service.UserService"%>
<%@page import="service.SmartphoneService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
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
           </nav><br><br><br><br>



        <table class="table table-dark">
            <thead>
            <th>ID</th>
            <th>imei</th>
            <th>user</th>




        </thead>
        <tbody> 
            <%
                SmartphoneService smartphoneService = new SmartphoneService();
                String identi = request.getParameter("users");
                for (Smartphone p : smartphoneService.utilisateurs(identi)) {
            %>
         




            <tr>
                <td> <%= p.getId()%></td>
                <td><%= p.getImei()%></td>
                <td><%= p.getUser()%></td>


            </tr>
            <%
                }
            %>
        </tbody>
    </table>


</body>
</html>
