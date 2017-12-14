package P0629;
import		java.io.*;
public class Test01 {

	public static void main(String[] args) {
		File		file = new File("D:\\src.zip");
		
		long	size = file.length();
		System.out.println("크기 = " + size);

		File		newName = new File("D:\\자바소스.zip");
		file.renameTo(newName);
		System.out.println("이름 변경 끝");
	}

}
