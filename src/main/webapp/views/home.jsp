<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">


  <style>
  
 

.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
  
  
  
    @charset "ISO-8859-1";
.a {
	color:red;
	background-color:blue;
}
/* Add a black background color to the top navigation */
.topnav {
  background-color: #00b4d8;
  overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: right;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: blue;
  color: white;
}

/* Add a color to the active/current link */
.topnav a.active {
  background-color: #04AA6D;
  color: white;
}
/* Image setting*/

.image {
	margin-left:250px;
	margin-top:-50px;
}
.leftside {
	margin-right:900px;
	/*margin-bottom:300px;*/
	text-align:top;
}
.body {
	background-image:url('https://www.linkpicture.com/q/voting.png')
}


  </style>
  </head>
  <body class="body">
<link rel="stylesheet" href="" >
<div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href="register">Signup</a>
  <a href="userlogin">Login</a>
  <a href="viewannouncements">View Announcements</a>

  <a href="votingprocess">Voting Process</a>
  
</div>

<div class="container">
<marquee width="100%" direction="left" height="100px" style="color:red;font-size:30px">
IF YOU ARE A NEW USER PLEASE SIGNUP.  
</marquee>




  
  
</div>

<script>
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
}

</body>

</html>