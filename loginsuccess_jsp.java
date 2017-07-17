package org.apache.jsp.jsp_0020pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import com.dit.DBService;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class loginsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=US-ASCII");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=US-ASCII\">\n");
      out.write("<title>Login Success Page</title>\n");
      out.write("<style>\n");
      out.write("    input[type=submit]\n");
      out.write("     {\n");
      out.write("    height:40px;\n");
      out.write("    width:110px; \n");
      out.write("    vertical-align: middle;\n");
      out.write("     }\n");
      out.write("     input[type=radio]\n");
      out.write("     {\n");
      out.write("    height:40px;\n");
      out.write("    width:35px; \n");
      out.write("    vertical-align: middle;\n");
      out.write("     }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");

   
    String uid1=request.getParameter("uid");
    int ivalue1=Integer.parseInt(request.getParameter("ivalue"))+1;
    String q11=request.getParameter("q1");
     if(q11.equalsIgnoreCase("9"))
    {}
    else
    {
        Connection con=DBService.getConnection();
    
   PreparedStatement pst=con.prepareStatement("update regis set ans1=? where id=?");
    pst.setString(1, q11);
    pst.setString(2, uid1);
    int i=pst.executeUpdate();
    con.close();
    }
     
    
     String qs="question";
    String ops1="option1";
    String ops2="option2";
    String ops3="option3";
    String ops4="option4";
    
   
   
    
   
    Connection con1=DBService.getConnection();
    
    PreparedStatement pst6=con1.prepareStatement("select * from questions where sno=?");
    pst6.setInt(1,ivalue1);
    con1.close();
/*String userName = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("uid")) userName = cookie.getValue();
}
}
if(userName == null) response.sendRedirect("Login.html");*/

  ResultSet rst6=pst6.executeQuery();
  while(rst6.next())
  {
       qs=rst6.getString(2);
       ops1=rst6.getString(3);
       ops2=rst6.getString(4);
       ops3=rst6.getString(5);
       ops4=rst6.getString(6);
  }

      out.write("\n");
      out.write("<body background=\"images/quiz.jpg\">\n");
      out.write("<font size=\"4\" face=\"Cooper Black\" color=\"990099\"> <h3>Hi ,");
      out.print(uid1);
      out.write(" Login successful.</h3></font>\n");
      out.write("<br>\n");
      out.write("value of i=");
      out.print(ivalue1);
      out.write("\n");
      out.write("<form action=\"LogoutServlet\" method=\"post\">\n");
      out.write("<input type=\"submit\" value=\"Logout\" >\n");
      out.write("</form>\n");
      out.write("<form action=\"jsp pages/loginsuccess.jsp\" method=\"post\">\n");
      out.write("    <input type=\"text\" name=\"uid\" value=\"");
      out.print(uid1);
      out.write("\">\n");
      out.write("                                  i value=");
      out.print(ivalue1);
      out.write("\n");
      out.write("                                 \n");
      out.write("                                 <input type=\"text\" name=\"ivalue\" value=\"");
      out.print(ivalue1);
      out.write("\">\n");
      out.write("    <br><B> <font size=\"10\" face=\"Forte\" color=\"FF0033\"> Q.");
      out.print(qs);
      out.write("?</font><B><br><br>\n");
      out.write("            <input type=\"radio\" name=\"q1\" value=\"");
      out.print(ops1);
      out.write("\"><font size=\"10\" face=\"Arial Rounded MT Bold\" color=\"6600FF\"> <B>1. ");
      out.print(ops1);
      out.write("</B></font>\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"radio\" name=\"q1\" value=\"");
      out.print(ops2);
      out.write("\"><font size=\"10\" face=\"Arial Rounded MT Bold\" color=\"6600FF\"> <B>2. ");
      out.print(ops2);
      out.write("<B></font>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("                        <br><input type=\"radio\" name=\"q1\" value=\"");
      out.print(ops3);
      out.write("\"><font size=\"10\" face=\"Arial Rounded MT Boldk\" color=\"6600FF\"> <B>3. ");
      out.print(ops3);
      out.write("</B></font>\n");
      out.write("                                 &nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"radio\" name=\"q1\" value=\"");
      out.print(ops4);
      out.write("\" size=\"20\"> <font size=\"10\" face=\"Arial Rounded MT Bold\" color=\"6600FF\"> <B>  4.");
      out.print(ops4);
      out.write("</B></font>\n");
      out.write("                                  \n");
      out.write("                                 <br><br> <br><center>  <input type=\"submit\" value=\"submit\"></center>\n");
      out.write("    \n");
      out.write("                                 </font>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                 \n");
      out.write("  </form>\n");
      out.write("                             \n");
      out.write("</body>\n");
      out.write("</html>");
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
