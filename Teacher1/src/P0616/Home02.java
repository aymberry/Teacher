package P0616;

public class Home02 {

	public static void main(String[] args) {
		int	num = (int) (Math.random() * (100 - 1 + 1) + 1);
		
		//	일단 발생한 수가 짝수라고 가정하고 출발하자.
		String	result = "짝수";
		//	근데 홀수일 수 있으므로 한번 물어보자
		if(num % 2 == 1) {
			//	2로 나눈 나머지가 0이면 짝수이므로
			//	2로 나눈 나머지가 1이면 홀수일 것이다.
			
			//	그러면 홀수로 바꿔주자
			result = "홀수";
		}	//	num % 2 == 1		true
		
		System.out.println(num + " 은 " + result + "입니다.");

	}	//	main 함수
}	//	class
