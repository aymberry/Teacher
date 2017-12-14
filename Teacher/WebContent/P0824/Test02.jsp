<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<%--	page 공유 범위는 같은 문서가 아니면 사용할 수 없다. --%>
	<h3>당신의 이름은 <%= pageContext.getAttribute("USER") %>입니다.</h3><br>
	<%--	session 공유 범위는 세션이 없어지지 않는 한
			모든 문서에서 사용할 수 있다.
	--%>
	<h3>당신의 이름은 <%= session.getAttribute("USER") %>입니다.</h3><br>
</body>
</html>
