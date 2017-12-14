<%@ page contentType="text/html; charset=UTF-8" %>
<%--
	콤보상자를 하나 만들고 내가 선택한 항목을 서버에게 전달하도록 하자.
--%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<form method="POST" action="Test02.jsp">
		<%--	콤보상자 역시 서버에게 전달될 때는 키값이 있어야하므로
				name 속성이 있어야 한다.
		--%>
		<select name="id">
			<option value="hong">홍길동</option>
			<option value="park">박아지</option>
			<option value="jang">장독대</option>
			<option value="lee">이기자</option>
		</select>	
		<%--
			이렇게 하면 화면에는 홍길동 이기자 까지의 항목을 가진 
			콤보 상자가 만들어진다.
			
			가끔은 화면에 나온 내용이 아닌 다른 내용을 전달할 필요가 있다.
			예를 들어서 프로그램 처리를 원할하게 하기 위해서
			홍길동 대신에 code값을 전달하고 싶다.....
			
			이런 경우에는 value 속성을 지정하면 되고
			value 속성이 있는 경우는 value 속성의 값이 우선 전달된다.
		--%>
		<input type="submit" value="눌러">
	</form>
</body>
</html>









