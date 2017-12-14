package P0628;
/*
 * 	10개의 배열에 데이터를 랜덤하게 입력하고
 * 	이 데이터를 정렬해서 출력하는 프로그램을 작성하세요
 * 
 * 	단,		입력, 정렬, 출력은 함수로 만들어서 처리하세요
 * 			입력은 한번에 데이터 한개씩만 입력 받도록 하세요.
 * 			
 */
public class Test04 {

	static int Input() {
		//	이번에는 한번에 한개씩만 입력해야 하므로
		//	한개의 랜덤한 숫자를 발생해서 알려주면 될 것이다.
		int	temp = (int)(Math.random() * (100 - 0 + 1) + 0);
		return temp;
	}
	
	static void Sort(int[] a) {
		//	정렬을 하는 경우에는 당연히 10개의 데이터를 다 알고 있어야
		//	정렬을 할 수 있다.
		//	어떻게 하면 10개의 데이터를 동시에 알 수 있나요?
		//	주소를 받으면 데이터 공간을 이용할 수 있겠구나....
		
		//	주소를 받았으므로 이 함수가 데이터를 변경하면
		//	main에서도 변경된 데이터를 사용할 수 있다.
		//	그로므로 이미 변경된 결과를 사용가능하기 때문에
		//	굳이 결과값을 따로 알려줄 필요가 없다.
		
		for(int i = 0; i< 9; i++) {
			for(int j = i + 1; j < 10; j++) {
				if(a[i] > a[j]) {
					int	temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	static void Display(int[] a) {
		//	출력은 10개의 데이터를 모두 출력할 예정이다.
		//	10개의 데이터를 한번에 받는 방법을 간구하자.
		//	주소를 받으면 되겠구나
		for(int i = 0; i < 10; i++) {
			System.out.print(a[i] + "   ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] num = new int[10];
		//	이번 함수는 한번에 한개씩만 알려줌으로....
		//	10개의 데이터를 입력받기 위해서는 10번 반복해야 한다.
		for(int i = 0; i < 10; i++) {
			num[i] = Input();
		}
		Sort(num);
		Display(num);
	}
}
