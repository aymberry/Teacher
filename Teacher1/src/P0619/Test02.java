package P0619;
/*
 * 	문제
 * 		학생의 점수를 입력한 후 학점을 판정하는 프로그램을
 * 		switch를 이용해서 작성하세요.
 */
public class Test02 {
	public static void main(String[] args) {
		int		score = (int) (Math.random() * (100 - 0 + 1) + 0);
		//		(int)  형변환을 시키는 이유?
		//			Math.random()	의 결과는 
		//			0.0 <= ? < 1.0 의 사이값이 double 로 탄생한다.
		//			고로 이곳에 연산을 하면 그 결과도 double 이 된다.
		
		String	grade;		//	학점을 기억할 변수
		switch(score / 10) {
		case 10:
		case	9:
			grade = "A 학점";
			break;
		case	8:
			grade = "B 학점";
			break;
		case	7:
			grade = "C 학점";
			break;
		case	6:
			grade = "D 학점";
			break;
		default:
			grade = "F 학점";
		}
		
		System.out.println(score + " 는 " + grade);
	}
}





