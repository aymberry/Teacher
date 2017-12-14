package P0727;
/*
 * 	����
 * 		Ű���带 �̿��ؼ� ������ �����͸� �о ����ϴ� ���α׷�
 * 
 * 		�̶� ��� ������ ����		BufferedReader
 */
import		java.io.*;
public class Test04 {
	public Test04() {
		//	�ʿ��� ��Ʈ�� �غ�
		//	1.	Ÿ��	System.in
		//	2.	����	BufferedReader	
		BufferedReader		br = null;
		try {
			//	��Ʈ���� ũ�Ⱑ �ٸ��Ƿ� ������ �Ұ����ϴ�.
			//	br = new BufferdReader(System.in);
			//	ũ�Ⱑ �ٸ��Ƿ� �߰� ���� ��Ʈ���� �̿��ؾ� �Ѵ�.
			InputStreamReader temp = 
					new InputStreamReader(System.in);
			br = new BufferedReader(temp);
			
			String	data = br.readLine();
			System.out.println("�Է� ���� = " +  data);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				br.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Test04();
	}
}
