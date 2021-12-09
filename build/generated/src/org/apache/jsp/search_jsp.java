package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Song;
import model.Song;
import java.util.List;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("        <style>\n");
      out.write("            .carousel-caption{\n");
      out.write("                margin: auto;\n");
      out.write("                width: 80%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h2 class=\"animated fadeInLeftBig\" style=\"color: red\"><i class=\"fa fa-music\" style=\"color: red\"></i> Find your song</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"searchServlet\" method=\"post\">\n");
      out.write("            <input style=\"padding: 10px;color: #000; width: 500px\" name=\"info\" width=\"100%\" transition: all=\"3s ease-in-out\" type=\"text\" placeholder=\"Search for artist,song,album\"/> &nbsp;\n");
      out.write("            <input style=\"color: #000\" type=\"submit\"  value=\"Search\" /></form>\n");
      out.write("\n");
      out.write("            <div style=\"text-align: center\">\n");
      out.write("                ");
 List<Song> list = (List<Song>) request.getAttribute("list"); 
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"list-unstyled\" >\n");
      out.write("                            ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("          ");

                                for (Song s : list) {
                            
              out.write("\n");
              out.write("                            <div style=\"margin: 30px; display: flex ;justify-content: center;\">\n");
              out.write("                                <div style=\"\">\n");
              out.write("                                    <img src=\"");
              out.print( s.getImage());
              out.write("\" style=\"width: 100px ;height: 100px\"/>\n");
              out.write("                                    <h4>");
              out.print( s.getSongName());
              out.write("</h4> \n");
              out.write("                                </div>\n");
              out.write("                                <div style=\"\" class=\"playlist-number\">\n");
              out.write("                                    <!-- song information -->\n");
              out.write("                                    <div class=\"song-info\">\n");
              out.write("                                        <!-- song title -->\n");
              out.write("\n");
              out.write("                                        <p><strong>Album</strong>: ");
              out.print( s.getCategoryID());
              out.write(" &nbsp;|&nbsp; <strong>Type</strong>: Rock &nbsp;|&nbsp; <strong>Singer</strong>: Dawn</p>\n");
              out.write("                                    </div>\n");
              out.write("                                    <!-- music icon -->\n");
              out.write("                                    <div class=\"music-icon\">\n");
              out.write("\n");
              out.write("                                        <audio controls controlsList=\"nodownload\">\n");
              out.write("                                            <source src=\"");
              out.print( s.getSource());
              out.write("\"  type=\"audio/mp3\" >\n");
              out.write("                                        </audio>\n");
              out.write("\n");
              out.write("                                        \n");
              out.write("\n");
              out.write("                                    </div>\n");
              out.write("\n");
              out.write("                                    <div class=\"clearfix\"></div>\n");
              out.write("                                </div>\n");
              out.write("                            </div>\n");
              out.write("                            ");
}
              out.write("\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("    \n");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
