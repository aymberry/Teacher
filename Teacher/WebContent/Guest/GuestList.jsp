<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, DAO.*, VO.*" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%--	글쓰기 폼을 만들어 주고 --%>
	<form method="POST" id="gfrm" action="http://localhost:8080/SunWeb/Guest/WriteProc.jsp">
		<table border="1" align="center" width="500">
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="writer" id="writer"></td>
			</tr>
			<tr>
				<td>방명록</td>
				<td><textarea name="body" id="body"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="글쓰기" onClick="CheckSend()">				
				</td>
			</tr>
		</table>
	</form>
<%--	기존 내용을 출력한다. 
		기존 내용을 출력하기 위해서는 데이터베이스에 있는 방명록 내용을
		알아와야 한다.
--%>
<%
	GuestDAO	dao = new GuestDAO();
	ArrayList	list = dao.getGuestList();
	//	그럼 이제 방명록 내용을 다 알았으므로 이쁘게 출력해보자.
	
	int		size = list.size();
%>
<%	
	for(int i = 0; i < size; i++) {
		GuestVO vo = (GuestVO) list.get(i);
%>
		<table border="1" align="center" width="600">
			<tr>
				<td>글쓴이</td>
				<td><%= vo.who %></td>
			</tr>	
			<tr>
				<td>본문</td>
				<td><%= vo.body.replaceAll("\r\n", "<br>") %></td>
			</tr>	
			<tr>
				<td width="100">작성일</td>
				<td width="500"><%= vo.date %></td>
			</tr>	
		</table>
<%
	}
%>
<script>
	function CheckSend() {
		//	혹시 글쓴이나 본문이 입력이 되지 않으면 방명록이 무의미하므로
		//	혹시 없으면 못쓰도록 하자.
		//		글쓴이 내용을 알아내서 내용이 없으면 작업을 중단한다.
		var	writer = document.getElementById("writer").value;
		if(writer == "") {
			alert("글쓴이를 입력해 주세요");
			return;
		}
		var	body = document.getElementById("body").value;
		if(body == "") {
			alert("본문 내용을 입력해 주세요");
			return;
		}
		//	==>	이처럼 데이터를 보내기 전에 준비를 하는 단계를
		//		무결성 검사를 한다.... 라고 표현한다.
		
		//	자바 스크립트로 서브밋 하기
		//	1.	폼을 알아낸다.
		var	frm = document.getElementById("gfrm");
		//	2.	submit 시킨다.
		frm.submit();
		
		//	서브밋이란? 폼에 입력한 데이터를 가지고 가서
		//	필요한 작업을 수행하도록 하는 것을 말하며...
		//	그 작업을 수행할 문서를 action=""에 기록한다.
		
	}
</script>  
</body>
</html>




