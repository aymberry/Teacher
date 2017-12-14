<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	//	할일
	//		수첩에 기록된 그 클라이언트의 정보를 지운다.
	session.removeAttribute("USER");
	response.sendRedirect("LoginForm.jsp");
%>  
</body>
</html>
