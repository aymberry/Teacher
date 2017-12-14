<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	검색창 만들고 --%>
	<form method="POST" id="sfrm" action="../FileBoard/BoardSearch.sun">
		<table width="1000" border="1" align="center">
			<tr>
				<td align="center">
					<select id="kind" name="kind">
						<option value="writer">글쓴이</option>
						<option value="title">제목</option>
						<option value="body">본문</option>
						<option value="date">날짜</option>
					</select>
					<input type="text" id="body" name="body">
					<input type="button" id="sBtn" value="검색">
				</td>
			</tr>
		</table>
	</form>
<%--	목록보기 하고 --%>
<c:if test="${empty FLIST}">
	<table width="1000" border="1" align="center">
		<tr>
			<td align="center">
				등록된 게시물이 없습니다. 당신이 첫번째 주인공이 되세요
			</td>
		</tr>
	</table>
</c:if>
<c:if test="${not empty FLIST}">
	<table width="1000" border="1" align="center">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
			<th>첨부여부</th>
		</tr>
		<c:forEach var="data" items="${FLIST}">
		<tr>
			<td>${data.no}</td>
			<td>
				<a href="../FileBoard/BoardView.sun?oriNo=${data.no}&nowPage=${PINFO.nowPage}">${data.title}</a>
			</td>
			<td>${data.writer }</td>
			<td>${data.wDate}</td>
			<td>${data.hit}</td>
			<td>
				<c:if test="${data.fileCount eq 0}">
					${data.fileCount}
				</c:if>
				<c:if test="${data.fileCount ne 0}">
					${data.fileCount}
				</c:if>
			</td>
		</tr>
		</c:forEach>
	</table>
</c:if>
<%--	페이지 이동기능 만들고 --%>
	<table width="1000" border="1" align="center">
		<tr>
			<td align="center">
<%--	[이전] [1][2][3][4][5] [다음] 
		숙제
--%>			
			
			</td>
		</tr>
	</table>
<%--	기타기능 만들고 --%>
	<table width="1000" border="1" align="right">
		<tr>
			<td>
				<a href="../FileBoard/WriteForm.sun">글쓰기</a>
			</td>
		</tr>
	</table>
</body>
</html>
