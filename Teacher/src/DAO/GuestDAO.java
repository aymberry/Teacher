package DAO;
/*
 * 	�� Ŭ������ �����ͺ��̽� �۾��� ����� Ŭ�����̴�.
 * 
 * 	�� Ŭ������ ��� ��������� ��Ģ�� ����
 * 	�ٸ� �����ͺ��̽� �۾��� �� ���ϱ� 
 * 	�� ������ �� �ֵ��� ����� �װ��� DAO�� �ȴ�.
 */
import		JDBC.*;
import		java.sql.*;
import		VO.*;
import		java.util.*;
public class GuestDAO {
	//	���� �۾� ������ ������� �Ѵ�.
	//	���� �۾�������
	//		1.	���� �۾���
	public void GuestWriter(String who, String body) {
		//	�� �Լ��� ���� �۾��� �۾��� ó���� �Լ��̴�.
		//	�� �Լ��� �۾��� ������ �����ϱ� ���ؼ��� ����� ������
		//	�˾ƾ� �Ѵ�.
		JDBCUtil	db = null;
		Connection	con = null;
		PreparedStatement pstmt = null;
		try {
			//	����̹� �ε�
			db = new JDBCUtil();
			//	�����ϰ�
			con = db.getCON();
			//	Prepared ������Ʈ �����
			String sql = "INSERT INTO Guest VALUES( (SELECT NVL(MAX(g_NO), 0) + 1 FROM Guest), ?, ?, SYSDATE)";
			pstmt = db.getPSTMT(con, sql);
			//	���� �����ϸ� �ȴ�.
			//		?�� ä���� �Ѵ�.
			pstmt.setString(1, who);
			pstmt.setString(2, body);
			
			pstmt.execute();
		}
		catch(Exception e) {
			System.out.println("�Է� ���� = " + e);
		}
		finally {
			db.close(pstmt);
			db.close(con);
		}
	}
	
	//		2.	���� ��Ϻ���
	//			�����ͺ��̽��� ������ �ִ� ���� ������ �˾Ƴ��� ���
	public ArrayList getGuestList() {
		//	����
		JDBCUtil		db = null;
		Connection	con = null;
		Statement		stmt = null;
		ResultSet		rs = null;
		//	�������� �����͸� ���� �÷����� �غ��ϰ�...
		ArrayList		list = new ArrayList();
		try {
		//		����̹��ε�
			db = new JDBCUtil();
		//		����
			con = db.getCON();
		//		������Ʈ��Ʈ
			stmt = db.getSTMT(con);
		//		���ǽ���
			String sql = "SELECT g_NO AS NO, g_Writer AS WHO, g_Body AS Body, g_Date AS WDate FROM Guest Order BY g_No DESC";
			rs = stmt.executeQuery(sql);
		//		��� �м�

			while(rs.next()) {
				//	�����͸� �ϳ��� ������ �Ѵ�.
				//	�ٵ� ���ٿ��� �������� �����Ͱ� �����ϰ� �̰��� �ٽ� ������ ���´�.
				//	�� ��� �����͸� �ѹ��� ����ϴ� ����� ���� ������?
				
				//	���	������ �����ʹ� �ϳ��� Ŭ������ ��� ����ϰ�
				//			������ �����͸� ���� Ŭ������ VO Ŭ������� �Ѵ�.
				//			�������� �����ʹ� �÷����� �̿��ؼ� ������ �� ���̴�.
				
				//	������ ������ VO�� ����Ѵ�.
				GuestVO	vo = new GuestVO();
				vo.no = rs.getInt("NO");
				vo.who = rs.getString("WHO");
				vo.body = rs.getString("BODY");
				vo.date = rs.getDate("WDATE");
				
				//	�̰��� �ݺ��Ǹ鼭 ������ ���� �� �����Ƿ�...
				//	������ �����͸� �÷������� ���´�.
				list.add(vo);
			}
		}
		catch(Exception e) {
			System.out.println("��� ������ ���� = " + e);
		}
		finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		//	�� �Լ��� ������ ����� �˾Ƴ��� ���̹Ƿ�....
		//	�˾Ƴ� �÷����� �˷��ش�.
		return list;
	}
	
	
}






