<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="VO.*" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script>
	function CheckSend() {
		//	어제 배운 솜씨로 무결검사하고....
		//		즉, 정규화식이 필요하면 정규화 검사도 해보고....
		//		데이터가 입력되지 않으면 안되도록도 해보고.....

		//	폼을 알아내고
		var	frm = document.getElementById("lfrm");
		//	서브밋 시키자
		frm.submit();
		//	서브밋을 시키면 action에 지정한 요청이 실행된다.
	}
</script>
<body>
<%--	어떤때는 로그인 폼을 보여줄 필요가 있고
		어떤때는 닉네임을 보여줄 필요가 있더라.....
		
		이 어떤때의 구분은?
		수첩에 이 사람의 정보가 있으면 로그인을 한 것이고
		수첩에 정보가 없으면 안한것이다...
--%>
<%
	MemberVO		mVO = (MemberVO) session.getAttribute("USER");
%>
<%
	if(mVO == null) {
%>
		<form method="POST" id="lfrm" action="LoginProc.jsp">
		<table border="1" width="500" align="center">
			<tr>
				<td width="150">아이디</td>
				<td width="350"><input type="text" name="id" id="id"></td>
			</tr>		
			<tr>
				<td width="150">비밀번호</td>
				<td><input type="password" name="pw" id="pw"></td>
			</tr>		
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="로그인" onClick="CheckSend()">
				</td>
			</tr>		
		</table>
	</form>
<%
	}
	else {
		//	닉네임을 보여주도록 한다.
 %>
		<table border="1" width="500" align="center">
			<tr>
				<td align="center">
					<%= mVO.getNick() %> 님 환영합니다.
				</td>
			</tr>
			<tr>
				<td align="center">
					<a href="../index.jsp">홈으로</a>
					<a href="LogoutProc.jsp">로그아웃</a>
				</td>
			</tr>
		</table>
<%
	}
%>
</body>
</html>





