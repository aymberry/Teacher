package P0627;
/*
 * 	�ҹ��ڸ� ������� ����ϼ���.
 */
public class Sam02 {

	public static void main(String[] args) {
		char ch = 'a';
		
		//	26�� �ݺ��ϴ� ����
		for(int i = 1; i <= 26; i++) {
//			System.out.println(ch);
//			ch++;
			//	ch ������ 0, 1, 2, 3, 4�� ���ϸ� ���ϴ� ����� ������ ������?
			//	i ������ 1, 2, 3, 4...�� ���ϴ���?
			System.out.println((char)(ch + (i - 1)));
		}

	}

}



