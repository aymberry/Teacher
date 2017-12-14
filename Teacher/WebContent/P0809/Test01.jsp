<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<%--
	Test01문서는 로그인 폼을 보여주는 문서이다.
	
	즉, 클라이언트가 로그인을 하기 위해서 로그인 폼을 보여달라고 하면
	보여줄 문서이다.
--%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
  	<form method="POST" action="http://localhost:8080/SunWeb/P0809/Test02.jsp">
  		<%--
  			action에는 이 폼의 데이터를 가지고 가서 뭔가 일을 해야 할텐데...
  			그 일을 담당할 문서이름(파일이름)을 지정하는 부분이다.
  			
  			우리로 말하면 로그인 처리를 담당할 문서이름을 지정하는 부분이다.
  		--%>
		<table width="600" border="1" align="center">
			<tr>
				<td width="20%">아이디</td>
				<td width="80%">
					<input type="text" name="id">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="pw">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인">
					<p id="ttt"></p>
				</td>		
			</tr>
			<input type="hidden" id="temp" name="temp">
			<input type="button" value="남자" onClick="Man()">
			<input type="button" value="여자" onClick="Woman()">
		</table>  
	</form>
	<script>
		function Man() {
			document.getElementById("temp").value="Man";
			document.getElementById("ttt").innerHTML = "남성 선택";
		}
		function Woman() {
			document.getElementById("temp").value="Woman";
			document.getElementById("ttt").innerHTML = "여성 선택";
		}
	</script>
</body>
</html>


