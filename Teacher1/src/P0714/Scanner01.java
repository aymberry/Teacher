package P0714;
/*
 * 	지금 만든 파일의 내용을 Scanner로 읽어서 출력하자.
 */
import		java.util.*;
import		java.io.*;
public class Scanner01 {

	public static void main(String[] args) {
		File		file = new File("D:\\아무이름.txt");
		Scanner	sc = null;
		try { 
			sc = new Scanner(file);
			String	msg = sc.nextLine();
			System.out.println(msg);
		}
		catch(Exception e) {
			
		}
	
		

	}

}
