<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.dit.DBService"%>
<%@page import="java.sql.Connection"%>
<div></div>
<%@include file="Header.jsp" %>
<script type="text/javascript">
    function validateForm() {
    var x = document.forms["myform"]["id"].value;
    if (x == null || x == "") {
        alert("Student's ID must be filled out");
        return false;
    }
     x = document.forms["myform"]["password"].value;
    if (x == null || x == "") {
        alert("Password must be filled out");
        return false;
    }
    x = document.forms["myform"]["name"].value;
    if (x == null || x == "") {
        alert("Student's Name must be filled out");
        return false;
    }
     x = document.forms["myform"]["phone"].value;
    if (x == null || x == "") {
        alert("Phone Number must be filled out");
        return false;
    }
     x = document.forms["myform"]["year"].value;
    if (x == null || x == "") {
        alert("Student's current academic year must be filled out");
        return false;
    }
}
</script>
<center>
    <table width="80%">
        <tr bgcolor="#ddaappp">
            <td>
        <center>
            <form name="myform" action="addrecord" onsubmit="return validateForm()" method="post">
                <pre>



                </pre>
                Enter Id:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="id"><br><br>
                Enter passw.*&nbsp;&nbsp;<input name="password"><br><br>
                Enter Name:*&nbsp;&nbsp;&nbsp;<input name="name"><br><br>
                Enter mob.:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="phone"><br><br>
                Enter Curr.Year:*<input name="year"><br><br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 <input type="submit" value="Register">
                 <pre>


  <a href="Login.html"><font size=4>Click Here To Go To LOGIN PAGE.</font></a>
                 </pre>
            </form>
            ${requestScope.msg}
        </center>
                  </td>
        </tr>
        
    </table>
</center>
<%@include  file="Footer.jsp" %>        