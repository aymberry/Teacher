package P0712;
/*
 * 	����
 * 		Ư�� ������ ������ �� �� ������ ������ �о
 * 		ȭ�鿡 �������.
 */
import		java.io.*;
public class Test06 {
	public static void main(String[] args) /*throws Exception*/ {
		FileReader		fr = null;
		try {
			fr = new FileReader("D:\\��������\\Java\\070����.txt");
			//	�� ������ �Լ��� ���ܸ� ������ ������ �Լ��̹Ƿ�
			//	�ݵ�� �� ������ �Լ��� ����ϴ� ��(new ��Ű�°�)����
			//	try ó���� ���־�� �Ѵ�.
			while(true) {
				char[]	buff = new char[256];
				int	len = fr.read(buff);
				if(len < 0) {
					break;
				}
				String temp = new String(buff, 0, len);
				System.out.print(temp);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
