<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<!-- 	문제
			랜덤하게 숫자를 발생한 후 짝수인지 홀수인지를 구분하여
			출력하세요.
-->
<%
	int num = (int)(Math.random() * 101);
	if(num % 2 == 0) {
%>
		<h1>짝수입니다.</h1>
<%
	}
	else {
%>
		<h1>홀수입니다.</h1>
<%
	}
%>
</body>
</html>





