package P0831;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Controller.SuperAction;
import JDBC.JDBCUtil;

public class CategoryForm extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		
		//	할일
		//		디비안에 등록된 카테고리 중에서 대 카테고리 부분만
		//		검색한다.
		//		원래는 SQL 만들고 DAO 만들고 처리해야 원칙이다.
		//		오늘은 그냥 컨트롤러에서 직접 다 해볼 생각이다.
		//	대카테고리리는 코드값이 모두 4글짜로 구성되었다.
		String sql = "SELECT * FROM Category WHERE c_Code LIKE '____'";
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
		
		req.setAttribute("LCATE", list);
		return "../P0831/CategoryForm.jsp";
	}
}







