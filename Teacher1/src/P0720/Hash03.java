package P0720;
/*
 * 	Map 에 데이터를 5개 입력한 후 entrySet을 이용해서 데이터를
 * 	꺼내보자.
 */
import		java.util.*;
public class Hash03 {
	public static void main(String[] args) {
		HashMap	map = new HashMap();
		map.put("이름", "박아지");
		map.put("나이", "24");
		map.put("전화번호", "010-5555-6666");
		map.put("메일주소", "nasundol@daum.net");
		map.put("집주소", "서울시 종로구 신영동");

		Set		dataSet = map.entrySet();
		//	이 안에는
		//		dataSet.add(new Map.Entry("이름", "박아지"));
		//		dataSet.add(new Map.Entry("나이", "24"));
		//		dataSet.add(new Map.Entry("전화번호", "???"));
		//		dataSet.add(new Map.Entry("메일주소", "???"));
		//		dataSet.add(new Map.Entry("집주소", "???"));
		
		//	Set은 직접 꺼낼 수 없으므로...
		Iterator iter = dataSet.iterator();
		while(iter.hasNext()) {
			//	남은 데이터 꺼내주세여.
			Map.Entry	temp = (Map.Entry) iter.next();
			//	이 클래스 안에는 key, data가 한쌍으로 기억되어 있으므로,,,
			//	키값
			String	key = (String) temp.getKey();
			String	data = (String) temp.getValue();
			
			System.out.println(key + "   :   " + data);
		}
		
		
		
		
	}

}



