package Test;

public class Test06 {
	public static void main(String[] args) {
		String	city = "����";
		String	contury = "";
		switch(city) {
		case "����":			//	city = "����"
			//	���೻���� �����Ƿ� ������ �ٽ� ����
		case "�λ�":			//	city = "����" || city = "�λ�"
			contury = "�ѱ�";
								//	break�� ����.
		case "�ϰ�":			//	�� �κе� �����Ѵ�.
								//	city = "����" || city = "�λ�" || city = "�ϰ�
			contury = "�߱�";
								//	break�� ����.
		case "����":			//	�� �κе� �ٽ� �����ϰ�
								//	city = "����" || city = "�λ�" || city = "�ϰ� || city = "����"
			contury = "�Ϻ�";
			break;
		default:
			contury = "������";
		}

	}

}
