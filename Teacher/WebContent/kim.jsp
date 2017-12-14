<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i = 0; i < 10; i++) {
%>
	두번째 Hello World<br>
<%
	}
%>
	<!-- 	아까는(확장자가 html인 경우) 요청 즉시 응답했고
			지금은(확장자가 jsp인 경우) 먼저 실행하고 그 결과를 응답했다.
	-->
</body>
</html>
