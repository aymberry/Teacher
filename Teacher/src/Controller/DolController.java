package Controller;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * 
 */
@WebServlet("*.dol")
public class DolController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, DolSuper>		reqMap;
	
	/**
	 * 
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println(111);
		reqMap = new HashMap<String, DolSuper>();
		Properties pro = new Properties();
		try {
			FileInputStream fin = new FileInputStream("D:\\WebSource\\Teacher\\src\\Controller\\RequestMap.properties");
			pro.load(fin);
		}
		catch(Exception e) {
			System.out.println("Map Loading Error " + e);
		}
	
		Enumeration emu = pro.keys();
		while(emu.hasMoreElements()) {
			String key = (String)emu.nextElement();
			String	con = pro.getProperty(key);
			try {
				Class tempC = Class.forName(con);
				DolSuper cl = (DolSuper)tempC.newInstance();
				reqMap.put(key, cl);
			}
			catch(Exception e) {
				System.out.println("Create Class Error " + e);
			}
		}
	}

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getRequestURI();
		String domain = request.getContextPath();
		String realUrl = url.substring(domain.length());
		System.out.println(realUrl);
		DolSuper controller = reqMap.get(realUrl);
		System.out.println(controller);
		String view = controller.action(request, response);
		
		try {
			RequestDispatcher rd = request.getRequestDispatcher(view);
			rd.forward(request, response);
		}
		catch(Exception e) {
			System.out.println("View Call Error " + e);
		}
	}

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
