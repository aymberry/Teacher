package P0721;

import		java.util.*;
public class Test01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//	이처럼 컬렉션을 만들때 그 컬렉션에 기억할 데이터 형태를
		//	지정하는 행위를 제너릭 이라고 한다.

		list.add("홍길동");	//	문자는 허락한다.
//		list.add(10);			//	다른 형태의 데이터이므로 에러가 발생
		list.add("박아지");
		list.add("장독대");
		list.add("김치국");
		list.add("이기자");
		
		int	size = list.size();
		for(int i = 0; i < size; i++) {
//			String name = (String) list.get(i);
			String name = list.get(i);
			//	제너릭 선언이 된 컬렉션을 꺼낼때 형변환하지 않아도 된다.
			System.out.println(name);
		}
	}
}







