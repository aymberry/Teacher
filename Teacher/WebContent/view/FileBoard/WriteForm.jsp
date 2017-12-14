<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	var	count = 1;		//	우리는 5개로 한정을 했으므로 현재
							//	몇개까지 만들었는지를 구분할 변수를 전역변수로 만든다.
	$(document).ready(function(){
		$("#aBtn").click(function(){
			count = count + 1;
			if(count >= 6) {
				count = 5;
				return;
			}
			//	추가를 허용했으면... 첨부파일을 등록할 수 있는 tr을
			//	아래쪽에 한번더 만들면 된다.
			//	첨부파일을 등록할 <tr>을 찾는다.
			
			//	이벤트가 일어난 곳의 아버지 tr을 찾는다.
			var	p = $(this).parents("tr");
			//	이 tr의 아래쪽 형제 노드는 찾는다.
			var	tr = p.next();
			//	이 tr을 한번 복사한다.
			var	copy = tr.clone();
			//	추가된 내용의 <input type="file"의 name 속성값을
			//	바꿔야 한다.
			//		file1 -> file2, file3, ....	으로 바꿀 예정이다.
			//	원리	복사된 것의 <input 을 찾아서 name 속성을 바꾼다.
			
			//	위의 것을 복사해서 사용하는 원리이므러...
			//	위에서 선택한 파일도 같이 포함된다.
			var	input = copy.find("input");
			input.attr("name", "file" + count);
			//	복사 받은 내용 중에서 선택한 파일은 지운다.
			input.val("");
			$("#files").before(copy);
		});
		
		//	삭제하기
		$("#rBtn").click(function(){
			//	글등록 단추 앞에있는 한줄을 지우면 된다.
			if(count == 1) {
				return;
			}
			var	tr = $("#files").prev();
			tr.remove();
			count = count - 1;
		});
		
		$("#wBtn").click(function(){
			//	무결성검사
			
			$("#wfrm").submit();
		});
	});
</script>

<body>
<%--	글쓰기 폼을 이쁘게 만들어주면 될 것이다. 
		이번에는 동시에 5개까지 첨부파일을 처리할 수 있도록 해볼 예정이다.
		
		주의
			파일을 첨부하면 파일의 이름이 필요한것이 아니고
			파일의 내용이 서버에 전달되어야 한다.
			그래야 업로드를 할 수 있다.
			
			미안하지만 일반 form은 화면에 보이는 내용(파일의 이름)만
			서버에 전송된다.		
		★★★
		결론	만약 서버에 파일의 내용을 전달하고 싶으면
				스트림 방식으로 처리해야 하며
				이때 encType="multipart/form-data"	를
				기록해주면 된다.
--%>
	<form method="POST" id="wfrm" action="../FileBoard/WriteProc.sun" encType="multipart/form-data">
		<table width="700" align="center" border="1">
			<tr>
				<td>글쓴이</td>
				<td><input type="text" id="writer" name="writer"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" id="title" name="title"></td>
			</tr>
			<tr>
				<td colspan="2">
					<textarea id="body" name="body"></textarea>
				</td>
			</tr>			
			<tr>
				<td>비밀번호</td>
				<td><input type="password" id="pw" name="pw"></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="button" id="aBtn" value="추가">
					<input type="button" id="rBtn" value="삭제">
				</td>
			</tr>			
<%--
	첨부파일을 등록하기 위해서는 <input type="file" 이라는 입력상자를
	사용해야 한다.
--%>			
			<tr>
				<td>첨부파일</td>
				<td><input type="file" id="file1" name="file1"></td>
			</tr>
			<tr id="files">
				<td colspan="2" align="center">
					<input type="button" id="wBtn" value="글등록">
				</td>
			</tr>
		</table>	
	</form>
</body>
</html>







