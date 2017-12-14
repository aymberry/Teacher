package P0620;
/*
 * 	50~100사이의 랜덤한 숫자 두개를 발생한 후
 * 	두 수의 최대 공약수를 구하도록 해보자.
 * 
 *  최대 공약수란?		각각의 숫자의 약수 중에서
 *  						공통된 약수의 가장 큰값을 의미한다.
 *
 *  	약수		발생한 수 % 약수 == 0
 *  	예>			10의 약수		2, 5
 *  
 *  원리	약수는 절대로 그 수보다 크지 않는다.
 *  		그러므로 두수의 최대 공약수는 두 수중 작은 수보다 작다는
 *  		보장이 있다.
 *
 *			두 수중 작은수부터 출발해서 1씩 감소하면서
 *			두 수의 약수를 구하면 된다.	
 */
public class Test05 {
	public static void main(String[] args) {
		int		num1 = (int)(Math.random() * (100 - 50 + 1) + 50);
		int		num2 = (int)(Math.random() * (100 - 50 + 1) + 50);
		
		int		start = (num1 < num2) ? num1 : num2;
		
		System.out.println("발생한 수 = " + num1 + "    " + num2);		
		for(int i = start;      ; i--) {
			int		temp1 = num1 % i;
			int		temp2 = num2 % i;
			if(temp1 == 0 && temp2 == 0) {
				System.out.println("공약수 = " + i);
				//	최대 공약수는 한번만 나오므로....
				//	더이상 반복할 필요가 없다.
				break;
			}
		}
	}
}


