<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
	게시판 목록보기 뷰 문서
--%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#wBtn").click(function(){
			//	GET 방식으로 글쓰기를 요청한다.
			$(location).attr("href", "../ReBoard/WriteForm.sun");
			//	위의 문법이 JQeury 방식으로 GET 요청을 하는 문법이다.
			//	참고
			//	JavaScript 적으로는 
			//	location.href = "../ReBoard/WriteForm.sun";		처리하면 된다.
		});
	});
</script>
<body>
<%--	검색 기능 --%>
<%--	목록 내용 나오기 아직은 페이징 처리가 되지 않고
		일단 몽땅 불러오기 기능을 했다.
--%>
	<table width="800" border="1" align="center">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="data" items="${BLIST}">
		<%--	data 변수에는 리스트에 있는 한줄씩 저장된다.
				그 한줄은 VO 클래스로 입력되었다.
		--%>
			<tr>
				<td>${data.no}</td>
				<td>
					<a href="../ReBoard/BoardView.sun?oriNo=${data.no}&nowPage=${PINFO.nowPage}">${data.title}</a> 
					(${data.replyCnt})
				</td>
				<td>${data.writer}</td>
				<td>${data.wday}</td>
				<td>${data.hit}</td>
			</tr>
		</c:forEach>
	</table>
<%--	페이지 선택 기능 

		[이전] [1][2][3][4][5] [다음]
--%>
	<table width="800" border="1" align="center">
		<tr>
			<td align="center">
<%--	이전 단추를 만든다.
		이 단추는 startPage가 1페이지면 이전에 존재하지 못하고
		아니면 이전이 존재할 수 있다.
--%>			
		<c:if test="${PINFO.startPage eq 1}">
			[이전]
		</c:if>	
		<c:if test="${PINFO.startPage ne 1}">
			<a href="../ReBoard/BoardList.sun?nowPage=${PINFO.startPage - 1}">[이전]</a>
		</c:if>	

<%--	[1][2][3][4][5] 기능을 만들자. --%>			
		<c:forEach var="i" begin="${PINFO.startPage}" 
												end="${PINFO.endPage}">
				[<a href="../ReBoard/BoardList.sun?nowPage=${i}">${i}</a>]								
		</c:forEach>
<%--	다음 단추를 만든다.
		이 단추는 endPage가 totalPage페이지면 다음에 존재하지 못하고
		아니면 다음이 존재할 수 있다.
--%>			
		<c:if test="${PINFO.endPage eq PINFO.totalPage}">
			[다음]
		</c:if>
		<c:if test="${PINFO.endPage ne PINFO.totalPage}">
			<a href="../ReBoard/BoardList.sun?nowPage=${PINFO.endPage + 1}">[다음]</a>
		</c:if>
			</td>
		</tr>
	</table>


<%--	기타 기능 (글쓰기 작업을 위한 링크) --%>
	<table width="800" border="1" align="center">
		<tr>
			<td align="right">
<%--
	이 단추는 로그인을 한 사람에게만 보여주고 싶다.
	
	로그인을 한 사람은 세션에 USER라는 키값에 데이터가 있다는 사실을
	이용해서 처리한다.
--%>			
			<c:if test="${not empty sessionScope.USER}">
				<input type="button" id="wBtn" value="글쓰기">
			</c:if>	
			</td>
		</tr>
	</table>
</body>
</html>








