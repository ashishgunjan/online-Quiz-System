package org.apache.jsp.jsp_0020pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dit.DBService;
import java.sql.*;;

public final class updatequestion2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("\n");

    int qno1=Integer.parseInt(request.getParameter("qno"));
    String qs="question";
    
    
    
  Connection con1=DBService.getConnection();
    
    PreparedStatement pst6=con1.prepareStatement("select * from questions where sno=?");
    pst6.setInt(1,qno1);
    

  ResultSet rst6=pst6.executeQuery();
  while(rst6.next())
  {
      
       qs=rst6.getString(2);
       ;
      
  }
  
      out.write("\n");
      out.write("  Previous question:-<br>\n");
      out.write("  <font size=\"6\">Q");
      out.print(qno1);
      out.write(' ');
      out.print(qs);
      out.write("</font>\n");
      out.write("  \n");
      out.write("  <fieldset>\n");
      out.write("    <legend><font color=#WWWqo size=\"5\">Question updation form:-</font></legend>\n");
      out.write("<form action=\"updatequestion3.jsp\" method=\"post\">\n");
      out.write("        <pre>\n");
      out.write("  ENTER THE NEW QUESTION:-<BR>\n");
      out.write("<input type=\"text\" name=\"form2\"  size=\"100\" name=\"newq\">\n");
      out.write("Enter 1<sup>st</sup> option:-\n");
      out.write("<input type=\"text\" name=\"newop1\">\n");
      out.write("Enter 2<sup>nd</sup> option:-\n");
      out.write("<input type=\"text\" name=\"newop2\">\n");
      out.write("Enter 3<sup>rd</sup> option:-\n");
      out.write("<input type=\"text\" name=\"newop3\">\n");
      out.write("Enter 4<sup>th</sup> option:-\n");
      out.write("<input type=\"text\" name=\"newop4\">\n");
      out.write("\n");
      out.write("Enter the correct answer:-\n");
      out.write("<input type=\"text\" name=\"newans\">\n");
      out.write("<input type=\"hidden\" name=\"qno\" value=\"");
      out.print(qno1);
      out.write("\">\n");
      out.write("<input type=\"submit\" value=\"submit\">\n");
      out.write("</form>\n");
      out.write("    </fieldset>\n");
      out.write("    \n");
      out.write("   ");
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
