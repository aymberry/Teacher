package P0621;
/*
 * 	3~100사이의 숫자 중에서 솟수만 구해서 출력하세요.
 */
public class Test09 {

	public static void main(String[] args) {
		dasi:
		for(int num = 3; num <= 100; num++) {
			//	3에서 100까지 반복하면서 그 숫자가 솟수인지 계산한다.
			
			for(int i = 2; i <= num - 1; i++) {
				//	솟수인지 알아보기 위해서는 2~그수-1까지 약수가
				//	나오면 안되므로 하나씩 계산해 본다.
				int	temp = num % i;
				if(temp == 0) {
					//	이 수는 솟수가 아니다.
					//	그러므로 이 안쪽 for 더이상 할 필요가 없고
					//	다음 num을 가지고 계산해 봐야 한다.
					//	즉 다음 num이 계산되도록 제어를 해야한다.
					continue dasi;
				}
			}
			//	아닌데요(continue 당하지 않고) 안쪽 for 가 끝났는데요
			//	continue 당하지 않았다는 말은 한번도 0이 되지 않았다는
			//	말이며 이 말은 곧 그 숫자는 솟수라는 보장이 있다.
			System.out.println(num + " 은 솟수");
		}
	}
}
