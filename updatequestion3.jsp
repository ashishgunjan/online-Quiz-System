<%@page import="com.dit.DBService"%>
<%@page import="java.sql.*;"%>

    

<%
     String newq1=request.getParameter("newq");
     String op1=request.getParameter("newop1");
     String op2=request.getParameter("newop2");
     String op3=request.getParameter("newop3");
     String op4=request.getParameter("newop4");
     String answer=request.getParameter("newans");
     int qno1=Integer.parseInt(request.getParameter("qno1"));
     
     Connection con9=DBService.getConnection();
    //PreparedStatement pst8=con9.prepareStatement("insert into questions values("+qno1+"','"+newq1+"','"+op1+"','"+op2+"','"+op3+"','"+op4+"','"+answer+"')");
   //PreparedStatement pst8=con9.prepareStatement("insert into questions values(?,?,?,?,?,?,?)");
     PreparedStatement pst8=con9.prepareStatement("INSERT INTO xe.questions (sno, ques, op1, op2, op3, op4, answer) VALUES (?,?,?,?,?,?,?)");
   pst8.setInt(1, qno1);
   pst8.setString(2,newq1);
   pst8.setString(3,op1);
   pst8.setString(4,op2);
   pst8.setString(5,op3);
   pst8.setString(6,op4);
   pst8.setString(7,answer);
   
   
     int y=pst8.executeUpdate();
     
    
    response.sendRedirect("Login.html");
   
   
     
     
     %>