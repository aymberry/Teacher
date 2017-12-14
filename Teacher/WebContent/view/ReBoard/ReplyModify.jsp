<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	
		다시 상세보기로 가고자 한다. 
		상세보기로 가려면 원글의 번호를 알아야 한다.
		
		jstl은 	범위가 있는 태그
				==>		태그 안에 다른 내용을 붙여야 하는 경우
						<시작태그></종료태그>의 형태로 만든다.
				
				범위가 없는 태그
				==>		한줄의 태그로 기능이 구현되는 태그
						<시작태그 ... />의 형태로 만든다.
--%>
	<c:redirect url="../ReBoard/BoardView.sun">
		<c:param name="oriNo" value="${ORINO}" />
	</c:redirect>
</body>
</html>
