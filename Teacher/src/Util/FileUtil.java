package Util;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

public class FileUtil {
	/*
	 * 	파일 다운로드 처리를 위한 함수
	 */
	public static void fileDownload(
			HttpServletResponse resp, String oriName, String saveName, String path) {
		//	파라메터의 의미
		//	이 함수는 클라이언트에게 응답을 할 함수이다.
		//	(즉, 스트림 방식으로 파일을 클라이언트에게 알려줄 함수이다.)
		//	resp		응답 관리를 하는 클래스를 필요로 한다.
		//	oriName	원래 파일의 이름
		//	saveName	저장된 파일의 이름
		//	path		그 파일이 들어있는 위치
		
		try {
			//	1.	원래 서블릿의 응답은 html 방식으로 설정되어 있다.
			//		근데 지금은 스트림 방식으로 응답을 할 예정이다.
			//		현재 응답 방식을 취소하고 새로운 응답 방식을 정해주어야 한다.
			resp.reset();
			resp.setContentType("application/octet-stream");
			
			//	2.	혹시 파일의 이름이 한글인 경우에는 한글이 깨져서 들어갈 수 있따.
			//		이런 경우를 대비해서 다운로드 할 파일의 이름을
			//		엔코딩해 놓는다.
			//		우리는 oriName이 클라이언트에게 주는 파일이름이므로
			//		이 이름을 엔코딩해 놓는다.
			String	encoding = new String(oriName.getBytes("UTF-8"), "8859_1");
			
			//	3.	이제 엔코딩한 파일이름을 클라이언트에게 전송한다.
			resp.setHeader("Content-Disposition", "attachment; filename = " + encoding);
			//		이 명령에 의해서 클라이언트는 파일 다운로드 대화상자를 보게될 것이다.
			
			//	4.	클라이언트가 다운로드를 허락하면.....
			//		파일을 스트림 방식으로 클라이언트에게 복사시켜주면 된다.
			//		파일을 복사하기 위해서는 두개의 스트림이 필요하다.
			//		주는쪽, 받는쪽 스트림이 필요하다.
			//		서버에서는 파일의 내용을 읽기 위해서 input이 필요하고
			//		파일을 내용을 클라이언트에 줘야 하므로
			//		클라이언트쪽으로는 output이 필요하다.
			
			FileInputStream	fin = 
					new FileInputStream(path + "\\" + saveName);
			ServletOutputStream fout = resp.getOutputStream();
			//	이제 스트림 개설이 되었으므로 몇번 반복해야 
			//	전송이 끝날지 모르므로....
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




