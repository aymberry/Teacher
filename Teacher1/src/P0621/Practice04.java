package P0621;
/*
 * 3~100 �� �ڼ��� ��� ����϶�
 */
public class Practice04 {

	public static void main(String[] args) {
		System.out.print("3~100�� �Ҽ��� 3");
		
		for(int i = 4 ; i <= 100 ; i++) {

			for (int j = 2 ; j <= i ; j++) {
				if(i==j) {					//  ƨ�� ���� ������ ���������� �Ҽ�
					System.out.print(", "+i); 
				}
				
				if (i%j==0) break;	//	���������� �Ҽ�
			}
		}
	}
}
