<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpServletResponse"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<title>main.html</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body, h1, h5 {
	font-family: "Raleway", sans-serif
}

body, html {
	height: 100%
}

#video {
	position: absolute;
	top: 0px;
	left: 0px;
	min-width: 100%;
	min-height: 50%;
	width: auto;
	height: auto;
	z-index: -1;
	overflow: hidden;
}

.bgimg {
	min-height: 100%;
	background-position: center;
	background-size: cover;
}
</style>
<body>
	<video id="video" preload="auto" autoplay="true" loop="loop"muted="muted" volume="0">
		<source src="images/loststars.mp4">
	</video>
<div class="bgimg w3-display-container w3-text-white" style="text-align:left">
	
  <div class="w3-display-left w3-jumbo" style="text-align:left" id="star">
  	<img onclick='myStar("star")' src="images/star.png" alt="YSmusic" height=30% width=30%>
    <p style="text-align:left">With, <br> <span class="hello-h3-span">YSmusic&nbsp;&nbsp;</span></p>
  </div>
  <div class="w3-display-bottomleft w3-container">
    <p class="w3-xxlarge">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The echo through YSmusic</p><br>
  </div>  
  <div class="w3-display-topright w3-container w3-large"><br>
   <script type="text/javascript">
	</script>
	${sessionScope.id}님 안녕하세요!&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
	
	<a href="logout.jsp">로그아웃</a>&nbsp;&nbsp;&nbsp;
   	</div>
</div>
<script type="text/javascript">

	function myStar(v) {

		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				document.getElementById("star").innerHTML = this.responseText;
			}
		};
		xhttp.open("GET", "cont?command=" + v, true);
		xhttp.send();
	}
</script>
</body>
</html>

