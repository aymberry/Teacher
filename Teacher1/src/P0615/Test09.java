package P0615;
/*
 * 	숫자 하나를 입력한 후 짝수인지 홀수인지를 출력하라.
 * 
 * 		컴퓨터는 짝수, 홀수의 개념이 없다.
 * 		방법
 * 			짝수의 특징은 2로 나눈 나머지가 0인 경우이더라
 */
public class Test09 {

	public static void main(String[] args) {
		int		a = 18;		//	나중에 짝수를 입력해서 테스트 한다.
		
		String	result = (a % 2 == 0) ? "짝수" : "홀수";

		System.out.println(result);
	}

}
