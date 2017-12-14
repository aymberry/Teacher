<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--
	체크상자의 특성상 여러개를 동시에 선택할 수 있다.
	
	더군다나 name 값을 동일하게 kind로 만들었다.
--%>
	<form method="POST" action="Test09.jsp">
		<input type="checkbox" name="kind" value="hong">홍길동
		<input type="checkbox" name="kind" value="park">박아지
		<input type="checkbox" name="kind" value="jang">장독대
		<input type="checkbox" name="kind" value="lee">이기자
		<input type="checkbox" name="kind" value="kim">김치국<br>
		<input type="submit" value="눌러">
	</form>  
</body>
</html>
