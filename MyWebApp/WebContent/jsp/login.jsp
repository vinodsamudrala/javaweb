<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>MyWebApp</title>
<link rel="stylesheet" href="/javaweb/jsp/css/style.css">
</head>
<script	src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="/javaweb/jsp/js/index.js"></script>

<%
String invalidUser = (String) request.getAttribute("invalid");
%>

<body>

	<div class="login-page">
		<div class="form">


			<form class="register-form" action="/javaweb/RegisterUser"
				id="regForm">
				<input type="text" placeholder="name" name="uname" /> <input
					type="password" placeholder="password" name="upass" /> <input
					type="text" placeholder="email address" name="uemail" />
				<button>create</button>
				<p class="message">
					Already registered? <a href="#" onclick="showLogin()">Sign In</a>
				</p>
			</form>


			<form class="login-form" id="logForm" method="post"
				action="/javaweb/LoginServlet">
				
				<input type="text" placeholder="username" name="uname" />
				
				<input type="password" placeholder="password" name="upass" />
				
				<button>login</button>
				
				<%
				
				if(invalidUser != null && invalidUser.equals("true") )
				{
				%>
					<span style="color: red;">Invalid User</span>
				<%
				}
				%>
				
				
				<p class="message">
					Not registered? <a href="#" onclick="showRegister()">Create an
						account</a>
				</p>
			</form>


		</div>
	</div>


</body>
</html>
