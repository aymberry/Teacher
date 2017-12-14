<%@ page contentType="text/html; charset=UTF-8" %>
<%--	글쓰기 폼 뷰 문서 --%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#rBtn").click(function(){
			//	입력상자에 입력한 내용을 취소하고 다시 기록할 수 
			//	있도록 한다.
			//	JQuery는 폼 전체를 한번에 지우는 기능이 없다.
			//	편법		form에 있는 input를 하나씩 찾아서 지워야 한다.
//			$("form").each(function(){
//				this.reset();
//			});
			
			//	자바 스크립트는 한번에 지우는 기능이 있다.
			document.form.reset()

		});
		
		$("#wBtn").click(function(){
			//	제목이나 본문 내용이 제대로 입력되었는지 
			//	검사를 하도록 한다.	무결성 검사라고 하고
			
			//	제목이 입력되었는지 검사하는 방법
			$title = $("#title").val();
			if($title == "") {
				alert("제목을 입력해 주세요");
				return;
			}
			//	내용, 비번이 입력되었는지도 검사하도록 한다.
			
			//	서브밋 시킨다.
			$("#wfrm").submit();
		});
		
		$("#lBtn").click(function(){
			//	GET 방식으로 목록보기를 다시 요청한다.
			$(location).attr("href", "../ReBoard/BoardList.sun");
		});
	});
</script>
<body>
<%--	여기서는 제대로된 글쓰기 폼을 보여준다. --%>
	<form method="POST" id="wfrm" action="../ReBoard/WriteProc.sun">
		<table width="500" border="1" align="center">
			<tr>
				<td>글쓴이</td>
				<td>
<%--	우리는 글쓴이는 로그인 한 사람의 아이디를 자동으로 입력하도록
		약속했다.
		
		즉, 세션에 저장된 글쓴이를 불러와서 입력하도록 한다.
		
		★ 세션에 있는 데이터를 뷰에서 사용하는 방법
		결론
			${sessionScope.키값}
			
			예>		session.setAttribute("ID", "isundol");
			 		
			 		${sessionScope.ID}		isundol이 출력된다.
			 		
		문제	우리는 세션에 하나의 데이터만 입력해 놓은 것이 아니고
				VO 전체를 입력해 놓았다.
				
				금요일에 배운 원리를 이용하면 VO의 데이터를 사용하기 
				위해서는 VO 클래스 안에 데이터를 사용할 수 있는
				getXXX()가 필요하다.
--%>					
					<input type="text" value="${sessionScope.USER.id}" readonly> 
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="title" id="title">
				</td>
			</tr>
			<tr>
				<td>본문</td>
				<td>
					<textarea name="body" id="body"></textarea>
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" id="password" name="password">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" id="rBtn" value="다시쓰기">
					<input type="button" id="wBtn" value="등록하기">
					<input type="button" id="lBtn" value="목록보기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>






