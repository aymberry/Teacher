package P0619;
/*
 * 	����
 * 		�л��� ������ �Է��� �� ������ �����ϴ� ���α׷���
 * 		switch�� �̿��ؼ� �ۼ��ϼ���.
 */
public class Test02 {
	public static void main(String[] args) {
		int		score = (int) (Math.random() * (100 - 0 + 1) + 0);
		//		(int)  ����ȯ�� ��Ű�� ����?
		//			Math.random()	�� ����� 
		//			0.0 <= ? < 1.0 �� ���̰��� double �� ź���Ѵ�.
		//			��� �̰��� ������ �ϸ� �� ����� double �� �ȴ�.
		
		String	grade;		//	������ ����� ����
		switch(score / 10) {
		case 10:
		case	9:
			grade = "A ����";
			break;
		case	8:
			grade = "B ����";
			break;
		case	7:
			grade = "C ����";
			break;
		case	6:
			grade = "D ����";
			break;
		default:
			grade = "F ����";
		}
		
		System.out.println(score + " �� " + grade);
	}
}





