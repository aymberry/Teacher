<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, java.text.*" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<script>
		//	이것은 한번만 호출되는데 왜 계속 시계가 가나요 
		setTimeout("history.go(0);", 1000);
	</script>
</head>
<body>
<!-- 	현재 시스템의 시간을 출력해보자. -->
<%
	//	현재 시간을 알아내고
	Calendar	car = Calendar.getInstance();
	//	시간을 원하는 형태로 출력하기 위한 포맷을 만든다.
	SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	//	현재 시간을 원하는 형태로 만들자
	String	now = form.format(car.getTime());
%>	
	현재 시간 : <h1><%= now %></h1>	

</body>
</html>



