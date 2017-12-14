package P0726;
/*
 * 	����	Ű���带 �̿��ؼ� �����͸� �Է¹��� �� ����غ���.
 */
import		java.io.*;
import		java.util.*;
public class Input01 {
	public Input01() {
		try {
			FileInputStream fin = new FileInputStream("src/P0726/test.txt");
			
			//	1.	�� ����(byte)�� �Է� �޴� ���
//			char	ch = (char) System.in.read();
//			System.out.println("����� �Է��� ���� = " + ch);
			
			//	2.	���� ���ڸ� ���ÿ� �Է� �޴� ���
			//	���
			//		1.	�Է¹��� �����͸� ����� �迭 ������ �غ��Ѵ�.
			//		2.	int read(byte[] buff)�� �̿��ؼ� �����͸� �Է� �޴´�.
			//			�Լ��� �ǹ�
			//				byte[]�� �ǹ̴� �Է¹��� �����͸� ����� ��Ҹ�
			//				�����Ѵ�.
			//				��ȯ���� �ǹ̴� ���� �Է¹��� �������� ũ��(byte ��)
			//				�� �˷��ش�.
			
//			byte[]	buff = new byte[256];
			//	256�� �ǹ̴� �ѹ��� �Է� ������ �ִ� ����Ʈ���� �����Ѵ�.
			//	���	�ý����� ����̳� ���α׷��� Ư¡�� ����
			//			�ִ� �Է� ������ ũ�⸦ �����ؼ� ����ϸ� �ȴ�.
//			int	len = System.in.read(buff);
			
			//	�Է¹��� �����͸� �������� ����ϰ� �ʹ�.
			//	�׷��� String���� ����ϴ� ���� ���ڴ�.
//			String str = new String(buff, 0, len);	
			//	��� ����� �̻��ϰ� ������ ����?
			//		new String(buff);�� �ǹ̴� byte[]�� ��� �����͸�
			//		���ڷ� ��ȯ�϶�� �ǹ��̴�.
			//		�迭�� Heap ������ ��������Ƿ�
			//		�Էµ��� ���� ��ҿ��� �ڵ� �ʱ�ȭ�� �Ǿ����Ƿ� 0��
			//		�Էµ� �����̴�.
			//		�׷��� ����� �̻��ϰ� ���°��̴�.
			
			
//			System.out.println("�Է� ����Ʈ �� = " + len);
//			System.out.println("�Է� ������ = " + str);

			//	3.	���� ���ڸ� ���ÿ� �Է��ϴ� ���
			//		(�Է� ��Ҹ� �����ϸ鼭 �Է��ϴ� ���)
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte)'A');
			//	�迭�� A��� ���ڷ� ä�켼��.
			int	len = fin.read(buff, 10, 50);
			//	�Ķ���� ����
			//	1.	�Է¹��� �����͸� ����� ����
			//	2.	�Է¹��� �������� ���� �Է� ���� ���� ��ġ
			//	3.	�Է¹��� �ִ� ũ��
			//	��ȯ�� ����
			//		������ �Է� ���� ������ ũ��
			
			//	�������� ����ϱ� ���ؼ�.....
			String str = new String(buff, 0, len + 10);
			System.out.println(str);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		new Input01();
	}
}
