package P0629;
import		java.io.*;
public class Test01 {

	public static void main(String[] args) {
		File		file = new File("D:\\src.zip");
		
		long	size = file.length();
		System.out.println("ũ�� = " + size);

		File		newName = new File("D:\\�ڹټҽ�.zip");
		file.renameTo(newName);
		System.out.println("�̸� ���� ��");
	}

}
