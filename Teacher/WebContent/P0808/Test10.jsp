<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	//	사용자가 보내준 데이터를 받아보자.
	String	id = request.getParameter("id");
	//	★
	//	이때 ()안에 있는 id는 사용자가 전달한 데이터의 키값을 기록하는 것이다.


	//	문제
	//		Web은 사용자가 보내는 데이터는 항상 String으로 받아야 한다.
	//		숫자를 보내더라도 String으로 받아야 한다.
	//		먼저 문자로 받은 후 필요한 형태로 변화해서 사용해야 한다.
%>
	당신의 아이디는 <font color="blue"><%= id %></font> 이군요 ㅋㅋㅋ
</body>
</html>



