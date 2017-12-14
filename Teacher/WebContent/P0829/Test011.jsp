<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#btn").click(function(){
			var	dan = Math.floor(Math.random() * (9 - 1) + 1);
			
			
			//	나는 단추를 누르는 순간 Ajax 통신을 하고자 한다.
			//	나는 단추를 누르면 Test021.jsp 를 요청하고자 한다.
			$.ajax({
//				url : 'Test012.jsp',
				url : "../ReBoard/BoardList.sun", 
				//	데이터는 ? 뒤에 붙일 내용이 있으면 사용하는 것이다.
				//	이때 ? 뒤에는 키값=데이터&키값=데이터&...
				//	여기서도 동일하게 붙이면 된다.
				//	우리는 원하는 구구단을 단을 랜덤하게 만들어서 보내고 싶다.
				data : 'DAN=' + dan,
				//	DAN=7의 형태로 서버에게 가게 된다.		
				dataType : 'html',
				type : 'GET',
				success : function(data) {
					//	응답이 오는 순간 자동 실행되는 함수
					//	이때 응답되어진 문서는 바로 파라메터인 data가
					//	기억하게 된다
					//	응답 받은 데이터는 실행되지 않는다...
					//	강제로 실행을 시켜야 한다.
					
					//	우리는 div 요소에 응답받은 문서를 출력하기를 원한다.
					$("#result").html(data);					
				},
				error : function() {
					//	실패하는 순간 자동 실행되는 함수
					alert("나오면 안되요");
				}
			});
		});
	});
</script>
<body>
<%--		이 문서는 다음의 메인 화면이라고 생각하자.	--%>
	<table width="800" border="1" align="center">
		<tr height="50">
			<td colspan="2">메뉴 부분</td>
		</tr>
		<tr height="300">
			<td wdith="500">
				뉴스 부분<br>
<%--	단추를 누르면 이부분에 어떤 내용을 서버로 부터 받아서
		그 내용을 출력하도록 하고 싶다.
		(특정 구구단의 내용을 받아서 출력할 예정이다.)
--%>				
				<input type="button" id="btn" value="눌러봐">
				<div id="result"></div>
			</td>
			<td width="300">오른쪽 메뉴</td>
		</tr>
		<tr height="50">
			<td colspan="2">저작권 부분</td>
		</tr>
	</table>  
</body>
</html>
