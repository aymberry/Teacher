package P0719;
/*
 * 	�ζǹ�ȣ �߻��⸦ ������.
 * 
 * 		����	Set �迭���� �ߺ� �����͸� ������� �ʴ´�.
 */
import		java.util.*;
public class Lotto01 {

	public static void main(String[] args) {
		TreeSet		set = new TreeSet();
		//	��� �߻��ؾ� �������� �𸣹Ƿ�,......
		while(true) {
			int num = (int)(Math.random() * (45 - 1 + 1) + 1);
			set.add(num);
			//	�ߺ��� �Ǹ� ���� �˾Ƽ� �ɷ�����.
			
			if(set.size() == 6) {
				break;
			}
		}
		
		System.out.println(set);

	}

}



