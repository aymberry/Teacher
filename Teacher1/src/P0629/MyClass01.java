package P0629;
/*
 * 	이것은 내가 다른 사람을 위해서 하나의 기능을 개발해서 제공하기 위한
 * 	프로그램 설계도이다.
 */
public class MyClass01 {
	//	내가 원하는 기능을 수행하기 위해서 필요한 데이터를 기억할
	//	공간을 만들자.
	
	int		num;
	float	avg;
	int[]	score = new int[10];
	
	//	내가 원하는 기능을 수행하기 위한 함수를 만들자.
	//	이 기능을 수행하기 위해서는 데이터를 받아야 한다.
	void input() {
		num = 100;	//	num 변수에 100을 기억해라.
	}
	//	이 기능을 수행하기 위해서는 계산을 해야 한다.
	int	calc(int a) {
		//	...
		return 5;
	}
	void display() {
		System.out.println("num = " + num);
	}
}








