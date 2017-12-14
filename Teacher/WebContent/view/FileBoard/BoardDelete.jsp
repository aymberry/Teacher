<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	이 뷰에서는 삭제 여부에 따라서 가는곳이 달라진다.
		삭제가 되었으면 목록보기로 가야하고
		
		삭제에 실패했으면 다시 상세보기로 가야한다. 
 --%>  
 	<c:if test="${CNT eq 0}">
 	<%--	삭제 실패 
 			먼저 실패 메시지 보여주고
 			상세보기로 가도록 한다.
 			
 			문제는 redirect를 시키면 그 문서에서 응답한 모든 내용은
 			무시되고 다른 문서를 대신 응답하는 방식이다.

			이런 경우는 <c:rediect를 시키말고
			대신 강제로 다시 요청을 하도록 조치한다. 			
 	--%>
	<script>
		alert("비밀번호가 달라서 삭제하지 못했다.");
//		$(location).attr("href", "../FileBoard/BoardView.sun?oriNo=${oriNo}");
		document.location.href = "../FileBoard/BoardView.sun?oriNo=${oriNo}";
	</script>

 	</c:if>
 	<c:if test="${CNT ne 0}">
 	<%-- 삭제 성공 --%>
 		<c:redirect url="../FileBoard/BoardList.sun" />
 	</c:if>
</body>
</html>
