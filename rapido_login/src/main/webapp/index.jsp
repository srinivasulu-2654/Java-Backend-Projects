<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido - Home</title>

<style>

*{
	margin:0;
	padding:0;
	box-sizing:border-box;
	font-family:Arial, Helvetica, sans-serif;
}

body{
	background:linear-gradient(135deg,#FFD400,#FFEA80);
	height:100vh;
	display:flex;
	justify-content:center;
	align-items:center;
}

.container{
	width:420px;
	background:white;
	padding:40px;
	border-radius:15px;
	text-align:center;
	box-shadow:0px 8px 20px rgba(0,0,0,0.25);
}

.logo{
	font-size:45px;
	font-weight:bold;
	color:#222;
	margin-bottom:10px;
}

.tagline{
	font-size:18px;
	color:#555;
	margin-bottom:30px;
}

img{
	width:120px;
	margin-bottom:25px;
}

.login-btn{
	display:inline-block;
	text-decoration:none;
	background:#111;
	color:white;
	padding:15px 35px;
	font-size:18px;
	border-radius:8px;
	font-weight:bold;
	transition:0.3s;
}

.login-btn:hover{
	background:#FFD400;
	color:black;
	transform:scale(1.05);
}

.footer{
	margin-top:25px;
	font-size:14px;
	color:gray;
}

</style>

</head>

<body>

<div class="container">

	<div class="logo">
		🛵 Rapido
	</div>

	<div class="tagline">
		India's Largest Bike Taxi Service
	</div>

	<img src="https://cdn-icons-png.flaticon.com/512/2972/2972185.png"
		 alt="Bike">

	<br>

	<a href="doLogin" class="login-btn">
		Login
	</a>

	<div class="footer">
		Fast • Safe • Affordable
	</div>

</div>

</body>
</html>