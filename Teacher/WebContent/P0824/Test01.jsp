<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	pageContext.setAttribute("USER", "홍길동");
	request.setAttribute("USER", "박아지");
	session.setAttribute("USER", "이기자");
	application.setAttribute("USER", "장독대");
	//	1번 문서에서 3번 문서로 forward 이동시킨다.
	//	forwrad 방식이므로 request가 유지된다.
//	RequestDispatcher	ds = request.getRequestDispatcher("Test03.jsp");
//	ds.forward(request, response);
	//	1번 문서에서 3번 문서로 redirect 이동시킨다.
	//	dedirect 이동은 request가 소멸된다.
	response.sendRedirect("Test03.jsp");
%>  
</body>
	<%--	page 공유 범위는 같은 문서에서만 사용할 수 있다. --%>
	<h3>당신의 이름은 <%= pageContext.getAttribute("USER") %>입니다.</h3><br>
	<h3>당신의 이름은 <%= session.getAttribute("USER") %>입니다.</h3><br>
	<%--	나머지 3개도  같은 문서에서는 사용할 수 있다. --%>
	<br>
	<a href="Test02.jsp">눌러</a>
</html>





