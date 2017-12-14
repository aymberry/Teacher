package Controller.fileBoard;

import java.io.File;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import Controller.SuperAction;
import DAO.FileBoardDAO;
import Util.StringUtil;

public class WriteProc extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		//	클라이언트쪽에서 enctype="multipart/form-data"로 서버에 
		//	보내면 우리가 지금까지 받았던 파라메터를 사용할 수 없다.
		//	req.getAttribute("")를 사용할 수 없다.
		//	스트림 방식으로 데이터를 받아야 한다.
		
		//	바로 이작업을 대신하기 위해서는 우리는 외부라이브러를
		//	사용하기로 했다.
		
		//	결론	외부라이브러리에 있는 함수를 사용하면 
		//			자동으로 데이터를 받을 수 있다.
		
		//	이 클래스는 cos.jar가 제공하는 클래스이다.
		//	이 클래스의 특징
		//	1.	스트림방식으로 전달되어진 내용을 받아주는 역활을 한다.
		//	2.	자동적으로 파일을 업로드하는 기능을 구현해 준다.
		
		//	참고	업로드 파일의 저장위치
		//		1.	오직 다운로드를 위한 업로드
		//			아무 위치에나 업로드하면 된다.
		//	예>		D:\\upload  폴더에 저장할 생각이몀
		String	savePath = "D:\\upload";
		
		//		2.	Web 페이지에서 사용할 목적으로 업로드(주로 이미지)
		//			반드시 프로젝트 안에 WebContend 아래의 폴더를 이용해야 한다.
		//			문제
		//				이클립스의 폴더의 위치가 실제 서버가 사용하는
		//				폴더의 위치는 다르다.
		//				업로드 위치는 화면에 보이는 위치가 아니고
		//				실제 서버가 사용하는 위치이어야 한다.
		//		사용하는 방법
		//		1.	WebContent 하위에 업로드된 파일을 보관할 폴더를 만든다.
		//		2.	req.getSession().getServletContext().getRealPath("폴더이름") 
		//			함수를 실제 서버가 사용하는 물리적 경로를 구한다.
		//	예>		우리는 upload 폴더에 저장할 예정이면....
//		String	savePath = req.getSession().getServletContext().getRealPath("upload");
		MultipartRequest multi = null;
		try { 
			multi = new MultipartRequest(req, savePath, 1024 * 1024 * 10, "UTF-8", new DefaultFileRenamePolicy());
		}
		catch(Exception e){}
		//	매개변수
		//		1.	req				이 클라이언트를 상대할 request
		//		2.	savePath		업로드 파일을 저장할 위치
		//		3.					허용할 업로드 파일의 최대 크기 
		//		4.					한글 엔코딩 방식
		//		5.					같은 이름의 파일이 중복되는 경우
		//							이름 수정 방식

		//	스트림 방식으로 전달된 데이터는 우리가 받지 못하고
		//	cos.jar 파일의 MultipartRequest 클래스가 대신 받아서 저장하고 있다.
		//	만약 전달된 데이터가 필요하다면.......
		//	이것은 MultipartRequest를 이용해서 알아내야 한다.
		
		//	이제 업로드는 되었으니... 이것을 우리의 데이터베이스에
		//	기록해 놓아야겠다.
		
		//	클라이언트가 알려준 게시물 정보를 받는다.
		String	writer = multi.getParameter("writer");
		String	title 	= multi.getParameter("title");
		String	body 	= multi.getParameter("body");
		String	pw 	= multi.getParameter("pw");
		
		//	만약 파일 첨부가 한개라면?
		//	혹은 첨부 파일된 내용을 키값을 다 알고 있다면... 
		//	당연히 파일 첨부한 키값(우리로 말하면 file1)을 알고 있으므로
		//	이것을 이용해서 첨부 파일의 정보를 구하면 된다.
//		String	oriName = multi.getOriginalFileName("file1");
//		String	saveName = multi.getFilesystemName("file1");
//		File		file = multi.getFile("file1");
//		long	size = file.length();

		//	우리는 몇개가 첨부될지 모르는 상태라면?
		//	혹은 키값이 무엇인지 잘 모르는 상태라면...
		//	원리	1.	첨부 파일된 내용의 키값을 몽땅 알아낸다.
		//				이 함수는 getFileNames();
//		Enumeration	keys = multi.getFileNames();
//		while(keys.hasMoreElements()) {
//			String key = (String) keys.nextElement();
//			String	oriName = multi.getOriginalFileName(key);
//			String	saveName = multi.getFilesystemName(key);
//			File		file = multi.getFile(key);
//			long	size = file.length();
//			
//			//	이제 한개의 첨부 파일의 정보를 알아낸 것이다.
//			///	이 정보를 데이터베이스에 기록하면된다.
//		}
		
		
		//	이제 이 정보를 데이터베이스에 기록하면 될 것이다.
		FileBoardDAO	dao = new FileBoardDAO();
		int		no = dao.getNowNO();
		dao.insertBoard(no, writer, title, body, pw);
//		dao.insertFileInfo(no, oriName, saveName, size, savePath);
		
		Enumeration	keys = multi.getFileNames();
		while(keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String	oriName = multi.getOriginalFileName(key);
			//	혹시 첨부파일이 없는 경우도 있다면....
			//	첨부 파일이 없으면 데이터베이스 입력 작업을
			//	하지 못하도록 방지하면 된다.
			if(StringUtil.isNull(oriName)) {
				continue;
			}
			String	saveName = multi.getFilesystemName(key);
			File		file = multi.getFile(key);
			long	size = file.length();
			
			dao.insertFileInfo(no, oriName, saveName, size, savePath);
		}
		dao.close();
		return "../view/FileBoard/WriteProc.jsp";
	}
}



