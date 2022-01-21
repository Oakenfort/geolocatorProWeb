package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import service.*;
import bean.*;
import java.util.*;

public final class map2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\" class=\"no-js\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<!-- Mobile Specific Meta -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<!--\n");
      out.write("            CSS\n");
      out.write("            ============================================= -->\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://unpkg.com/leaflet@1.7.1/dist/leaflet.css\"\n");
      out.write("   integrity=\"sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A==\"\n");
      out.write("   crossorigin=\"\"/>\n");
      out.write("<script src=\"https://unpkg.com/leaflet@1.7.1/dist/leaflet.js\"\n");
      out.write("   integrity=\"sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA==\"\n");
      out.write("   crossorigin=\"\"></script>\n");
      out.write("   \n");
      out.write("   <link href=\"https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("      ");

      PositionService ps=new PositionService();
      
      out.write("\n");
      out.write("           <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"http://localhost:43830/localisation/qst1.jsp\">Afficher les smartphones d’un utilisateur <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"http://localhost:43830/localisation/graphe2.jsp\">Afficher un graphe qui illustre le nombre des positions récupérer par \n");
      out.write("smartphone </a>\n");
      out.write("                    </li>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"http://localhost:43830/localisation/graphe3.jsp\">Afficher un graphe qui illustre le nombre des positions récupérer par \n");
      out.write("smartphone </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"http://localhost:43830/localisation/map2.jsp\">Afficher les positions d’un utilisateur entre deux dates dans une map</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("           </nav><br><br>\n");
      out.write("\t<!-- Start Header Area -->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!-- Start Banner Area -->\n");
      out.write("\t\n");
      out.write("\t<!-- End Banner Area -->\n");
      out.write("\t\n");
      out.write("\t<!-- Start Button -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<!-- Start Align Area -->\n");
      out.write("\t<div class=\"whole-wrap pb-100\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t \n");
      out.write("\t\t\t\n");
      out.write("\t\n");
      out.write("\t\t\t<div class=\"section-top-border\">\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<center>\n");
      out.write("\t\t\t<div id=\"map\" style=\"width: 600px; height: 400px; position: relative; outline: none;\" class=\"leaflet-container leaflet-touch leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom\" tabindex=\"0\"></div>\n");
      out.write("\t\t\t</center>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- start footer Area -->\n");
      out.write("\n");
      out.write("\t<!-- End footer Area -->\n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\tvar mymap = L.map('map').setView([31.613627, -7.990826], 13);\n");
      out.write("\n");
      out.write("\tL.tileLayer('http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {\n");
      out.write("\t    maxZoom: 18,\n");
      out.write("\t    attribution: 'Map data &copy; <a href=\"http://openstreetmap.org\">OpenStreetMap</a> contributors, ' +\n");
      out.write("\t                 '<a href=\"http://creativecommons.org/licenses/by-sa/2.0/\">CC-BY-SA</a>, ' +\n");
      out.write("\t                 'Imagery © <a href=\"http://mapbox.com\">Mapbox</a>',\n");
      out.write("\t    id: 'mapbox.streets'\n");
      out.write("\t}).addTo(mymap);\n");
      out.write("        ");
for(Position p:ps.findAll() ){
      out.write("\n");
      out.write("            var market = L.market([");
      out.print(p.getLatitude());
      out.write(',');
      out.print(p.getLongitude());
      out.write("].addTo(mymap));\n");
      out.write("            \n");
      out.write("           ");

        }
      out.write(" \n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
