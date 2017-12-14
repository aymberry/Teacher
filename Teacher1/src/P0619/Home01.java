package P0619;

public class Home01 {

	public static void main(String[] args) {
		String	kind = "개인";		//	나중에 상업, 교육.....
		int		sayong = 545;
		int		kum = 0;		//	전기요금을 기억할 변수
		
		switch(kind) {
		case	"개인":
			kum = 1563 + (sayong * 185);
			break;
		case	"상업용":
			kum = 1354 + (sayong * 145);
			break;
		case	"공업용":
			kum = 1054 + (sayong * 121);
			break;
		case	"교육용":
			kum = 1285 + (sayong * 136);
			break;
		}
		
		System.out.println("전기요금 = " + kum);

	}

}
