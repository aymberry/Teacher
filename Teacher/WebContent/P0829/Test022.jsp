<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*, JDBC.*" %>
<!doctype html>
<html>
<body>
<%--	할일
		보고싶은 뉴스번호 받고
		
		데이터베이스에서 해당 뉴스를 꺼내서
		
		이쁘게 테이블로 만들어 놓자.
--%>  

<%
	String	strKind = request.getParameter("kind");
	int		kind = Integer.parseInt(strKind);
	
	JDBCUtil		db = null;
	Connection	con = null;
	Statement		stmt = null;
	ResultSet		rs = null;
	try {
		db = new JDBCUtil();
		con = db.getCON();
		stmt = db.getSTMT(con);
		
		String sql = "SELECT * FROM News WHERE n_Kind=" + kind;
		rs = stmt.executeQuery(sql);	
%>		
		<table border="1" width="700" align="center">
<%
			while(rs.next()) {
%>
				<tr>
					<td>
						<%= rs.getString("n_Title") %>
					</td>
				</tr>
<%
			}
%>
	</table>
<%
	}
	catch(Exception e) {
	}
	finally  {
		try {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		catch(Exception e) {}
	}
%>
</body>
</html>




