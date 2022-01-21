package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Smartphone;
import service.UserService;
import service.SmartphoneService;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\" class=\"no-js\">\n");
      out.write("    <head>\n");
      out.write("\t<!-- Mobile Specific Meta -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t<!-- Favicon-->\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"img/fav.png\">\n");
      out.write("\t<!-- Author Meta -->\n");
      out.write("\t<meta name=\"author\" content=\"CodePixar\">\n");
      out.write("\t<!-- Meta Description -->\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<!-- Meta Keyword -->\n");
      out.write("\t<meta name=\"keywords\" content=\"\">\n");
      out.write("\t<!-- meta character set -->\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<!-- Site Title -->\n");
      out.write("\t<title>Smartphone Manage</title>\n");
      out.write("\n");
      out.write("\t<!--\n");
      out.write("            CSS\n");
      out.write("            ============================================= -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/linearicons.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/nice-select.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/nouislider.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://unpkg.com/leaflet@1.7.1/dist/leaflet.css\"\n");
      out.write("   integrity=\"sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A==\"\n");
      out.write("   crossorigin=\"\"/>\n");
      out.write("<script src=\"https://unpkg.com/leaflet@1.7.1/dist/leaflet.js\"\n");
      out.write("   integrity=\"sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA==\"\n");
      out.write("   crossorigin=\"\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<!-- Start Header Area -->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!-- Start Banner Area -->\n");
      out.write("\t<section class=\"banner-area organic-breadcrumb\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end\">\n");
      out.write("\t\t\t\t<div class=\"col-first\">\n");
      out.write("\t\t\t\t\t<h1></h1>\n");
      out.write("\t\t\t\t\t<nav class=\"d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\"><span class=\"lnr lnr-arrow-right\"></span></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"category.html\"></a>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
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
      out.write("\n");
      out.write("\t\t\t\t<h3 class=\"mb-30\">lISTE DES SMARTPHONES</h3>\n");
      out.write("\t\t\t\t<div class=\"progress-table-wrap\">\n");
      out.write("\t\t\t\t\t<div class=\"progress-table\">\n");
      out.write("\t\t\t\t\t\t<div class=\"table-head\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"serial\">#</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"country\">IMEI</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"visit\">PROPRIETERE</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"percentage\">OPTIONS</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                                \t\t\t\t\t\n");
      out.write("                                               ");

                 UserService userS = new UserService();                                   
                SmartphoneService smartphoneService = new SmartphoneService();
                for (Smartphone p : smartphoneService.findAll()) {
            
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("            \t\t\t\t<div class=\"table-row\">\n");
      out.write("\t\t\t\t\t<div class=\"serial\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"visit\"> ");
      out.print(p.getImei());
      out.write("</div>\n");
      out.write("\t\t\t\t\t<div class=\"visit\">");
      out.print(p.getUser() );
      out.write("  </div>\n");
      out.write("\t\t\t\t\t<div class=\"percentage\">\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"genric-btn info\">Info</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\n");
      out.write("                                \n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- start footer Area -->\n");
      out.write("\t<footer class=\"footer-area section_gap\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3  col-md-6 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"single-footer-widget\">\n");
      out.write("\t\t\t\t\t\t<h6>About Us</h6>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore dolore\n");
      out.write("\t\t\t\t\t\t\tmagna aliqua.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4  col-md-6 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"single-footer-widget\">\n");
      out.write("\t\t\t\t\t\t<h6>Newsletter</h6>\n");
      out.write("\t\t\t\t\t\t<p>Stay update with our latest</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"\" id=\"mc_embed_signup\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<form target=\"_blank\" novalidate=\"true\" action=\"https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01\"\n");
      out.write("\t\t\t\t\t\t\t method=\"get\" class=\"form-inline\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"d-flex flex-row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"EMAIL\" placeholder=\"Enter Email\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Enter Email '\"\n");
      out.write("\t\t\t\t\t\t\t\t\t required=\"\" type=\"email\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"click-btn btn btn-default\"><i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i></button>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"position: absolute; left: -5000px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"b_36c4fd991d266f23781ded980_aefe40901a\" tabindex=\"-1\" value=\"\" type=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <div class=\"col-lg-4 col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"bb-btn btn\"><span class=\"lnr lnr-arrow-right\"></span></button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>  -->\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"info\"></div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-3  col-md-6 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"single-footer-widget mail-chimp\">\n");
      out.write("\t\t\t\t\t\t<h6 class=\"mb-20\">Instragram Feed</h6>\n");
      out.write("\t\t\t\t\t\t<ul class=\"instafeed d-flex flex-wrap\">\n");
      out.write("\t\t\t\t\t\t\t<li><img src=\"img/i1.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><img src=\"img/i2.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><img src=\"img/i3.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><img src=\"img/i4.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><img src=\"img/i5.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><img src=\"img/i6.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><img src=\"img/i7.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li><img src=\"img/i8.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-2 col-md-6 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"single-footer-widget\">\n");
      out.write("\t\t\t\t\t\t<h6>Follow Us</h6>\n");
      out.write("\t\t\t\t\t\t<p>Let us be social</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-social d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-behance\"></i></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footer-bottom d-flex justify-content-center align-items-center flex-wrap\">\n");
      out.write("\t\t\t\t<p class=\"footer-text m-0\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>  Downloaded from <a href=\"https://themeslab.org/\" target=\"_blank\">Themeslab</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\t<script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\"\n");
      out.write("\t crossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"js/vendor/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("\t<script src=\"js/nouislider.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<!--gmaps Js-->\n");
      out.write("\t<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE\"></script>\n");
      out.write("\t<script src=\"js/gmaps.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
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
