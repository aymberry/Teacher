package P0711;
/*
 * 	����
 * 		Ư�� ������ �ִ� ������ ��� �߿��� ���ϴ� ���ϸ� ���
 * 		����ϵ��� �϶�.
 */
import		java.io.*;
public class Test07 {
	public static void main(String[] args) {
		File		file = new File("D:\\��������\\oracle");
		
		//	�Լ��� �̿��ؼ� ���ϴ� ����� �����Ѵ�.
		String[]	list = file.list(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				if(name.startsWith("06")) {
					return true;
				}
				else {
					return false;
				}
			}
		});

		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
//	�� �� Ŭ������ ������°�?
//		accept()�� �������̵� �ؾ� �ϱ� ������.....
//		�׷�?
//		�׷��� ���� ���ο� Ŭ������ �ȸ���� �� ���� ������?
//class MyFilter07 implements FilenameFilter {
//	public boolean accept(File dir, String name) {
//		if(name.startsWith("06")) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
