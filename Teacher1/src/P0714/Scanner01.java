package P0714;
/*
 * 	���� ���� ������ ������ Scanner�� �о �������.
 */
import		java.util.*;
import		java.io.*;
public class Scanner01 {

	public static void main(String[] args) {
		File		file = new File("D:\\�ƹ��̸�.txt");
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
