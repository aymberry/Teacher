package P0824;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sam02 extends SuperController  {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("2�� ��Ʈ�Ѷ�");
		
		return "../P0824/ImsiView02.jsp";
	}
}
