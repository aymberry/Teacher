<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		//	숙제	reset 기능 구현하세요
		$("#rBtn").click(function(){});
		//	숙제	상세보기 요청하세요
		//			주의	상세보기 요청은 oriNo, nowPage를 보내주어야 한다.
		$("#vBtn").click(function(){});
		
		$("#mBtn").click(function(){
			//	무결성검사 하시고.....
			
			$("#mfrm").submit();
			
		});
	})
</script>
<body>
<%--	수정 폼을 만들어 준다. --%>
	<form method="POST" id="mfrm" action="../ReBoard/ModifyProc.sun">
<%--
	폼에 의해서 데이터를 전송하는 POST 방식에 있어서는
	폼에 있지 않은 데이터는 서버에 전달되지 않는다.
	그래서 굳이 전송할 필요가 있는 데이터가 있다면 반드시
	hidden에 감춰서 전송해 주어야 한다.
--%>	
		<input type="hidden" name="nowPage" value="${NOWPAGE}">
		<input type="hidden" name="oriNo" value="${ORI.no}">
		<table width="700" border="1" align="center">
			<tr>
				<td>글쓴이</td>
				<td>
					<input type="text" value="${sessionScope.USER.id}" readonly>
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="title" id="title" value="${ORI.title}">
				</td>
			</tr>
			<tr>
				<td>본문</td>
				<td>
<%--
	<textarea> 만큼은 value에 출력하지 않고
	<textarea></textarea> 사이에 출력해야 한다.
--%>				
					<textarea name="body" id="body">${ORI.body}</textarea>
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="password" id="password">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" id="rBtn" value=" 다시쓰기">
					<input type="button" id="mBtn" value=" 수정하기">
					<input type="button" id="vBtn" value=" 상세보기">
				</td>
			</tr>
		</table>
	</form>	  
</body>
</html>
