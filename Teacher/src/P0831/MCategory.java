package P0831;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;
import JDBC.JDBCUtil;

public class MCategory extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		//	할일
		//	파라메터 받고
		String	lcate = req.getParameter("lcate");
		
		//	요청 처리
		//	중카테고리는 대카테고리코드 + 4자리 => 8자리
		String sql = 
		"SELECT * FROM Category WHERE c_Code LIKE '" + lcate + "____'";
		
		JDBCUtil		db = null;
		Connection	con = null;
		Statement		stmt = null;
		ResultSet		rs = null;
		ArrayList		list = new ArrayList();
		try {
			db = new JDBCUtil();
			con = db.getCON();
			stmt = db.getSTMT(con);
			rs = stmt.executeQuery(sql);
			//	결과를 분석한다.
			while(rs.next()) {
				CategoryVO vo = new CategoryVO();
				vo.code = rs.getString("c_Code");
				vo.name = rs.getString("c_Name");
				
				list.add(vo);
			}
		}
		catch(Exception e) {
		}
		finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		//모델		
		req.setAttribute("MCATE", list);

		
		//	뷰
//		return "../P0831/MCategory.jsp";		//	xml 응답 뷰
		return "../P0901/MCategory.jsp";		//	json 응답 뷰
		
	}
}


