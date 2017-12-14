<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	String	name = "홍길동";
%>
	<h1>이 문서는 메인 문서입니다. 클라이언트는 이 문서를 요청할 것이다.</h1>
	<table width="900" border="1" align="center">
		<tr height="500">
			<td width="700">이 부분에 뉴스 내용이 들어갑니다.</td>
			<td width="200"><%@ include file="Right.jsp" %></td>
		</tr>
		<tr height="100">
			<td colspan="2"><%@ include file="Bottom.jsp" %></td>
		</tr>
	</table>	
</body>
</html>
