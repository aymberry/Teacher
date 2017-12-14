package P0622;

public class Home02 {
	public static void main(String[] args) {
		//	각각의 문자의 발생회수를 기억할 배열을 준비한다.
		int[]	count = new int[10];
		
		//	100번 문자를 발생하도록 한다.
		for(int i = 0; i < 100; i++) {
			char	ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			//	지금 발생한 문자을 파악하여 준비된 배열의 위치에
			//	카운트 시킨다.
			//	반복 규칙		발생한문자 - 65		 위치가 나온다.
			//					'A'(65) - 65		0
			//					'B'(66) - 65		1
			count[ch - 65]++;
		}
		//	이것을 다시 그래프 형태로 출력하라.
		//	모두 10줄을 출력해야 한다.
		for(int i = 0; i < count.length; i++) {
			//	각 줄은 발생한 회수만큼 출력해야 한다.
			for(int j = 0; j < count[i]; j++) {
				System.out.print("#");
			}
			System.out.println("(" + count[i] + ")");
		}
	}
}
