package P0727;
/*
 * 	������ ������ ������ ����.
 */
import		java.io.*;
public class Test08 {
	public Test08() {
		//	�ΰ��� Ÿ�� ��Ʈ���� �ʿ��ϴ�.
		//	�Է¿��� ������ ���Ͱ� �����Ƿ�..
		FileReader			fr =  null;
		BufferedReader	br = null;
		//	��¿��� ������ ���Ͱ� �ϳ� �����Ƿ�....
		PrintWriter		pw = null;
		try {
			fr = new FileReader("D:\\��������\\Java\\0704����.txt");
			br = new BufferedReader(fr);
			
			pw = new PrintWriter("D:\\���纻.txt");
			
			//	�а� ���⸦ �ݺ�����.
			while(true) {
				//	���� ���پ� ����
				String line = br.readLine();
				//	������ ������ �Ѵ�.	������ ��������....
				if(line == null) {
					break;
				}
				pw.println(line);
			}
			//	PrintWriter�� Buffer�� ����� ������ �ִ�.
			pw.flush();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				br.close();
				pw.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Test08();
	}
}
