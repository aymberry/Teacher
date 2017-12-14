package P0710;
/*
 * 	����
 * 		�� ��ǻ���� Ư�� ������ �ִ� ������ ����� ����غ���.
 * 
 * 		�̶� Ư�� ���ϸ� ����ϵ��� �غ���(�� : Ȯ���ڰ� txt �� ���ϸ�)
 * 
 * 		����	JVM���� �߰��� ������ ����� ���� ���ϴ� ��������
 * 				�˻��ϵ��� ��Ź�ϸ� �ȴ�.
 * 
 * 				�˻�� ����̹Ƿ� �翬�� �Լ��� �־ �� �ȿ���
 * 				�˻縦 �ؾ��Ѵ�.
 * 				==>		�� �˻縦 ����ϴ� �Լ���	accept() �̴�.
 * 						�˻縦 ����ϴ� �Լ��� �̹� �������ִ�.
 * 
 * 				�ٵ�..	���� ���ϴ� ������ ����������?	����� ���̴�.
 */

import		java.io.*;
public class Test02 {
	public static void main(String[] args) {
		File		file = new File("D:\\��������\\Java");
		
		String[]	list = file.list(new MyFilter());
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
//	�ڵ� ȣ���Լ��� ���� �������̽��� �̿��غ���.
class MyFilter implements FilenameFilter {
	public boolean accept(File dir, String name) {
		//	�� �Լ��� ������ �ϳ��� ã�������� �� �Լ�����
		//	�˻��� �޶�� JVM�� ȣ���ϴ� �Լ��̴�.
		//	�̶� ã�� ������ �̸��� �Ű������� String name��
		//	�˷��ش�.
		
		if(name.endsWith("txt")) {
			return true;
		}
		else {
			return false;
		}
	}
}
















