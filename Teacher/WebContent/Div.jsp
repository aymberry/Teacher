<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 	�� ���������� �����ϰ� ���ڸ� �߻��� ��
		10�� �� ���ڷ� ���� ����� �����ֵ��� �� �����̴�.
		
		��>		10 / 2 = 5
		
		�̶� ������ ���ڰ� 0�̸� ������ �߻��� ���̰�
		�̶��� �ٸ� ȭ���� ��� �����ֵ��� �� ���̴�. 
-->
<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int		div = (int)(Math.random() * (10 - 0 + 1) + 0);
	int		result = 10 / div;
%>
	<h1>������</h1>
	<h3><%= 10 + " / " + div + " = " + result %></h3>
</body>
</html>





