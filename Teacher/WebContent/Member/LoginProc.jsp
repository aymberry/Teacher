<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="DAO.*, VO.*" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	이 문서가 할 일은 로그인 처리를 하는 역활이다.
		Member 테이블안에 그 회원이 존재하는지를 알아내는 작업이다.
--%>  
<%
	//	1.	그 클라이언트가 보내준 id, pw를 받아본다.
	String		id = request.getParameter("id");
	String		pw = request.getParameter("pw");	

	//	2.	그런 회원이 테이블에 있는지 확인하자.
	MemberDAO	dao =  new MemberDAO();
	MemberVO 	mVO = dao.loginCheck(id, pw);
	if(mVO != null) {
		//	뭔가 정보가 있다면....
		//	이것은 로그인에 성공한 사람이다.......
		//	이사람을 수첩에 기록해 놓자.
		
		session.setAttribute("USER", mVO);
	}
	else {
		//	로그인 성공하지 못했는데....
		//	수첩에 아무것도 쓰지 않는다......
	}
	//	다시 로그인 폼으로 보내자....
	response.sendRedirect("LoginForm.jsp");
%>

</body>
</html>






