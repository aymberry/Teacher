package P0704;
//	문제 
//		10개의 배열에 데이터를 입력하는 함수를 제작하세요
public class Test09 {
	
	static int[] Input1() {
		//	내가 메모리를 만들어서 그 메모리에 데이터를 채워서 줄께
		
		//		메모리 만들고
		int[]	temp = new int[10];
		//		내용 채워서
		for(int i = 0; i < 10; i++) {
			temp[i] = (int)(Math.random() * 100);
		}
		//	결과 알려줄께
		return temp;
	}
	static void Input2(int[] temp) {
		//	니가 메모리 만들어주면 그 메모리에 데이터를 채워서 줄께
		for(int i = 0; i < 10; i++) {
			temp[i] = (int)(Math.random() * 100);
		}
	}
	public static void main(String[] args) {
//		int[]	num = Input1();
//		for(int i = 0; i < 10; i++) {
//			System.out.println(num[i]);
//		}

		int[]	num = new int[10];
		Input2(num);
		for(int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
	}

}
