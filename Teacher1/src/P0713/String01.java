package P0713;
public class String01 {
	public static void main(String[] args) {
		//	프로그램 시작하기 전에 메모리 상태를 알아보자.
		//	이때 사용하는 클래스는 Runtime 클래스인데....
		//	new를 시킬 수 없다.
		//	고로 공장함수를 찾아서 만들자.
		Runtime	run = Runtime.getRuntime();
		long	size = run.freeMemory();
		System.out.println("시작전 = " + size);
				
		//	이제 String 클래스의 데이터를 1000번 변경해보자.
		//	결론적으로 말해서 1000번 변경하면 1000번 메모리 할당이
		//	일어나고 이전에 데이터는 Heap 영역이므로 계속 유지하고
		//	있다.
//		String	temp = "시작";
//		for(int i = 0; i < 100000; i++) {
//			temp = temp + "이기자";
//		}
		
		StringBuffer	temp = new StringBuffer("시작");
		for(int i = 0; i < 10000; i++) {
			temp = temp.append("이기자");
		}
		//	이제 1000번 변화를 일으킨 후 메모리 상태를 다시 점검하자.
		size = run.freeMemory();
		System.out.println("종료후 = " + size);
		
	}
}




