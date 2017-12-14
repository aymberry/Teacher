<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	String	sid = session.getId();
	//	수첩에 이 사람의 정보를 기억해 놓자.
	session.setAttribute("이름", "홍길동 만만세");
	session.setMaxInactiveInterval(60);
%>  
당신의 카드 번호는 <%= sid %> 이군요
</body>
</html>
