<%@ page contentType="text/html; charset=UTF-8" %>
<%--
	이 문서를 로그인을 하기 위해서 로그인 폼을 보여주는 문서이다.
--%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
   	<form id="loginform" method="POST" action="http://localhost:8080/SunWeb/P0809/Test07.jsp">
		<table width="600" border="1" align="center">
			<tr>
				<td width="20%">아이디</td>
				<td width="80%">
					<input type="text" name="id" id="id">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="pw" id="pw">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<%--
					<input type="submit" value="로그인">
							이 단추는 기능을 가진 단추이므로
							누르는 순간 submit 행위가 발생한다.
							
							이 말은 데이터를 가공할 수 없다
					--%>
					<input type="button" value="로그인" onclick="login()">
					<%-- 
						이 단추는 기능이 없는 단추이다.
						눌러도 아무런 행동을 하지 않는다.
						
						그래서 단추를 눌렀을때 뭔가를 하고자 하면....
						자바 스크립트나 JQuery를 이용해서
						개발자가 직접 기능을 만들어 주어야한다.
					--%>
				</td>		
			</tr>
		</table>  
	</form>
	<script>
		function login() {
			//	submit 행위를 하기 전에 먼가를 실행할 수 있다.
			var	id = document.getElementById("id").value;
			if(id == "") {
				alert("로그인을 하려면 아이디를 반드시 입력하세요");
				return;
			}
			
			var	pw = document.getElementById("pw").value;
			if(pw == "") {
				alert("로그인을 하려면 비밀번호를 반드시 입력하세요");
				return;
			}

			var	frm = document.getElementById("loginform");
			//	submit 행위를 일으킬 폼을 알아낸다.
			frm.submit();
		}
	</script>
</body>
</html>



