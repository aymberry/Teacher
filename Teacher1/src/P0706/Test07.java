package P0706;

public class Test07 {

	public static void main(String[] args) {
		int[]	num = {1, 2, 3, 4, 5};
		
		System.out.println(num);		//	num에 기억된 것은 주소입니다.
		//	하지만 주소는 출력되지 않고 이상한 다른것이 출력된다.
		//	출력되는 내용은 주소를 관리하는 HashTable를 이용해서
		//	그 주소에 해당하는 HashCode 값이 대신 출력되는 것이다.
		
		
	}

}
