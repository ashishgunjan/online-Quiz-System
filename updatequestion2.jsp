<%@page import="com.dit.DBService"%>
<%@page import="java.sql.*;"%>

    

<%
    int qno1=Integer.parseInt(request.getParameter("qno"));
   
    Connection con7=DBService.getConnection();
    PreparedStatement pst=con7.prepareStatement("delete from questions where sno=?");
    pst.setInt(1,qno1);
    int i=pst.executeUpdate();
    
  
      
  
  %>
 
  
  <fieldset>
    <legend><font color=#WWWqo size="5">Question updation form:-</font></legend>
<form action="updatequestion3.jsp" method="post">
        <pre>
  ENTER THE NEW QUESTION:-<BR>
<input type="text" name="newq"  size="100">
Enter 1<sup>st</sup> option:-
<input type="text" name="newop1">
Enter 2<sup>nd</sup> option:-
<input type="text" name="newop2">
Enter 3<sup>rd</sup> option:-
<input type="text" name="newop3">
Enter 4<sup>th</sup> option:-
<input type="text" name="newop4">

Enter the correct answer:-
<input type="text" name="newans">
<input type="hidden" name="qno1" value="<%=qno1%>">
<input type="submit" value="submit">
</form>
    </fieldset>

    
   