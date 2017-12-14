package P0720;
/*
 * 	5가지 종류의 데이터를 입력한 후 키값을 찾아서 
 * 	데이터를 찾아보자
 */
import		java.util.*;
public class Hash02 {
	public static void main(String[] args) {
		HashMap	map = new HashMap();
		map.put("이름", "박아지");
		map.put("나이", "24");
		map.put("전화번호", "010-5555-6666");
		map.put("메일주소", "nasundol@daum.net");
		map.put("집주소", "서울시 종로구 신영동");
		
		//	1.	키값만 따로 모아서 Set으로 만들자.
		Set		keySet = map.keySet();
		//		keySet.add("이름");
		//		keySet.add("나이");
		//		keySet.add("전화번호");
		//		keySet.add("메일주소");
		//		keySet.add("집주소");
		
		//	2.	Set은 꺼낼 수 없으므로... Iterator로 만들어서 꺼내야 한다.
		Iterator	iter = keySet.iterator();
		while(iter.hasNext()) {
			//	Set에 키값이 저장되어 있으므로...
			//	하나씩 키값을 알아낸다.
			String key = (String) iter.next();
			//	알아낸 키값을 이용해서 데이터를 다시 꺼낸다.
			String	data = (String) map.get(key);
			System.out.println(key + "     " + data);
		}
	}
}


