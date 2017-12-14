<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="DAO.*" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	이 문서는 클라이언트가 보내준 글쓴이와 본문 내용을 받아서
		데이터베이스에 기록하는 작업을 담당할 문서입니다. 
--%>  
<%
//	할일
//	1.	클라이언트가 보내준 데이터 받기
	String		who = request.getParameter("writer");
	String		body = request.getParameter("body");
//	2.	데이터베이스에 기록하는 작업		
//		어제는 여기서 직접 디비에 접속을 해서 만들었지만...
//		오늘은 DAO 클래스를 이용해서 작업을 하도록 할 예정이다.
	GuestDAO 	dao = new GuestDAO();
	dao.GuestWriter(who, body);

	//	이제 글 등록 작업이 끝났으므로 뭔가를 보여줘야 할텐데 보여줄게 없다.
	//	다시 목록보기로 이동을 시키자.
	
	response.sendRedirect("http://localhost:8080/SunWeb/Guest/GuestList.jsp");
%>



</body>
</html>
