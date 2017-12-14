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
	//	이 문서는 사용자가 설문조사를 참여하면 그 결과를 데이터베이스에
	//	기록하는 작업을 수행할 문서이다.
	//	할일
	//	1	사용자가 선택한 항목 번호를 알아낸다.
	String		strDap = request.getParameter("dap");		//	"1"
	//		사용자는 dap이라는 키값으로 선택한 항목의 번호를
	//		알려주기로 약속했으므로...
	//		이처럼 Web은 약속에 의해서 코딩되는 작업이다.
	//		참고
	//			서버는 클라이언트가 준 데이터는 항상 Stirng으로만 받을 수 있다.
	int		dap = Integer.parseInt(strDap);	
	//		필요하다면 원하는 데이터 형태로 바꾸어서 사용해야 한다.
	
	//	2	이제 이 항목의 참여수가 늘어났으므로 데이터베이스에 기록하자.
	//		당근	질의 명령이 필요할 것이다.	
	String		sql = null;
	switch(dap) {
	case 1:
		sql = "UPDATE Survey SET s_Dap1 = s_Dap1 + 1";
		break;
	case 2:
		sql = "UPDATE Survey SET s_Dap2 = s_Dap2 + 1";		
		break;
	case 3:
		sql = "UPDATE Survey SET s_Dap3 = s_Dap3 + 1";
		break;
	case 4:
		sql = "UPDATE Survey SET s_Dap4 = s_Dap4 + 1";
		break;
	}
	
	//	이제 데이터베이스에 접속을 해서 질의 명령을 수행하면 될 것이다.
	JDBCUtil		db = null;
	Connection	con = null;
	Statement		stmt = null;
	try {
		db = new JDBCUtil();
		con = db.getCON();
		stmt = db.getSTMT(con);
		
		//	질의 명령을 실행하자.
		stmt.execute(sql);		
	}
	catch(Exception e) {}
	finally {
		db.close(stmt);
		db.close(con);
	}
	//	이제 사용자가 선택한 문항의 참여수를 증가시켜서 설문조사 참여가
	//	끝났다.
	
	//	이제 뭔가를 보여줄 차례인데...
	//	(왜냐하면 클라이언트가 요청하면 결과 문서가 있어야 하므로...)
	//	보여줄 내용이 없다.
	
	//	대신 설문조사 참여를 하면 대신해서 다시 설문조사 문항을
	//	보여주고자 한다.	==>	개발자가 선택하는 내용이다.
	//	이처럼 결과를 보여주는 대신 다른 문서를 보여주고 싶을 경우에는
	//	서버가 사용자가 마치 다른 문서를 요청한 것처럼 중간에서
	//	요청을 바꿔주어야 한다.
	
	//	이때 사용하는 명령어
	//		response.sendRediect("바꿀 요청");
	
	//	참고(철칙)
	//		만약 insert, delete, update등 테이블 내용이 바뀌는 질의를
	//		실행한 경우에는 반드시 중간에서 요청을 바꾸도록 한다.
	//		요청을 바꾸지 않으면 마지막 요청이 테이블 변경을 유지하므로
	//		새로고침을 하면 마지막 요청이 다시 실행되어서
	//		테이블 내용이 다시 변경된다.

	response.sendRedirect("http://localhost:8080/SunWeb/Survey/SurveyResult.jsp");
%>
	<h1>설문조사가 처리되었다.</h1>
</body>
</html>



