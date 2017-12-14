<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%--
	<%@ page import="java.util.*" 를 할 때 ";" 를 붙이지 않는다.
--%>
<%--
	문제
		컬렉션에 친구 5사람을 입력한 후 이것을 출력하는 문서를 
		만들어 보자.
--%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	ArrayList<String>		list = new ArrayList<String>();
	list.add("홍길동");
	list.add("박아지");
	list.add("장독대");
	list.add("이기자");
	list.add("정말로");
	
	for(int i = 0; i < list.size(); i++) {
		out.print("<h1>" + list.get(i) + "</h1>");
	}
%>  
<%--
<%
	for(int i = 0; i < list.size(); i++) {
%>
		<h1><%= list.get(i) %></h1>
<%
	}
%>

	한줄의 출력때문에 복잡한 문서를 만들어야 한다.
 --%>




</body>
</html>







