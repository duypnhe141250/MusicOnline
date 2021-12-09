package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Song;

public final class song_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Music Wave</title>\n");
      out.write("        <!-- Description, Keywords and Author -->\n");
      out.write("        <meta name=\"description\" content=\"Your description\">\n");
      out.write("        <meta name=\"keywords\" content=\"Your,Keywords\">\n");
      out.write("        <meta name=\"author\" content=\"HimanshuGupta\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Styles -->\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\t\n");
      out.write("        <!-- Animate CSS -->\n");
      out.write("        <link href=\"css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Basic stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("        <!-- Font awesome CSS -->\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\t\t\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style-color.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/logo/favicon.ico\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <header>\n");
      out.write("                <!-- secondary menu -->\n");
      out.write("                <nav class=\"secondary-menu\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <!-- secondary menu left link area -->\n");
      out.write("                        <div class=\"sm-left\">\n");
      out.write("                            <strong>Phone</strong>:&nbsp; <a href=\"#\">0981949455</a>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            <strong>E-mail</strong>:&nbsp; <a href=\"#\">duypnhe141250@fpt.edu.vn</a>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- secondary menu right link area -->\n");
      out.write("                        <div class=\"sm-right\">\n");
      out.write("                            <!-- social link -->\n");
      out.write("                            <div class=\"sm-social-link\">\n");
      out.write("\n");
      out.write("                                ");
 if (session.getAttribute("u")
                                            != null) { 
      out.write("\n");
      out.write("                                Welcome &nbsp; ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.u}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", &nbsp; <a href=\"login.jsp\" style=\"color: white\">\n");
      out.write("                                    <h6>Log out</h6>\n");
      out.write("                                </a>\n");
      out.write("                                ");
 } else {
      out.write("\n");
      out.write("                                <a href=\"login.jsp\" style=\"color: white\">\n");
      out.write("                                    Login\n");
      out.write("                                </a> \n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                                <i></i>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- primary menu -->\n");
      out.write("                <nav class=\"navbar navbar-fixed-top navbar-default\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <!-- logo area -->\n");
      out.write("                            <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                                <!-- logo image -->\n");
      out.write("\n");
      out.write("                                <img class=\"img-responsive\" src=\"img/logo/logoMusic.jpg\" alt=\"\" />\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                                <li><a href=\"#featuredalbum\">Album</a></li>                              \n");
      out.write("                                <li><a href=\"#portfolio\">Find songs</a></li>\n");
      out.write("                                <li><a href=\"#events\">Your songs</a></li>\n");
      out.write("                                <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div><!-- /.navbar-collapse -->\n");
      out.write("                    </div><!-- /.container-fluid -->\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <!--/ header end -->\n");
      out.write("\n");
      out.write("            <!-- banner area -->\n");
      out.write("            <div class=\"banner\">\n");
      out.write("                <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <!-- Wrapper for slides -->\n");
      out.write("                    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                        <div class=\"item active\">\n");
      out.write("                            <img src=\"img/banner/b1.jpg\" alt=\"...\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <!-- banner caption -->\n");
      out.write("                                <div class=\"carousel-caption slide-one\">\n");
      out.write("                                    <!-- heading -->\n");
      out.write("                                    <h2 class=\"animated fadeInLeftBig\"><i class=\"fa fa-music\"></i> Melodi For You!</h2>\n");
      out.write("                                    <!-- paragraph -->\n");
      out.write("                                    <h3 class=\"animated fadeInRightBig\">Find More Innovative &amp; Creative Music Albums.</h3>\n");
      out.write("                                    <!-- button -->\n");
      out.write("                                    <a href=\"#\" class=\"animated fadeIn btn btn-theme\">Download Here</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <img src=\"img/banner/b2.jpg\" alt=\"...\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <!-- banner caption -->\n");
      out.write("                                <div class=\"carousel-caption slide-two\">\n");
      out.write("                                    <!-- heading -->\n");
      out.write("                                    <h2 class=\"animated fadeInLeftBig\"><i class=\"fa fa-headphones\"></i> Listen It...</h2>\n");
      out.write("                                    <!-- paragraph -->\n");
      out.write("                                    <h3 class=\"animated fadeInRightBig\">Lorem ipsum dolor sit amet, consectetur elit.</h3>\n");
      out.write("                                    <!-- button -->\n");
      out.write("                                    <a href=\"#\" class=\"animated fadeIn btn btn-theme\">Listen Now</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Controls -->\n");
      out.write("                    <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                        <span class=\"fa fa-arrow-left\" aria-hidden=\"true\"></span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("                        <span class=\"fa fa-arrow-right\" aria-hidden=\"true\"></span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--/ banner end -->\n");
      out.write("\n");
      out.write("            <!-- block for animate navigation menu -->\n");
      out.write("            <div class=\"nav-animate\"></div> \n");
      out.write("            <!-- Hero block area -->\n");
      out.write("            <div id=\"latestalbum\" class=\"hero pad\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- hero content -->\n");
      out.write("                    <div class=\"hero-content \">\n");
      out.write("                        <!-- heading -->\n");
      out.write("                        <h2>List song</h2>\n");
      out.write("                        <hr>\n");
      out.write("                        <!-- paragraph -->\n");
      out.write("                        <p>We sing the best <strong class=\"theme-color\">Songs</strong> and now we control the world best <strong class=\"theme-color\">Music</strong>.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- hero play list -->\n");
      out.write("\n");
      out.write("                    <div style=\"text-align: center\">\n");
      out.write("                        ");
 List<Song> list = (List<Song>) request.getAttribute("listSong"); 
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\"list-unstyled\" >\n");
      out.write("                                    ");

                                        for (Song s : list) {
                                    
      out.write("\n");
      out.write("                                    <div style=\"margin: 30px; display: flex ;justify-content: center;\">\n");
      out.write("                                        <div style=\"\">\n");
      out.write("                                            <img src=\"");
      out.print( s.getImage());
      out.write("\" style=\"width: 100px ;height: 100px\"/>\n");
      out.write("                                            <h4>");
      out.print( s.getSongName());
      out.write("</h4> \n");
      out.write("                                        </div>\n");
      out.write("                                        <div style=\"\" class=\"playlist-number\">\n");
      out.write("                                            <!-- song information -->\n");
      out.write("                                            <div class=\"song-info\">\n");
      out.write("                                                <!-- song title -->\n");
      out.write("\n");
      out.write("                                                <p><strong>Album</strong>: ");
      out.print( s.getCategoryID());
      out.write(" &nbsp;|&nbsp; <strong>Type</strong>: Rock &nbsp;|&nbsp; <strong>Singer</strong>: Dawn</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- music icon -->\n");
      out.write("                                            <div class=\"music-icon\">\n");
      out.write("\n");
      out.write("                                                <audio controls controlsList=\"nodownload\">\n");
      out.write("                                                    <source src=\"");
      out.print( s.getSource());
      out.write("\"  type=\"audio/mp3\" >\n");
      out.write("                                                </audio>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                           \n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--/ hero end -->\n");
      out.write("\n");
      out.write("            <!-- footer -->\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- social media links -->\n");
      out.write("                    <div class=\"social\">\n");
      out.write("                        <a class=\"h-facebook\" href=\"https://www.facebook.com/\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        <a class=\"h-twitter\" href=\"https://mobile.twitter.com/login\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        <a class=\"h-google\" href=\"https://www.google.com/gmail/about/\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- copy right -->\n");
      out.write("                    <p class=\"copy-right\">&copy; copyright 2018, All rights are reserved.</p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- footer end -->\n");
      out.write("\n");
      out.write("            <!-- Scroll to top -->\n");
      out.write("            <span class=\"totop\"><a href=\"#\"><i class=\"fa fa-chevron-up\"></i></a></span> \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Javascript files -->\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <!-- Bootstrap JS -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- WayPoints JS -->\n");
      out.write("        <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("        <!-- Include js plugin -->\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- One Page Nav -->\n");
      out.write("        <script src=\"js/jquery.nav.js\"></script>\n");
      out.write("        <!-- Respond JS for IE8 -->\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <!-- HTML5 Support for IE -->\n");
      out.write("        <script src=\"js/html5shiv.js\"></script>\n");
      out.write("        <!-- Custom JS -->\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("    </div>   \n");
      out.write("\n");
      out.write("</body>\n");
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
