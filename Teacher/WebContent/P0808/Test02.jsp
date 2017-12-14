<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<!-- 	나는 Hello World를 10번 출력하고 싶다. 
		1.	자바와 HTML을 혼합해서 하나로 보고 코딩을 한다.
		2.	자바적인 요소를 구분만 시켜주면 된다.
-->
<%
	for(int i = 0; i < 10; i++) {
%>
		Hello World<br>
<%
	}
%>
</body>
</html>



