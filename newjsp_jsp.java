package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.dit.DBService;
import java.sql.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    int uid=2020;
    
            Connection con=DBService.getConnection();
           
            ArrayList x=new ArrayList(300);
            
            ArrayList x1=new ArrayList(300);
            int i=1,count=0,y;
            int j=7;
            
            PreparedStatement pst=con.prepareStatement("select * from regis where id=?");
            pst.setInt( 1, uid);
            ResultSet rst=pst.executeQuery();
            
                    
           rst.next();
           for(i=0;i<5;i++,j++)
           {
               x1.add(i, rst.getString(j));
               
           }
            
            i=0;
             Connection con1=DBService.getConnection();
            PreparedStatement pst1=con1.prepareStatement("select * from questions");
            ResultSet rst1=pst1.executeQuery();
            while(rst1.next())
            {
                x.add(i, rst1.getString(7));
                i++;
                
            }
            for(y=0;y<5;y++)
            {
                if(x.get(y).equals(x1.get(y)))
                {
                    count++;
                }
            }

      out.write("\n");
      out.write("            <font size=10 color=\"red\">\n");
      out.write("            ");
out.println("score="+count+"/5");
            
      out.write("\n");
      out.write("            </font>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            \n");
      out.write("    ");
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
