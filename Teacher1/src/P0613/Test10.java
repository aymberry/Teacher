package P0613;
/*
 * 	문제
 * 		가로와 세로 길이를 알려주면 사각형의 면적을 구하는 프로그램을
 * 		작성하세요.
 */
public class Test10 {
	public static void main(String[] args) {
		//	할일
		//		알고있는 데이터를 기억할 준비를 한다.
		int	garo = 10;
		int	sero = 20;
		//		결과를 기억할 변수를 준비한다.
		int	area;
		//		필요한 계산을 수행한다.
		area = garo * sero;
		//		참고	변수를 이용하는 이유가 바로 여기에 있다.
		//				10혹은 20이라는 데이터를 다시 사용하기 위해서는
		//				리터럴 풀에 있는 데이터를 반드시 스택에
		//				복사해 놓아야 한다.
		
		//	결과를 출력한다.
		System.out.println(area);
	}
}




