package P0726;
/*
 * 	����
 * 		Ư�� txt ������ �����غ���.
 * 
 * 		���� �������� ������ �ִ� Ư�� ������ ������ �����̴�.
 * 
 * 		����	char ������ ������� �ַ� ���� ������ ó���� ����Ѵ�.
 * 				�ؽ�Ʈ ���� ó���� ����Ѵ�.
 */
import		java.io.*;
public class Copy02 {

	public Copy02() {
		FileReader			fr = null;
		FileWriter			fw = null;
		try {
			fr = new FileReader("D:\\��������\\Java\\0703����.txt");
			fw = new FileWriter("D:\\���缳��.txt");

			while(true) {
				char[]	buff = new char[256];
				int len = fr.read(buff);
				if(len == -1) {
					break;
				}
				fw.write(buff, 0, len);
			}
			//	�̹� ���� ����� ������.
			//	Ȥ�ö� ���ۿ� ���� ������ ������....
			//	�װ͵� ������ ��������.
			fw.flush();			
			boolean temp = true;
			while(temp) {
				//	���ѷ��� ���ȴ� ���α׷� �ȳ�����.
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		new Copy02();
	}
}
