package P0727;
/*
 * 	����
 * 		ģ���� �̸�, ����, Ű, ������ ���Ͽ� ������ ����.
 */
import		java.io.*;
public class Test02 {
	public Test02() {
		//	������ �����͸� �غ��� ����.
		String		name = "ȫ�浿";
		int			age = 24;
		float		height = 187.6F;
		boolean	gender = false;
		
		//	��Ʈ���� �غ�����.
		//	1.	Ÿ��
		FileOutputStream		fout = null;
		//	2.	����
		DataOutputStream	dout = null;
		try {
			//	Ÿ�ٺ��� ���
			fout = new FileOutputStream("D:\\data.txt");
			//	�ʿ��ϸ� ���͸� �����Ѵ�.
			dout = new DataOutputStream(fout);
			
			//	�̰��� Data ������ Ư¡����
			//	����ϴ� �ڹ� �����͸� �״�� byte[] ��ȯ����
			//	����� �� �ִ�.
			dout.writeUTF(name);		//	�̸��� �״�� ��µ� ���̴�.
			dout.writeInt(age);
			dout.writeFloat(height);
			dout.writeBoolean(gender);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				dout.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Test02();
	}
}
