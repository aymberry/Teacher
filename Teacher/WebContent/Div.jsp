<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 	이 문서에서는 랜덤하게 숫자를 발생한 후
		10을 그 숫자로 나눈 결과를 보여주도록 할 예정이다.
		
		예>		10 / 2 = 5
		
		이때 랜덤한 숫자가 0이면 에러가 발생할 것이고
		이때는 다른 화면을 대신 보여주도록 할 것이다. 
-->
<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int		div = (int)(Math.random() * (10 - 0 + 1) + 0);
	int		result = 10 / div;
%>
	<h1>실행결과</h1>
	<h3><%= 10 + " / " + div + " = " + result %></h3>
</body>
</html>





