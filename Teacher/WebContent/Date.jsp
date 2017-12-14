<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, java.text.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	Calendar	car = Calendar.getInstance();
	SimpleDateFormat	form = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String		result = form.format(car.getTime());
%>
	<h3>현재 시간은 <%= result %> 입니다.</h3>
</body>
</html>




