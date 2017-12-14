<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="P0824.*, java.util.*" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	1.	데이터만 보내준 경우 처리 방식 --%>
 	<h1>나는 1번</h1>
 	당신의 이름은 <%= request.getAttribute("UNAME") %>이군요<br> 
<%--	2.	여러종류의 데이터를 보내는 경우 처리 방식 

			당연히 VO를 알아내서 각각의 변수를 이용하면 된다.
--%>
	<%	
		ImsiVO vo = (ImsiVO) request.getAttribute("BOARDVIEW");
	%>
		당신의 이름은 <%= vo.name %>이군요<br>
		제목은 <%= vo.title %>이네요<br>
<%--	3.	한가지 종류의 데이터가 여러개 오는 경우 처리 방식
			ArrayList 를 알아내서 이것을 반복하면서 꺼내면 된다.
--%>
	<%
		ArrayList	list = (ArrayList) request.getAttribute("NEWSLIST");
		int	size = list.size();
	%>
	<%
		for(int i = 0; i < size; i++) {
	%>
			제목등은 <%= list.get(i) %> 이다.<br>
	<%
		}
	 %>
<%--
		4.	번의 경우는 2가지가 혼합되어 있으므로....
			1)	전체 결과인 ArrayList를 알아내고
			2)	list를 반복하면서 VO을 알아내고
			3)	vo의 변수를 이용해서 데이터를 알아낸다.
--%>
	<%
		ArrayList	temp = (ArrayList) request.getAttribute("BOARDLIST");
		for(int i = 0; i < temp.size(); i++) {
			ImsiVO tempVO = (ImsiVO) temp.get(i);
			//	tempVO가 가진 데이터를 변수를 이용해서 꺼내서 사용하면 된다.
		}
	%>
</body>
</html>
