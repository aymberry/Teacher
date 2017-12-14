<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
//	String	id = request.getParameter("id");

	//	나는 질문의 대답을 못해서 대신 Test03이 대답하도록 하고 싶다.
//	response.sendRedirect("Test03.jsp");
	
	RequestDispatcher rd = request.getRequestDispatcher("Test03.jsp");
	rd.forward(request, response);
%>  
<%--	당신의 질문은 <%=id %>이군요		 --%>

</body>
</html>
