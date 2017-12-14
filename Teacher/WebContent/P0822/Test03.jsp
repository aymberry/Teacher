<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	String	id = request.getParameter("id");
%>  
	당신의 질문은 <%=id %>이군요
</body>
</html>
