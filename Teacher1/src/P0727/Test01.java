package P0727;
/*
 * 	문제
 * 		키보드로 입력하면 그 내용을 그대로 파일에 저장하자.
 */
import		java.io.*;
public class Test01 {
	public Test01() {
		//	타게 스트림이 2개 필요하다
		//		1번		키보드로 연결된 스트림
		//				==>		이미 준비된 스트림이다.
		//		2번		파일로 연결된 스트림
		//				==>		타겟 스트림을 준비해야 한다.
		FileOutputStream			fout = null;	//	지역 변수이므로 강제 초기화 해야 한다.
		//	나는 필요에 의해서 성능 향상을 위해서 필터를 연결하고자 한다.
		//	필터 스트림도 같이 준비한다.
		BufferedInputStream		bin = null;
		BufferedOutputStream	bout = null;
		try {
			//	이제 스트림을 만들어 보자.
			//		스트림을 만들때는 반드시
			//		1.	타겟 스트림을 먼저 만들고(필수)
			//		2.	필터 스트림을 연결해야 한다.(선택)
			
			//	입력쪽		타겟 : System.in으로 준비되어 있다.
			bin = new BufferedInputStream(System.in);
			//	출력쪽
			fout = new FileOutputStream("D:\\sam.txt");
			bout = new BufferedOutputStream(fout);
		
			//	이제부터는 어제 배운데로 데이터를 처리하면 된다.
			//	목적	1.	키보드를 이용해서 데이터를 받는다.
			byte[]	buff = new byte[1024];
			int	len = bin.read(buff);
			
			//			2.	파일에 그 내용을 기록하면 된다.
			bout.write(buff, 0, len);
			//	Buffered를 사용한 경우에는 마지막에
			//		혹시 버퍼가 가득차지 않으면 외부장치로
			//		나가지 못하므로 습관적으로...
			//		마지막에는 강제로 Buffer를 비워두도록 해야한다.
			bout.flush();
		}
		catch(Exception e) {
			//	외부장치와 작업을 하므로 여러분의 실수가 아니고
			//	외부장치의 문제로 인해서 에러가 날 수 있다.
			//	무슨 문제가 있는지 확인하는 습관을 가지자.
			System.out.println(e);
		}
		finally {
			//	팁
			//		외부장치와 연결을 한 경우는 100%
			//		사용이 완료된 후에는 연결을 닫아주는것이 좋다.
			//		즉, close 처리를 해야 한다.
			
			//	finally는 에러가 나던 안나던 항상 실행하는 부분이다.
			//	이 부분에서 사용하던 자원을 회수(close) 시키는 습관을
			//	가져야 한다.
			
			//	예를 들어서 파일을 닫지 않으면 그 파일을 다른곳에서
			//	사용할 수 없는 경우까지 발생할 수 있다.
			try {
				bin.close();
				bout.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}
