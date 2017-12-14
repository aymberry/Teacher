<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script>
	function sendRequest() {
		var	url = encodeURI(
			"http://localhost:8080/SunWeb/P0808/Test10.jsp?id=홍길동");
		location.href=url;
	}
</script>
<body>
<%--	09번 문서에서는 뭔가 정보를 보여주고 <a> 태그를 이용해서
		10번 문서를 요청할 수 있도록 처리할 예정이다.
		
		이때 10번 문서를 요청할 경우에는 자신의 아이디값을 전달하면서
		요청을 할 예정이다.
--%>  
	<h1>이 문서가 보여줄 내용을 먼저 보여주고....</h1>
	<a href="JavaScript:sendRequest()">Test10이동</a>
</body>
</html>
