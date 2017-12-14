<%@ page contentType="text/html; charset=UTF-8" %>
<%--
	로그인 요청이 오면 해결할 문서파일이다.
--%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	String	id = request.getParameter("id");
	String	pw = request.getParameter("pw");
%>  
	당신의 id 는 <%= id %>이군요<br>
	당신의 비번은 <%= pw %>이군요<br>
</body>
</html>
