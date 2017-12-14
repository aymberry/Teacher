package DAO;
/*
 * 	�� Ŭ������ ���� �����ͺ��̽� ó���� ����� ���� Ŭ����
 */
import		JDBC.*;
import		java.sql.*;
import		VO.*;
public class MemberDAO {
	//	���� �α��� ó���� ����� �Լ��� �ϳ� ����ڴ�.
	public MemberVO loginCheck(String id, String pw) {
		//	�������� �� �Լ����� �ڽ��� id�� ��й�ȣ�� �˷��ָ�
		//	��ȸ�� ���� ���θ� �ľ��ؼ� �����ϴ� �Լ��̴�.
		//	����
		JDBCUtil				db 		= null;
		Connection			con 	= null;
		PreparedStatement	pstmt 	= null;
		ResultSet				rs 		= null;
		//	ȸ�������� ����� VO Ŭ���� �غ� �ϰ�
		MemberVO				mVO 	= null;
		try {
			db = new JDBCUtil();
			con = db.getCON();
			String sql = "SELECT * FROM Member WHERE m_id=? AND m_password=?";
			pstmt = db.getPSTMT(con, sql);
			//	�����ϸ� �Ǵµ�... ?�� ä���� �����ؾ� �ϹǷ�....
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			//	������ �� ����� �м��� ���� �Ѵ�.
			
			if(rs.next()) {
				System.out.println("111");
				//	rs.next()	�۾� �����͸� �Ʒ��� �̵���Ű����.
				//	ȸ���Դϴ�.
				
				//	ȸ���� ������ �˷��־�߰ڰ�....
				//	�ٵ� ȸ���� ������ �������� ������ �ִ�.....
				//	ȸ�� ������ ����� VOŬ������ �����ϰ�
				mVO = new MemberVO();
				//	�� Ŭ������ ������ �����͸� �Է�����.
				mVO.setId(rs.getString("m_id"));
				mVO.setPw(rs.getString("m_Password"));
				mVO.setNick(rs.getString("m_Nick"));
			}
			else {
				System.out.println("222");
				//	ȸ���� �ƴմϴ�.
				//	�ƹ� ������ �˷��� �� ����......
			}
		}
		catch(Exception e) {
			System.out.println("�α��� ���� = " + e);
		}
		finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return mVO;
	}
}





