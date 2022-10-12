<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>View Announcements</title>
<link rel="shortcut icon" href="data:" />
<link rel="stylesheet" href="/resources/css/viewusers.css">
</head>
<style>
.body {
	background-image:url('https://www.linkpicture.com/q/voting.png')
}
</style>
<body class="body">
<div class="navbar">
<a href="/">Home</a>

</div><br>
<center>
<table
class="table table-striped table-hover table-condensed table-bordered">
<tr>
<th>ANNOUNCEMENTS</th>
</tr>
<c:forEach var="user" items="${users}">
<tr>
<td style="color:white">${user.getAnnouncement()}</td>
</tr>
</c:forEach>
</table>
</center>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
%>
</body>
</html>