<%@ page contentType="text/html; charset=UTF-8" %>
<%--
	이 문서는 
	로그인을 요청하면 클라이언트가 전달한 id와 비번을 알아서
	데이터베이스를 이용한 로그인 처리를 담당할 문서이다.	
	
	1.	클라이언트가 보내준 데이터를 받아야 하고
	2.	데이터베이스에서 로그인 처리를 해야 한다.
--%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	//	GET 방식과 POST 방식 모두 서버가 클라이언트가 전달한 데이터를
	//	받는 방식은 동일하다.
	String	id = request.getParameter("id");
	String	pw = request.getParameter("pw");
	String	temp =request.getParameter("temp");
%> 
	당신의 아이디는 <%= id %> 이군요<br>
	당신의 비밀번호는 <%= pw %> 이네요<br>
		당신의 성별은 <%= temp %> 이네요<br>
	모래 로그인 처리 해드릴께요.
</body>
</html>



