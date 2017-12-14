<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	이 문서를 로그인을 하지 않았을때 보여주는 문서이다.
		이 문서는 만들어 놓은 로그인 폼을 보여주도록 유도(redirect) 
		하면 되겠다.
		
		참고	로그인 폼 요청
		http://loclhost:8080/SubWeb/Member/LoginForm.jsp
--%>  
	<c:redirect url="../Member/LoginForm.jsp" />
</body>
</html>





