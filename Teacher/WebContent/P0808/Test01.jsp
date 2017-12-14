<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	//	이 변수는 함수 안에서 만들어지는 변수이고 지역 변수가 된다.
	String	name = "홍길동";	
%>
<!-- 	3줄짜리 2칸짜리 표를 만들어 놓자 -->
	<table width="800" border="1" align="center">
		<tr>
			<td>홍길동</td>
			<td>박아지</td>
		</tr>	
		<tr>
			<td>장독대</td>
			<td>이기자</td>
		</tr>	
		<tr>
			<td>정말로</td>
			<td>김치국</td>
		</tr>	
	</table>
	<%= name %>
</body>
</html>
