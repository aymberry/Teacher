package P0616;

public class Home03 {
	public static void main(String[] args) {
		int	a = (int) (Math.random() * (100 - 1 + 1) + 1);
		int	b = (int) (Math.random() * (100 - 1 + 1) + 1);
		int	cha;		//	결과를 기억할 변수
		//	큰수에서 작은수를 빼야 하므로 어느수가 큰지 알아보다.
		if(a > b) {
			//	a가 크다고 판정 났으므로....
			//	a에서 b를 빼면 된다.
			
			cha = a - b;
		}	//	a > b 	true
		else {
			//	a > b가 아니오 이므로 b 가 큰 경우이다
			//	그러므로 b에서 a를 빼야 한다.
			
			cha = b - a;
		}	//	a > b	false
		
		System.out.println("발생한 수 = " + a + " 와 " + b);
		System.out.println("두수의 차이 = " + cha);
		
	}	//	main 함수

}	//	class
