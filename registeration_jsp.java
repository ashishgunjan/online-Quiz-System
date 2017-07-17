package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import com.dit.DBService;
import java.sql.Connection;

public final class registeration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<div></div>\n");
      out.write("<center>\n");
      out.write("    <table width=\"80%\">\n");
      out.write("        <tr bgcolor=\"#@#4fdf\">\n");
      out.write("            <td>\n");
      out.write("                <center><marquee>\n");
      out.write("                        <h1><font size=7 color=#redttt>DIT UINVERSITY</font></h1>\n");
      out.write("            </marquee></center>   \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("</center>");
      out.write("\n");
      out.write("<center>\n");
      out.write("    <table width=\"80%\">\n");
      out.write("        <tr bgcolor=\"#ddaappp\">\n");
      out.write("            <td>\n");
      out.write("        <center>\n");
      out.write("            <form action=\"addrecord\">\n");
      out.write("                <pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </pre>\n");
      out.write("                Enter Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name=\"id\"><br><br>\n");
      out.write("                Enter pass.<input name=\"password\"><br><br>\n");
      out.write("                Enter Name:&nbsp;&nbsp;&nbsp;<input name=\"name\"><br><br>\n");
      out.write("                Enter mob.:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name=\"phone\"><br><br>\n");
      out.write("                Enter Curr.Year:<input name=\"year\"><br><br>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                 <input type=\"submit\" value=\"Submit\">\n");
      out.write("                 <pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <a href=\"Login.html\">Click Here To Go To LOGIN PAGE.</a>\n");
      out.write("                 </pre>\n");
      out.write("            </form>\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </center>\n");
      out.write("                  </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("</center>\n");
      out.write("<center>\n");
      out.write("    <table width=\"80%\">\n");
      out.write("        <tr bgcolor=\"red\">\n");
      out.write("            <td>\n");
      out.write("        <center><font color=yellow size=\"4\">@copyright 2016 ashish.ashish02@gmail.com</font></center>   \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("</center>");
      out.write("        ");
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
