<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<form method="POST" action="Test02.jsp">
		<input type="checkbox" name="id1" value="hong">홍길동<br>
		<input type="checkbox" name="id2" value="park">박아지<br>
		<input type="checkbox" name="id3" value="jang">장독대<br>
		<%--	이처럼 체크상자로 만들면
				참 혹은 거짓으로 전달되는 것이 아니고
				
				선택한 항목만 value값이 전달된다.
				
				예를 들어	 홍길동을 선택하면	hong 이 전달되고
										선택하지 않으면 null로 처리된다.
		--%>
		<input type="submit" value="눌러">
	</form>  
</body>
</html>
