package P0824;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sam03  extends SuperController {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("3번 컨트롤라");
		
		return "../P0824/ImsiView03.jsp";
	}
}
