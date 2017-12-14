package Util;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

public class FileUtil {
	/*
	 * 	���� �ٿ�ε� ó���� ���� �Լ�
	 */
	public static void fileDownload(
			HttpServletResponse resp, String oriName, String saveName, String path) {
		//	�Ķ������ �ǹ�
		//	�� �Լ��� Ŭ���̾�Ʈ���� ������ �� �Լ��̴�.
		//	(��, ��Ʈ�� ������� ������ Ŭ���̾�Ʈ���� �˷��� �Լ��̴�.)
		//	resp		���� ������ �ϴ� Ŭ������ �ʿ�� �Ѵ�.
		//	oriName	���� ������ �̸�
		//	saveName	����� ������ �̸�
		//	path		�� ������ ����ִ� ��ġ
		
		try {
			//	1.	���� ������ ������ html ������� �����Ǿ� �ִ�.
			//		�ٵ� ������ ��Ʈ�� ������� ������ �� �����̴�.
			//		���� ���� ����� ����ϰ� ���ο� ���� ����� �����־�� �Ѵ�.
			resp.reset();
			resp.setContentType("application/octet-stream");
			
			//	2.	Ȥ�� ������ �̸��� �ѱ��� ��쿡�� �ѱ��� ������ �� �� �ֵ�.
			//		�̷� ��츦 ����ؼ� �ٿ�ε� �� ������ �̸���
			//		���ڵ��� ���´�.
			//		�츮�� oriName�� Ŭ���̾�Ʈ���� �ִ� �����̸��̹Ƿ�
			//		�� �̸��� ���ڵ��� ���´�.
			String	encoding = new String(oriName.getBytes("UTF-8"), "8859_1");
			
			//	3.	���� ���ڵ��� �����̸��� Ŭ���̾�Ʈ���� �����Ѵ�.
			resp.setHeader("Content-Disposition", "attachment; filename = " + encoding);
			//		�� ��ɿ� ���ؼ� Ŭ���̾�Ʈ�� ���� �ٿ�ε� ��ȭ���ڸ� ���Ե� ���̴�.
			
			//	4.	Ŭ���̾�Ʈ�� �ٿ�ε带 ����ϸ�.....
			//		������ ��Ʈ�� ������� Ŭ���̾�Ʈ���� ��������ָ� �ȴ�.
			//		������ �����ϱ� ���ؼ��� �ΰ��� ��Ʈ���� �ʿ��ϴ�.
			//		�ִ���, �޴��� ��Ʈ���� �ʿ��ϴ�.
			//		���������� ������ ������ �б� ���ؼ� input�� �ʿ��ϰ�
			//		������ ������ Ŭ���̾�Ʈ�� ��� �ϹǷ�
			//		Ŭ���̾�Ʈ�����δ� output�� �ʿ��ϴ�.
			
			FileInputStream	fin = 
					new FileInputStream(path + "\\" + saveName);
			ServletOutputStream fout = resp.getOutputStream();
			//	���� ��Ʈ�� ������ �Ǿ����Ƿ� ��� �ݺ��ؾ� 
			//	������ ������ �𸣹Ƿ�....
			while(true) {
				byte[]	 buff = new byte[1024];
				int	len = fin.read(buff);
				if(len == -1) {
					break;
				}
				fout.write(buff, 0, len);
			}
			fout.flush();
			fin.close();
			fout.close();
		}
		catch(Exception e) {
		}
	}
}




