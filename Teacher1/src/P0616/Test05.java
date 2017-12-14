package P0616;
/*
 * 	문제
 * 		0점~100점사이의 성적을 랜덤하게 입력한 후
 * 		이 점수의 학점을 평가하세요
 * 
 * 			90점이상		A
 * 			80~89			B
 * 			70~79			C
 * 			60~69			D
 * 			0~59			F
 */
public class Test05 {

	public static void main(String[] args) {
		int		score = (int) (Math.random() * (100 - 0 + 1) + 0);
		String	grade;		//	등급을 기억할 변수
		
		if(score >= 90) {
			grade = "A학점";
		}
		//	원래 B학점은
		//	score >= 80 && score < 90	 로 질문해야 한다.
		//	하지만 아래의 조건식이 성립하는 이유는?
		//	위의 if에서 90점이상이면 이 문장을 실행하지 않으므로...
		//	이 문장을 실행하는 경우는 90 이상이 아니라는 명백한 조건이 있다.
		else if(score >= 80) {
			grade = "B학점";
		}
		else if(score >= 70) {
			grade = "C학점";
		}
		else if(score >= 60) {
			grade = "D학점";
		}
		else {
			grade = "F학점";
		}

		System.out.println(score + " 점은 " + grade);
	}
}
