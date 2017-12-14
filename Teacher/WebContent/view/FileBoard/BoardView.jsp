<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#dBtn").click(function(){
			//	할일
			//		비밀번호를 입력받은 후
			var	pw = window.prompt("비밀번호를 입력해주세요");
			//		받은 비밀번호와 글번호를 hidden에 동적으로 입력한다.
			$("#pw").val(pw);
			$("#oriNo").val(${DATA.no});
			
			$("#dfrm").submit();
		});
	});
</script>
<body>
<%--	상세보기 보여주고 --%>
	<table border="1" align="center" width="800">
		<tr>
			<td>글번호</td>
			<td>${DATA.no}</td>
			<td>조회수</td>
			<td>${DATA.hit}</td>
		</tr>
		<tr>
			<td>글쓴이</td>
			<td>${DATA.writer}</td>
			<td>작성일</td>
			<td>${DATA.wDate}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="3">${DATA.title}</td>
		</tr>
		<tr>
			<td>본문</td>
			<td colspan="3">${DATA.body}</td>
		</tr>
	</table>
<%--	첨부파일 보여주고 --%>
	<table border="1" align="center" width="800">
		<c:forEach var="temp" items="${FLIST}" varStatus="st">
			<tr>
				<td>첨부파일(${st.count})</td>
				<td>
					<a href="../FileBoard/DownloadProc.sun?fno=${temp.fno}&nowPage=${NOWPAGE}">${temp.oriName}</a> (${temp.length} Bytes)
				</td>
			</tr>
		</c:forEach>
	</table>
<%--	기타 기능 만들고 --%>
	<table border="1" align="center" width="800">
		<tr>
			<td align="center">
				<input type="button" id="dBtn" value="삭제하기">
			</td>
		</tr>
	</table>
<%--	GET 방식으로 POST방식으로 처리할 임시 form을 준비한다. 

		삭제하기 단추를 누르면 이 폼의 데이터를 동적으로 입력한 후
		서브밋 시키면 POST 방식으로 데이터가 서버에 전송될 것이다.
--%>
	<form method="POST" id="dfrm" action="../FileBoard/BoardDelete.sun">
		<input type="hidden" id="oriNo" name="oriNo">
		<input type="hidden" id="pw" name="pw">
	</form>
</body>
</html>
