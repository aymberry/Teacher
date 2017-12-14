package P0717;
import		java.text.*;
public class Test03 {

	public static void main(String[] args) {
		//	..	뭔가를 작업하다가 최종 결과가 나왔다.
		int	score = 67;
		
		//	이 결과를 원하는 문자열로 변환해서 출력하고 싶다.
		//	1.	변환 기준을 double 배열로 준비한다.
		double[]	s1 = {0, 60, 70, 80, 90};
		//	2.	각가의 변환기준에 의한 변환 데이터를 준비한다.
		String[]	s2 = {"F학점", "D학점", "C학점", "B학점", "A학점"};
		ChoiceFormat	form = new ChoiceFormat(s1, s2);
		
		String	dap = form.format(score);
		System.out.println(dap);
		
	}

}
