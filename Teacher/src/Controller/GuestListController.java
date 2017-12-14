package Controller;

import java.util.*;

import javax.servlet.http.*;

import DAO.*;
import Util.*;

public class GuestListController implements DolSuper {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		GuestDAO2	dao = new GuestDAO2();
		ArrayList		list =dao.getGuestList();
		dao.close();
		req.setAttribute("LIST", list);
		return "../view/Guest/GuestList.jsp";
	}
}
