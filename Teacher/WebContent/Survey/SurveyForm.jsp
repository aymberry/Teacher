<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script>
	function SendResult() {
		//	할일
		//		GET 방식으로 결과 문서를 요청하고자 한다.
		location.href = "http://localhost:8080/SunWeb/Survey/SurveyResult.jsp";
	}

	function checkRadio() {
		var	radio = document.getElementsByName("dap");
		var	check = false;
		for(i = 0; i < radio.length; i++) {
			if(radio[i].checked == true) {
				check = true;
			}
		}
		if(check == false) {
			alert("한사람은 선택을 해야 합니다.");
			return;
		}
		//	자바 스트립트를 이용해서  POST 요청을 한다.	
		var	frm = document.getElementById("sfrm");
		frm.submit();
	}
</script>
<style>
	h1 {
	    width: 300px;
	    margin: auto;
	}
</style>
<body>
	<h1>설문조사 문항보기</h1>
	<%--
		submit 행위가 일어나면
		action에서 지정한 문서가 실행되면서 
		원하는 작업을 수행하게 된다.
		
		여기서 submit는 설문조사 참여를 하기를 원하는 것이므로...
		이 부분에 설문조사 참여를 처리할 문서를 기록하게 되는 것이다.
	--%>
	<form method="POST"  id="sfrm" action="http://localhost:8080/SunWeb/Survey/SurveyProc.jsp">
	<table width="600" border="1" align="center">
		<tr>
			<td colspan="2">
				다음중 가장 잘생긴 남자 연예인은 누구라고 생각하십니까?			
			</td>
		</tr>
		<tr>
			<td width="100"><input type="radio" name="dap" value="1">1</td>
			<td width="500">장동건</td>
		</tr>
		<tr>
			<td width="100"><input type="radio" name="dap"  value="2">2</td>
			<td width="500">이병헌</td>
		</tr>
		<tr>
			<td width="100"><input type="radio" name="dap" value="3">3</td>
			<td width="500">송승헌</td>
		</tr>
		<tr>
			<td width="100"><input type="radio" name="dap" value="4">4</td>
			<td width="500">송중기</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="참여하기" onClick="JavaScript:checkRadio()">
				<input type="button" value="결과보기" onClick="SendResult()">
			</td>
		</tr>
	</table>
	</form>  
</body>
</html>




