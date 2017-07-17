<%@page import="java.util.ArrayList"%>
<%@page import="com.dit.DBService"%>
<%@page import="java.sql.*"%>
<%
    int uid=Integer.parseInt(request.getParameter(uid));
    
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
%>
            <font size=10 color="red">
            <%out.println("score="+count+"/5");
            %>
            </font>
            

            
    