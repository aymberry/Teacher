<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="JDBC.*, java.sql.*" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	//	할일
	//		각각의 사람이 받은표의 배분율을 구해서 그래프로 보여주고 싶다.
	//	1.	각각의 사람이 받은 표 수를 구해야 한다.
	//		이것은 데이터베이스가 가지고 있으므로 이것을 가지고 오면 된다.
	JDBCUtil		db = null;
	Connection	con = null;
	Statement		stmt = null;
	ResultSet		rs = null;
	int[]			daps = new int[4];	//	각각의 사람이 받은 표수를 기억할 변수
	try {
		db = new JDBCUtil();
		con = db.getCON();
		stmt = db.getSTMT(con);
		String	sql = "SELECT * FROM Survey";
		rs = stmt.executeQuery(sql);
		//	처음 탄생한 rs의 작업 포인터는 BOF에 있으므로...
		rs.next();
		for(int i = 0; i < 4; i++) {
			daps[i] = rs.getInt(i + 1);
			//	잊지마세요...
			//		데이터베이스 작업은 1부터 시작한다.
		}
	}
	catch(Exception e) {
	}
	finally {
		db.close(rs);
		db.close(stmt);
		db.close(con);
	}
	//	2.	이 표수를 이용해서 백분율을 구해야 한다.
	//		백분율을 구하기 위해서는 총합을 알아야 한다.
	
	int		total = 0;
	for(int i = 0; i < 4; i++) {
		total = total + daps[i];
	}
	
	//		백분율을 구하자
	int[]	per = new int[4];		//	4사람의 백분율을 기억할 변수
	for(int i = 0; i < 4; i++) {
		per[i] = daps[i] * 100 / total;
	}
%>
<%--	구해진 백분율을 이용해서 이쁘게 출력하자.
		막대 그래프 그리는 원리는
			자그마한 그림을 백분율 수만큼 나열해주면
			마치 막대그래프처럼 보일 것이다.
--%>
	<table width="800" border="1" align="center">
<%
		for(int i = 0; i < 4; i++) {
%>
			<tr>
				<td><%= (i + 1) + "번" %></td>
				<td>
<%
					for(int j = 0; j < per[i]; j++) {%><img src="<%= (i + 1) + ".png" %>" width="5" height="5"><%	}
%>
				</td>
			</tr>
<%
		}
%>
		<tr>
			<td colspan="2" align="center">
				<a href="http://localhost:8080/SunWeb/Survey/SurveyForm.jsp">설문 문항보기</a>
				<a href="http://localhost:8080/SunWeb">홈으로</a>
			</td>
		</tr>
	</table>
</body>
</html>





