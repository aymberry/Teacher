package P0726;

import		java.io.*;
public class Output01 {

	public Output01() {
		try {
			//		1.	���Ͽ� ����� Ÿ�� ��Ʈ���� ������ �Ѵ�.
			FileOutputStream fout = new FileOutputStream("D:\\Test.txt"); 
			
			//	1.	�� ���ڸ� ���Ͽ� �������.
//			int		ch = 'A';
//			fout.write(ch);
			
			//	2.	���� ���ڸ� ����� ����.
//			String	data = "�����Ⱑ ���ܿ� ���Ƕ�����";
//			byte[] buff = data.getBytes();
//			fout.write(buff);
			
			//	3.	���� ���ڸ� ����� ����.
			//		(��� �����͸� �����Ѵ�.)
			String data = "My Name Is Kim Myoung Whan";
			byte[] buff = data.getBytes();
			//	���� ���߿��� �̸��� �����ϰ� �ʹ�.
			fout.write(buff, 11, buff.length - 11);
			
			
		}
		catch(Exception e) {
			
		}
		
	}

	public static void main(String[] args) {
		new Output01();
	}
}



