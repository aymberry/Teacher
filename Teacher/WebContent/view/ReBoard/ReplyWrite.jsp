<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	보여줄건 없고 대신 상세보기에서 보여줄 생각이므로..... 
		상세보기로 redirect 시킨다.
		
		문제는 상세보기를 하기위해서는 oriNo를 알아야 하는데....
		컨트롤러에서 알려주지 않으면 뷰에서는 그 데이터를 알 수 없다.
		
		이제 앞에서 원글의 번호를 ORINO 키값으로 알려주었으므로
		뷰에서 사용할 수 있다.
--%>  
	<c:redirect url="../ReBoard/BoardView.sun">
		<c:param name="oriNo" value="${ORINO}" />
	</c:redirect>
</body>
</html>




