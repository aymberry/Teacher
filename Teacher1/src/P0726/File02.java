package P0726;
/*
 * 	����
 * 		���� Ư�� ������ �ִ� ���� �߿��� Ȯ���ڰ� txt �ΰ͸�
 * 		��� ����ϵ��� ����.
 */
import		java.io.*;
public class File02 {

	public File02() {
		File		file = new File("D:\\��������\\Java");
		
//		String[] list = file.list(new MyFilter02());
		
//		for(int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		
		File[] list = file.listFiles(new YouFilter02());
		for(int i = 0; i < list.length; i++) {
			String name = list[i].getName();
			long	size = list[i].length();
			
			System.out.println(name + " : " + size);
		}
	}

	public static void main(String[] args) {
		new File02();
	}
}

class MyFilter02 implements FilenameFilter {
	public boolean accept(File dir, String name) {
		//	�������̽��� �Լ��� ���� ��� �ڵ� ȣ���Լ��̴�.
		//	ȣ��Ǵ� ����
		//		list�� ���ؼ� Ư�� ������ ����� �ϳ��� ��Ÿ��������
		//		�����̵ȴ�.
		
		//	�Ķ����
		//		dir		ã�� ������ ���Ե� ������ ����
		//		name	ã�� ������ ���� �̸�
		
		//	���
		//		JVM�� �˷��� ������ ��Ͽ� ���Խ�Ű�� ������
		//			true�� ��ȯ�ϰ�
		//		JVM�� �˷��� ������ ��Ͽ��� ���� ������
		//			false�� ��ȯ�ϸ� �ȴ�.
		
		if(name.endsWith("txt")) {
			return true;
		}
		else {
			return false;
		}
	}
}

class YouFilter02 implements FileFilter {
	public boolean accept(File pathname) {
		//	������ �����ϴ�.
		//		���⼭�� ������ �̸��� 07�� �����ϸ鼭
		//		Ȯ���ڰ� .txt�ΰ͸� �����.
		
		String	name = pathname.getName();
		if(name.startsWith("07") && name.endsWith("txt")) {
			return true;
		}
		else {
			return false;
		}
		
	}
}










