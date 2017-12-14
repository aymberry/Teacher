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
		//	����
		//	�Ķ���� �ް�
		String	lcate = req.getParameter("lcate");
		
		//	��û ó��
		//	��ī�װ��� ��ī�װ��ڵ� + 4�ڸ� => 8�ڸ�
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
			//	����� �м��Ѵ�.
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
		
		//��		
		req.setAttribute("MCATE", list);

		
		//	��
//		return "../P0831/MCategory.jsp";		//	xml ���� ��
		return "../P0901/MCategory.jsp";		//	json ���� ��
		
	}
}


