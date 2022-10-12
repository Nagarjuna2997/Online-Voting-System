<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>
<%@ page import = "javax.servlet.*"%>
<%@ page import = "javax.servlet.http.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<%
try
{
  String voterid=(String)request.getSession().getAttribute("voterid");
  
  String val = request.getParameter("studentid");
  Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:xe";
String username="system";
String password="manager";
String query= "SELECT * from sdpsign";

Connection conn=DriverManager.getConnection(url,username,password);
PreparedStatement stmt=conn.prepareStatement("UPDATE voteraccess SET confirm = '1' WHERE voterid =?");
stmt.setString(1,val);
out.println(voterid);
ResultSet rs=stmt.executeQuery();
//out.println(val);
response.sendRedirect("viewapplications");
%>
    </table>
    <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
}




%>
        


</body>
</html>