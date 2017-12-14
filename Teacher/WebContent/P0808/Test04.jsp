<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<!-- 	문제
			랜덤한 숫자를 두개 발생한 후 그 숫자를 그대로 출력하라.
-->  
<%
	int	num1 = (int) (Math.random() * 101);
	int	num2 = (int) (Math.random() * 101);
%>	
	<h1>HTML 요소는 입력한 내용이 그대로 출력되고 변수를 출력할 수 없다.</h1>
	<h1>num</h1>은 "num"이라고 출력한다. 그 안에 숫자를 출력할 수 없다.<br>	
	만약 변수를 출력하고 싶으면 <h1><%= num1 + " " + num2 %></h1>으로 해야 한다.	
</body>
</html>
