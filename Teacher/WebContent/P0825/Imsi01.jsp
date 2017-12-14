<%@ page contentType="text/html; charset=UTF-8" %>
<%--	이제부터 core  태그를 하나 이용하려고 한다.
		사용할 태그의 라이브러리 등록을 해야 한다.
--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%--	참고
		물론 prefix 는 원칙적으로 아무말이나 쓰면 된다.
		하지만 불문율로 core tag는 c로 쓰기로 약속이 되어 있다.
--%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<%--	모델이 한개의 데이터인 경우에는 그냥 표현식을 이용해서
	출력하면 된다. --%>
	당신의 성함은 ${UNAME} 입니다.<br>
	 <%--	조심
	 		이때는 변수의 이름이 아닌 키값을 이용해서 출력하도록 한다.
	 --%> 
	 
	 <%--	VO 클래스가 모델이면.......
	 
	 		사용법 ${키값.get이름}
	 		
	 		JSTL을 이용해서 VO에서 원하는 데이터를 선택하는 방법은
	 		변수를 이용해서 선택하는 것이 아니고
	 		getXXX()의 XXX부분을 이용하는 것이다.
	 		
	 --%>
	 당신의 이름은 ${DATA.hname} 이군요<br>
	 제목은 ${DATA.title}입니다.<br>
	 조회수는 ${DATA.hit}입니다.<br>
	 전체는 ${DATA.all}이군요<br>
	 
	 <%--	컬렉션을 출력하기 위해서는 반복해야 한다.
	 		그러므로 여기서 반복 명령을 사용해야 한다.
	 --%>
	 
	 당신의 친구 이름을 알려드리겠습니다.
	 <c:forEach var="friend" items="${LIST}">
	 	${friend}<br>
	 </c:forEach>
	 
	<%--	forEach로 컬렉션을 반복시킨다. --%>
	<c:forEach var="f" items="${MULTI}">
		<%--	f 변수에는 컬렉션이 가진 데이터가 한개씩 기억되는데...
				VO가 기억된다	--%>
		이름 : ${f.userName}<br>
		제목 : ${f.title}<br>
		조회수 : ${f.hit}<br>	
	</c:forEach>	 
	 
</body>
</html>
