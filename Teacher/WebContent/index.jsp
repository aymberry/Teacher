<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
  	나는  Welcome 파일입니다.<br>
  	이 부분이 내가 만든 사이트의 대문입니다.<br>
  	여기서 부터 내가 만든 모든 기능을 링크를 이용해서 처리하도록
  	조치해 나가야 한다.<br>
  	<a href="http://localhost:8080/SunWeb/Survey/SurveyForm.jsp">설문조사</a><br>
  	<a href="http://localhost:8080/SunWeb/Guest/GuestList.jsp">방명록</a><br>
	<%--	이제 로그인 폼 요청을 할 차례이다. 
			상대 주소 방식으로 처리를 해볼 예정이다.
			1.	현재 문서가 나오게된 요청 내용
				http://localhost:8080/SunWeb/index.jsp
			2.	요청할 문서의 원래 요청 내용
				http://localhost:8080/SunWeb/Member/LoginForm.jsp
				
			공통점 까지의 경로를 이동시킨 후
			변경된 부분을 기록한다.

			참고		.		현재 위치
						..		상위 위치
						
			결론		./Member/LoginForm.jsp			
	--%>
		<a href="./Member/LoginForm.jsp">로그인폼</a><br>
		<a href="./Login/LoginForm.kim">서블릿 로그인 폼</a><br>
		<a href="./ReBoard/BoardList.sun">댓글형 게시판</a><br>
		<a href="./FileBoard/BoardList.sun">파일 게시판</a><br>
		

</body>
</html>







