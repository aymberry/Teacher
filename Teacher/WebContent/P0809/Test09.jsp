<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	//	같은 name 속성(키값)이 여러개 인 경우에는 
	//	getParameter()가 안되고		
	//			만약 이것을 사용하면 첫번째것만 받고 나머지 받지 못한다.
	//	getParametetValues()를 사용해야 한다.
	String[]	kinds = request.getParameterValues("kind");
%>
	당신이 선택한 친구는<br>
<%
	for(int i = 0; i < kinds.length; i++) {
%>
		<%= kinds[i] %><br>
<%
	}
%>
	입니다.
</body>
</html>
