<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	수정이 되었으니 여기서 보여줄 내용은 없고
		다시 상세보기로 보여주도록 한다.
--%>  
	<c:redirect url="../ReBoard/BoardView.sun">
		<c:param name="nowPage" value="${NOWPAGE}" />
		<c:param name="oriNo" value="${ORINO}" />
	</c:redirect>
</body>
</html>








