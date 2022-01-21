package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Smartphone;
import service.SmartphoneService;
import service.PositionService;

public final class graphe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/chart.js@2.8.0\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>GRAPHE</h1>\n");
      out.write("        <div>\n");
      out.write("            <canvas id=\"myChart\"></canvas>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            Chart.defaults.global.title.display = true;\n");
      out.write("            Chart.defaults.global.title.text = \"pas de titre\";\n");
      out.write("            Chart.defaults.global.elements.point.raduis = 10;\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            ");
  
                
                PositionService positionService=new PositionService();
                
                SmartphoneService smartphoneService=new SmartphoneService();
                
            
      out.write("\n");
      out.write("            var ctx = document.getElementById('myChart').getContext('2d');\n");
      out.write("            var chart = new Chart(ctx, {\n");
      out.write("                // The type of chart we want to create\n");
      out.write("                type: 'bar',\n");
      out.write("                // The data for our dataset\n");
      out.write("                data: {\n");
      out.write("                    labels: [");
 for (Smartphone s : smartphoneService.findAll()) {
      out.write('"');
      out.print( s.getImei());
      out.write('"');
      out.write(',');
 }
      out.write("\"\"],...\n");
      out.write("                            datasets: [{\n");
      out.write("                                    data: [");
 for (Smartphone s : smartphoneService.findAll()) {
      out.print( positionService.nbrPositionParSmart(s.getImei()));
      out.write(',');
 }
      out.write("0],\n");
      out.write("                                    lineTension: 0,\n");
      out.write("                                    backgroundColor: 'rgb(0, 0, 0,0.80)',\n");
      out.write("                                    borderColor: 'rgb(0, 0, 0)',\n");
      out.write("                                    borderWidth: 4,\n");
      out.write("                                    pointBackgroundColor: '#OOOO',\n");
      out.write("                                    label:\"nombre des postions par smartphone\"\n");
      out.write("\n");
      out.write("                                }]\n");
      out.write("                },\n");
      out.write("                // Configuration options go here\n");
      out.write("                options: {\n");
      out.write("                    title: {\n");
      out.write("                        text: \"Evolution \"\n");
      out.write("                    },\n");
      out.write("                    elements: {\n");
      out.write("                        point: {\n");
      out.write("                            radius: 10\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
