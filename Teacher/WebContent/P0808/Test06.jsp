<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<!-- 	7단 구구단을 표를 이용해서 출력해보자. 
		엄밀히 말해서 표는 width, align을 지정하면 안된다.
		둘다 CSS를 이용해서 처리해야 원칙이다.
		
		CSS 연습은 그날 만든 내용중 중요한 것은
		CSS를 이용해서 이쁘게 만들어 보는 것으로 연습을 계속해야 한다.
-->
	<table width="900" border="1" align="center">
		<tr>
		<!-- 	이제 9칸을 만들어야 한다. -->
<%
			for(int i = 1; i <= 9; i++) {
%>
				<td><%= "7 * " + i + " = " + (7 * i) %></td>
<%
			}
%>
		</tr>	
	</table>
</body>
</html>



