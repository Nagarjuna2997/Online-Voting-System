<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

.button:hover {
  background-color: #4CAF50; /* Green */
  color: white;
}
</style>
</head>
<body>
<%
 String username=request.getParameter("loginid");
 String passw=request.getParameter("password");
 //out.println(username);
 if(username.equals("EC"))
 {
	 if( passw.equals("ADMIN@EC"))
	 response.sendRedirect("/superadminmainpage");
	 else
		 %>
		 
		 <h1 style="color:red;size:+4"> Password You Entered is Miss-Mathcing....</h1>
		 <h2> Please click </h2>
		 
		 <a href="userlogin">Here</a>
		 <h2> to Try Again</h2>
		 <% 
 }
 else
	 %>
	 
	 <h1 style="color:red;size:+3"> Credientials You Entered are Mis-Matching</h1><br><br>
	 <h2> Please try Again</h2>
	 <br>
	 <a href="/superadminlogin" class="button">Login</a>
	 <%
	 
	 
 }
%>
</body>
</html>