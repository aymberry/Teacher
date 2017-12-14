package P0727;
/*
 * 	data.txt�� ����� �����͸� �о �������.
 * 
 * 	Data ������ ������
 * 		�ؽ�Ʈ�� �ƴϹǷ� Ȯ�� �Ұ����ϰ�
 * 		�ݵ�� �о Ȯ���ؾ� �ϸ�			
 * 
 * 		�������� �Է� ������ �����ϰ� �о�� �Ѵ�.
 */
import		java.io.*;
public class Test03 {
	public Test03() {
		//	���� �غ�����. �����͸� ���� ����� �����̴�.
		//	���Ͽ� ����� ��Ʈ���� �غ��ؾ� �Ѵ�.
		FileInputStream		fin = null;
		DataInputStream		din = null;
		try {
			fin = new FileInputStream("D:\\data.txt");
			din = new DataInputStream(fin);
			
			//	�ϳ��� �о �������.
			//		�������� �Է��� ������� �о���Ѵ�.
			String	irum = din.readUTF();
			System.out.println("�̸� : " + irum);
			int		nai = din.readInt();
			System.out.println("���� : " + nai);
			float	sinjang = din.readFloat();
			System.out.println("���� : " + sinjang);
			boolean	sung = din.readBoolean();
			System.out.println("���� : " + sung);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				din.close();
			}
			catch(Exception e){}
		}
		
	}
	public static void main(String[] args) {
		new Test03();
	}
}






