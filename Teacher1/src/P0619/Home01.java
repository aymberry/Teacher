package P0619;

public class Home01 {

	public static void main(String[] args) {
		String	kind = "����";		//	���߿� ���, ����.....
		int		sayong = 545;
		int		kum = 0;		//	�������� ����� ����
		
		switch(kind) {
		case	"����":
			kum = 1563 + (sayong * 185);
			break;
		case	"�����":
			kum = 1354 + (sayong * 145);
			break;
		case	"������":
			kum = 1054 + (sayong * 121);
			break;
		case	"������":
			kum = 1285 + (sayong * 136);
			break;
		}
		
		System.out.println("������ = " + kum);

	}

}
