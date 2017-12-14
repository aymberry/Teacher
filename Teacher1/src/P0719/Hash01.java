package P0719;
import		java.util.*;
public class Hash01 {

	public static void main(String[] args) {
		HashSet	set = new HashSet();
		set.add("홍길동");
		set.add("박아지");
		set.add("장독대");
		set.add("이기자");
		set.add("정말로");
		set.add("홍길동");
		
		//	Set 계열의 데이터는 원하는 데이터를 꺼낼 수 없다.
		//	반드시 순차적으로 나열 시킨 후
		Iterator	iter = set.iterator();
		//	꺼낼때도 순서대로 하나씩 꺼내야 한다.
		
		//	몇번 꺼내야 다 꺼낼지 모르므로.....
		while(iter.hasNext()) {
			//	질문의 의미	아직 데이터가 남았나요?
			//			예			반복하고
			//			아니오		반복을 종료한다.
			String	name = (String) iter.next();
			System.out.println(name);
		}
		//	......
		System.out.println("다시 사용한다.");
		//	레지스터리에 있는 데이터는 한번 사용하면 삭제되므로
		//	만약 재 사용을 원하면........
		//	다시 순서대로 나열시키는 작업부터 다시해야 한다.
		iter = set.iterator();
		while(iter.hasNext()) {
			//	질문의 의미	아직 데이터가 남았나요?
			//			예			반복하고
			//			아니오		반복을 종료한다.
			String	name = (String) iter.next();
			System.out.println(name);
		}
	}

}


