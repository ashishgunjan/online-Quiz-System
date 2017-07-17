package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dit.DBService;
import java.sql.*;;

public final class updatequestion3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

     String newq=request.getParameter("newq");
     String op1=request.getParameter("newop1");
     String op2=request.getParameter("newop2");
     String op3=request.getParameter("newop3");
     String op4=request.getParameter("newop4");
     String answer=request.getParameter("newans");
     int qno=Integer.parseInt(request.getParameter("qno"));
     
     Connection con1=DBService.getConnection();
    
    PreparedStatement pst1=con1.prepareStatement("update questions set ques=? where sno=?");
    pst1.setString(1,newq);
    pst1.setInt(2,qno);
    
    Connection con2=DBService.getConnection();
    PreparedStatement pst2=con2.prepareStatement("update questions set op1=? where sno=?");
    pst2.setString(1,newq);
    pst2.setInt(2,qno);
    
    Connection con3=DBService.getConnection();
    PreparedStatement pst3=con3.prepareStatement("update questions set op2=? where sno=?");
    pst3.setString(1,newq);
    pst3.setInt(2,qno);
    
    Connection con4=DBService.getConnection();
    PreparedStatement pst4=con4.prepareStatement("update questions set op3=? where sno=?");
    pst4.setString(1,newq);
    pst4.setInt(2,qno);
    
    Connection con5=DBService.getConnection();
    PreparedStatement pst5=con5.prepareStatement("update questions set op4=? where sno=?");
    pst5.setString(1,newq);
    pst5.setInt(2,qno);
    
    Connection con6=DBService.getConnection();
    PreparedStatement pst6=con6.prepareStatement("update questions set answer=? where sno=?");
    pst6.setString(1,newq);
    pst6.setInt(2,qno);
    con1.close();
    con2.close();
    con3.close();
    con4.close();
    con5.close();
    con6.close();
        
    response.sendRedirect("updatequestion1.jsp");
    
     
     
     
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
