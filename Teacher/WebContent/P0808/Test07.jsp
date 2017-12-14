<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%-- 문제 
		친구 이름을 5개의 배열로 만들고 출력해보자.
		
		이때 친구이름은 전역 변수로 선언해서 사용해 보자.
--%>
	<%!
		String[] name = {"홍길동", "박아지", "장독대", "이기자", "김치국"};
		/*
			이것도 주석이 된다.
		*/
		//	친구 이름을 알려주는 함수를 만들어서 사용해보자.
		public String getName(int i) {
			return name[i];
		}
	%>
	
	내친구를 소개합니다.<br>
<%
	for(int i = 0; i < name.length; i++) {
%>
		<%= getName(i) %><br>
<%
	}
 %>
</body>
</html>
