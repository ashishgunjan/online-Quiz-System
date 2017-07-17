<%@page import="java.sql.ResultSet"%>
<%@page import="com.dit.DBService"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<font size="8"><center><u>LIST OF QUESTIONS</u></center></font>
<%  Connection con1=DBService.getConnection();
    
    PreparedStatement pst6=con1.prepareStatement("select * from questions");
    ResultSet rst=pst6.executeQuery();
    
    
%>
    
     <% while(rst.next()){%>
   
        <font color=black size=5> Q<%=rst.getInt(1)%> .> <%out.println(rst.getString(2));%> </font>
        <br>
        
        <% }%><br>
        <br>
      
       Which question you want to update?
       <form name="form1" action="updatequestion2.jsp">
           enter question no.:-<input type="text" name="qno">
            <input type="submit" value="Submit">
            
       </form>
        <a href="Login.html"><font size=4>Click Here To Go To LOGIN PAGE.</font></a>
    