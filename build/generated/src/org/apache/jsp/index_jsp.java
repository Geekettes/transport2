package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Transport Department</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sidenav\">\n");
      out.write("            <a href=\"#\">HOME</a>\n");
      out.write("            <a href=\"#\">PROFILE</a>\n");
      out.write("            <a href=\"#\">SETTINGS</a>\n");
      out.write("            <a href=\"#\">LOG OUT </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t<div class=\"tabbed\">\n");
      out.write("\t\t<!-- first panel-->\n");
      out.write("\t<input name=\"tabbed\" id=\"tabbed1\" type=\"radio\" checked>\n");
      out.write("            <section>\n");
      out.write("\t\t<h1>\n");
      out.write("                    <label for=\"tabbed1\">Register Vehicle</label>\n");
      out.write("\t\t</h1>\n");
      out.write("                <div class=\"forms\" id=\"carreg\">\n");
      out.write("                    <form>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\t\t<!--second panel-->\n");
      out.write("        <input name=\"tabbed\" id=\"tabbed2\" type=\"radio\" >\n");
      out.write("            <section>\n");
      out.write("\t\t<h1>\n");
      out.write("                    <label for=\"tabbed2\">Register Driver</label>\n");
      out.write("\t\t</h1>\n");
      out.write("                <div>\n");
      out.write("                    <p>form ya driver</p>\n");
      out.write("\t\t</div>\n");
      out.write("            </section>\n");
      out.write("        <!--third panel-->\n");
      out.write("        <input name=\"tabbed\" id=\"tabbed3\" type=\"radio\" checked>\n");
      out.write("            <section>\n");
      out.write("\t\t<h1>\n");
      out.write("                    <label for=\"tabbed3\">Register Mechanic</label>\n");
      out.write("\t\t</h1>\n");
      out.write("\t\t<div>\n");
      out.write("                    <p>form ya mechanic</p>\n");
      out.write("\t\t</div>\n");
      out.write("            </section>\n");
      out.write("\t<input name=\"tabbed\" id=\"tabbed4\" type=\"radio\" checked>\n");
      out.write("            <section>\n");
      out.write("                <h1>\n");
      out.write("                    <label for=\"tabbed4\">Approve/Cancel Trip</label>\n");
      out.write("\t\t</h1>\n");
      out.write("\t\t<div>\n");
      out.write("                    <p>form ya trips</p>\n");
      out.write("\t\t</div>\n");
      out.write("            </section>\n");
      out.write("\t<input name=\"tabbed\" id=\"tabbed5\" type=\"radio\" checked>\n");
      out.write("            <section>\n");
      out.write("\t\t<h1>\n");
      out.write("                    <label for=\"tabbed5\">Assign Mechanic</label>\n");
      out.write("\t\t</h1>\n");
      out.write("                <div>\n");
      out.write("                    <p>form5 </p>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("        <input name=\"tabbed\" id=\"tabbed6\" type=\"radio\" checked>\n");
      out.write("\t    <section>\n");
      out.write("\t\t<h1>\n");
      out.write("                    <label for=\"tabbed6\">Assign Driver</label>\n");
      out.write("\t\t</h1>\n");
      out.write("\t\t<div>\n");
      out.write("                    <p>form6</p>\n");
      out.write("\t\t</div>\n");
      out.write("            </section>\n");
      out.write("\t</div>\n");
      out.write("        </div>   \n");
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
