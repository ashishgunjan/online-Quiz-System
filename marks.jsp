<%@page import="java.util.ArrayList"%>
<%@page import="com.dit.DBService"%>
<%@page import="java.sql.*"%>
<%
    int uid=Integer.parseInt(request.getParameter("uid"));
    
            Connection con=DBService.getConnection();
           
            ArrayList x=new ArrayList(500);
            
            ArrayList x1=new ArrayList(500);
            int i=1,count=0,y;
            int j=7;
            
            PreparedStatement pst=con.prepareStatement("select * from regis where id=?");
            pst.setInt( 1, uid);
            ResultSet rst=pst.executeQuery();
            
                    
           rst.next();
           for(i=0;i<5;i++,j++)
           {
               x.add(i, rst.getString(j));
               
           }
            
            i=0;
             Connection con1=DBService.getConnection();
            PreparedStatement pst1=con1.prepareStatement("select answer from questions");
            ResultSet rst1=pst1.executeQuery();
            while(rst1.next())
            {
                x1.add(i, rst1.getString(1));
                i++;
                
            }
            for(y=0;y<5;y++)
            {
                if(x.get(y).toString().equals(x1.get(y).toString())==true)
                {
                    count++;
                }
            }
%>
           
<body bgcolor="yellow">
     <font size=20 face="bold" color="">
            <%out.println("score="+count+"/5");
            %>
            </font>
            <a href="Login.html"><blink><font color="red">click here to go to login page</font></blink></a>
</body>         

            
    