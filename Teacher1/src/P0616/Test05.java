package P0616;
/*
 * 	����
 * 		0��~100�������� ������ �����ϰ� �Է��� ��
 * 		�� ������ ������ ���ϼ���
 * 
 * 			90���̻�		A
 * 			80~89			B
 * 			70~79			C
 * 			60~69			D
 * 			0~59			F
 */
public class Test05 {

	public static void main(String[] args) {
		int		score = (int) (Math.random() * (100 - 0 + 1) + 0);
		String	grade;		//	����� ����� ����
		
		if(score >= 90) {
			grade = "A����";
		}
		//	���� B������
		//	score >= 80 && score < 90	 �� �����ؾ� �Ѵ�.
		//	������ �Ʒ��� ���ǽ��� �����ϴ� ������?
		//	���� if���� 90���̻��̸� �� ������ �������� �����Ƿ�...
		//	�� ������ �����ϴ� ���� 90 �̻��� �ƴ϶�� ����� ������ �ִ�.
		else if(score >= 80) {
			grade = "B����";
		}
		else if(score >= 70) {
			grade = "C����";
		}
		else if(score >= 60) {
			grade = "D����";
		}
		else {
			grade = "F����";
		}

		System.out.println(score + " ���� " + grade);
	}
}
