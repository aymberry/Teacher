package P0616;
/*
 * 	문제
 * 		3개의 숫자를 랜덤하게 발생한 후
 * 		크기 순서대로 출력하세요.
 */
public class Test08 {
	public static void main(String[] args) {
		int	num1 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int	num2 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int	num3 = (int)(Math.random() * (100 - 1 + 1) + 1);
		
		int	max, cen, min;		//	크기 순서대로 기억할 변수 
		
		//	1과 2의 관계를 먼저 알아보자.
		if(num1 > num2) {
			//	1이 2보다 큰 경우
			//	이번에는 1과 3의 관계를 알아보자.
			if(num1 > num3) {
				//	1이 3보다 큰 경우
				//	1이 가장 큰것은 확실한데....
				max = num1;
				//	2와 3의 관계는 모른다.
				//	두 관계를 알아보자.
				if(num2 > num3) {
					cen = num2;
					min = num3;
				}
				else {
					cen = num3;
					min = num2;
				}
			}
			else {
				//	3이 1보다 큰 경우
				max = num3;
				cen = num1;
				min = num2;
			}
		}
		else {
			//	2가 1보다 큰 경우
			//	숙제 1		아래 부분에 위의 소스 참조해서 완성하세요
			//	힌트 2와 1사이의 관계를 알았으므로...
			//	2와 3사이의 관계를 따지기 시작하면 될 것이다.
			if(num2 > num3) {
				//	2가 3보다 큰 경우이다.
				//	이미 앞에서 2가 1보다 크다고 판정났으므로 2가
				//	가장 큰 값이 된다.
				max = num2;
				//	하지만 아직 1과 3의 관계는 모르므로
				//	다시 질문한다.
				if(num1 > num3) {
					//	1이 3보다 큰 경우이므로 1이 중간, 3이 작은값이 된다.
					cen = num1;
					min = num3;
				}
				else {
					//	3이 1보다 큰 경우이므로 3이 중간, 1이 작은값이 된다.
					cen = num3;
					min = num1;
				}
			}
			else {
				//	이것은 3이 2보다 큰 경우이다.
				//	바깥에서 2가 크다고 판정났는데 그 2보다 3이 더 크므로
				//	3이 제일 큰 값이 된다.
				max = num3;
				cen = num2;
				min = num1;
			}
		}
		
		System.out.println(max);
		System.out.println(cen);
		System.out.println(min);
		
		
		
		
		
		
		
		

	}

}
