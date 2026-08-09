<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Login</title>

<style>

*{
	margin:0;
	padding:0;
	box-sizing:border-box;
	font-family:Arial, Helvetica, sans-serif;
}

body{
	background:linear-gradient(135deg,#FFD400,#FFE45C);
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
	box-shadow:0px 10px 25px rgba(0,0,0,0.25);
	text-align:center;
}

.logo{
	font-size:42px;
	font-weight:bold;
	color:#111;
	margin-bottom:10px;
}

.tagline{
	color:#666;
	font-size:16px;
	margin-bottom:30px;
}

input{
	width:100%;
	padding:14px;
	margin:12px 0;
	border:1px solid #ccc;
	border-radius:8px;
	font-size:16px;
	outline:none;
}

input:focus{
	border:2px solid #FFD400;
}

button{
	width:100%;
	padding:14px;
	background:black;
	color:white;
	border:none;
	border-radius:8px;
	font-size:18px;
	font-weight:bold;
	cursor:pointer;
	transition:0.3s;
}

button:hover{
	background:#FFD400;
	color:black;
}

.footer{
	margin-top:20px;
	color:#666;
	font-size:14px;
}

.footer a{
	text-decoration:none;
	color:black;
	font-weight:bold;
}

.footer a:hover{
	color:#FFD400;
}

.note{
	margin-top:15px;
	font-size:13px;
	color:gray;
}

</style>

</head>

<body>

<div class="container">

	<div class="logo">🛵 Rapido</div>

	<div class="tagline">
		Welcome Back! Login to continue
	</div>

	<form action="doLogin" method="get">

		<input type="text"
			   name="mobile"
			   placeholder="Enter Mobile Number"
			   maxlength="10"
			   required>

		<input type="password"
			   name="otp"
			   placeholder="Enter OTP"
			   maxlength="6"
			   required>

		<button type="submit">
			Login
		</button>

	</form>

	<div class="footer">
		New to Rapido?
		<a href="#">Create Account</a>
	</div>

	<div class="note">
		Fast • Safe • Affordable Ride Booking
	</div>

</div>

</body>
</html>