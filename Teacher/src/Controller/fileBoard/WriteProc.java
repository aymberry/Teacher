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
		//	Ŭ���̾�Ʈ�ʿ��� enctype="multipart/form-data"�� ������ 
		//	������ �츮�� ���ݱ��� �޾Ҵ� �Ķ���͸� ����� �� ����.
		//	req.getAttribute("")�� ����� �� ����.
		//	��Ʈ�� ������� �����͸� �޾ƾ� �Ѵ�.
		
		//	�ٷ� ���۾��� ����ϱ� ���ؼ��� �츮�� �ܺζ��̺귯��
		//	����ϱ�� �ߴ�.
		
		//	���	�ܺζ��̺귯���� �ִ� �Լ��� ����ϸ� 
		//			�ڵ����� �����͸� ���� �� �ִ�.
		
		//	�� Ŭ������ cos.jar�� �����ϴ� Ŭ�����̴�.
		//	�� Ŭ������ Ư¡
		//	1.	��Ʈ��������� ���޵Ǿ��� ������ �޾��ִ� ��Ȱ�� �Ѵ�.
		//	2.	�ڵ������� ������ ���ε��ϴ� ����� ������ �ش�.
		
		//	����	���ε� ������ ������ġ
		//		1.	���� �ٿ�ε带 ���� ���ε�
		//			�ƹ� ��ġ���� ���ε��ϸ� �ȴ�.
		//	��>		D:\\upload  ������ ������ �����̑m
		String	savePath = "D:\\upload";
		
		//		2.	Web ���������� ����� �������� ���ε�(�ַ� �̹���)
		//			�ݵ�� ������Ʈ �ȿ� WebContend �Ʒ��� ������ �̿��ؾ� �Ѵ�.
		//			����
		//				��Ŭ������ ������ ��ġ�� ���� ������ ����ϴ�
		//				������ ��ġ�� �ٸ���.
		//				���ε� ��ġ�� ȭ�鿡 ���̴� ��ġ�� �ƴϰ�
		//				���� ������ ����ϴ� ��ġ�̾�� �Ѵ�.
		//		����ϴ� ���
		//		1.	WebContent ������ ���ε�� ������ ������ ������ �����.
		//		2.	req.getSession().getServletContext().getRealPath("�����̸�") 
		//			�Լ��� ���� ������ ����ϴ� ������ ��θ� ���Ѵ�.
		//	��>		�츮�� upload ������ ������ �����̸�....
//		String	savePath = req.getSession().getServletContext().getRealPath("upload");
		MultipartRequest multi = null;
		try { 
			multi = new MultipartRequest(req, savePath, 1024 * 1024 * 10, "UTF-8", new DefaultFileRenamePolicy());
		}
		catch(Exception e){}
		//	�Ű�����
		//		1.	req				�� Ŭ���̾�Ʈ�� ����� request
		//		2.	savePath		���ε� ������ ������ ��ġ
		//		3.					����� ���ε� ������ �ִ� ũ�� 
		//		4.					�ѱ� ���ڵ� ���
		//		5.					���� �̸��� ������ �ߺ��Ǵ� ���
		//							�̸� ���� ���

		//	��Ʈ�� ������� ���޵� �����ʹ� �츮�� ���� ���ϰ�
		//	cos.jar ������ MultipartRequest Ŭ������ ��� �޾Ƽ� �����ϰ� �ִ�.
		//	���� ���޵� �����Ͱ� �ʿ��ϴٸ�.......
		//	�̰��� MultipartRequest�� �̿��ؼ� �˾Ƴ��� �Ѵ�.
		
		//	���� ���ε�� �Ǿ�����... �̰��� �츮�� �����ͺ��̽���
		//	����� ���ƾ߰ڴ�.
		
		//	Ŭ���̾�Ʈ�� �˷��� �Խù� ������ �޴´�.
		String	writer = multi.getParameter("writer");
		String	title 	= multi.getParameter("title");
		String	body 	= multi.getParameter("body");
		String	pw 	= multi.getParameter("pw");
		
		//	���� ���� ÷�ΰ� �Ѱ����?
		//	Ȥ�� ÷�� ���ϵ� ������ Ű���� �� �˰� �ִٸ�... 
		//	�翬�� ���� ÷���� Ű��(�츮�� ���ϸ� file1)�� �˰� �����Ƿ�
		//	�̰��� �̿��ؼ� ÷�� ������ ������ ���ϸ� �ȴ�.
//		String	oriName = multi.getOriginalFileName("file1");
//		String	saveName = multi.getFilesystemName("file1");
//		File		file = multi.getFile("file1");
//		long	size = file.length();

		//	�츮�� ��� ÷�ε��� �𸣴� ���¶��?
		//	Ȥ�� Ű���� �������� �� �𸣴� ���¶��...
		//	����	1.	÷�� ���ϵ� ������ Ű���� ���� �˾Ƴ���.
		//				�� �Լ��� getFileNames();
//		Enumeration	keys = multi.getFileNames();
//		while(keys.hasMoreElements()) {
//			String key = (String) keys.nextElement();
//			String	oriName = multi.getOriginalFileName(key);
//			String	saveName = multi.getFilesystemName(key);
//			File		file = multi.getFile(key);
//			long	size = file.length();
//			
//			//	���� �Ѱ��� ÷�� ������ ������ �˾Ƴ� ���̴�.
//			///	�� ������ �����ͺ��̽��� ����ϸ�ȴ�.
//		}
		
		
		//	���� �� ������ �����ͺ��̽��� ����ϸ� �� ���̴�.
		FileBoardDAO	dao = new FileBoardDAO();
		int		no = dao.getNowNO();
		dao.insertBoard(no, writer, title, body, pw);
//		dao.insertFileInfo(no, oriName, saveName, size, savePath);
		
		Enumeration	keys = multi.getFileNames();
		while(keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String	oriName = multi.getOriginalFileName(key);
			//	Ȥ�� ÷�������� ���� ��쵵 �ִٸ�....
			//	÷�� ������ ������ �����ͺ��̽� �Է� �۾���
			//	���� ���ϵ��� �����ϸ� �ȴ�.
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



