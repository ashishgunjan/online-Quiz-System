<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.dit.DBService"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Success Page</title>
<style>
    input[type=submit]
     {
    height:40px;
    width:110px; 
    vertical-align: middle;
     }
     input[type=radio]
     {
    height:40px;
    width:35px; 
    vertical-align: middle;
     }
</style>
</head>

<%
   
    String uid=request.getParameter("uid");
    int ivalue=Integer.parseInt(request.getParameter("ivalue"));
    ++ivalue;
     String q1=request.getParameter("q1");
     if(q1.equals("9"))
    {}
    else
    {
        Connection con=DBService.getConnection();
    
   PreparedStatement pst=con.prepareStatement("update regis set ans?=? where id=?");
    pst.setString(2, q1);
    pst.setString(3, uid);
    pst.setInt(1, ivalue-1);
    int i=pst.executeUpdate();
    
    }
     if(ivalue==6)
    {
       response.sendRedirect("score12.jsp");
    }
    
    
     
    
     String qs="question";
    String ops1="option1";
    String ops2="option2";
    String ops3="option3";
    String ops4="option4";
    
  Connection con1=DBService.getConnection();
    
    PreparedStatement pst6=con1.prepareStatement("select * from questions where sno=?");
    pst6.setInt(1,ivalue);
    

  ResultSet rst6=pst6.executeQuery();
  while(rst6.next())
  {
       qs=rst6.getString(2);
       ops1=rst6.getString(3);
       ops2=rst6.getString(4);
       ops3=rst6.getString(5);
       ops4=rst6.getString(6);
  }
  
     
%>
<body >
<font size="4" face="Cooper Black" color="990099"> <h3>Hi ,<%=uid%> Login successful.</h3></font>
<br>
value of i=<%=ivalue%>
<form action="LogoutServlet" method="post">
<input type="submit" value="Logout" >
</form>
<form action="loginsuccess.jsp" method="post">
    <input type="text" name="uid" value="<%=uid%>">
                                  i value=<%=ivalue%>
                                 
                <input type="text" name="ivalue" value="<%=ivalue%>">
    <br><B> <font size="10" face="Forte" color="FF0033"> Q.<%=qs%>?</font><B><br><br>
            <input type="radio" name="q1" value="<%=ops1%>"><font size="10" face="Arial Rounded MT Bold" color="6600FF"> <B>1. <%=ops1%></B></font>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="q1" value="<%=ops2%>"><font size="10" face="Arial Rounded MT Bold" color="6600FF"> <B>2. <%=ops2%><B></font>
    
    
                        <br><input type="radio" name="q1" value="<%=ops3%>"><font size="10" face="Arial Rounded MT Boldk" color="6600FF"> <B>3. <%=ops3%></B></font>
                                 &nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="q1" value="<%=ops4%>" size="20"> <font size="10" face="Arial Rounded MT Bold" color="6600FF"> <B>  4.<%=ops4%></B></font>
                                  
                                 <br><br> <br><center>  <input type="submit" value="submit"></center>
    
                                 </font>
                                
                                
                                 
  </form>
                             
</body>
</html>