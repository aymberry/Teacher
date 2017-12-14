<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<body>
<%--	이 문서는 원하는 구구단을 만들어주는 문서이다. 
		Ajax라고 해서 특별한 것이 아니다.
		요청은 동일하다.
--%>
<%
	String	strDan = request.getParameter("DAN");
	int		dan = Integer.parseInt(strDan);
%>	
	<table width="100" border="1" align="center">
<%
		for(int i = 1; i < 10; i++) {
%>
			<tr>
				<td>
					<%= dan + " * " + i + " = " + (dan * i) %>
				</td>
			</tr>
<%
		}
%>
	</table>
</body>
</html>







