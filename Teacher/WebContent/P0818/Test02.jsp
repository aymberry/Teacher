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
//	수첩에 기록된 정보를 알아내자.
	String	name = (String) session.getAttribute("이름");
%>  
당신의 카드 번호는 <%= sid %> 이군요<br>
당신의 이름은 <%= name %>이군요<br>
</body>
</html>




