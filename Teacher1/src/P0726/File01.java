package P0726;
import		java.io.*;
/*
 * 	Ư�� ������ File�� ���� �� �� ������ ���� ����� �˾Ƴ���.
 */
public class File01 {
	public File01() {
		File		file = new File("D:\\��������\\Java");
		//	��Ÿ�� ���� ��������Ƿ� �����Ҳ�
//		String[]	list = file.list();
		
//		for(int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		
		File[]	list = file.listFiles();
		for(int i = 0; i < list.length; i++) {
			String	name = list[i].getName();
			long	size = list[i].length();
			
			System.out.println(name + " : " + size);
			
		}
	
		/*
		 * file.list();, file.listFiles();�� ������
		 * 
		 * 
		 * 		file.list()�� ������ �̸��� �ʿ��� �� ����ϴ� ����̴�.
		 * 
		 * 		file.listFiles()�� ������ ������ �ʿ��� �� ����ϴ� ����̴�.
		 */
		
		
	}

	public static void main(String[] args) {
		new File01();
	}
}
