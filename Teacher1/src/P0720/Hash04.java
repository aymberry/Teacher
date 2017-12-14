package P0720;
import		java.util.*;
public class Hash04 {
	public static void main(String[] args) {
		HashMap	map = new HashMap();
		map.put("지은이", "박아지");
		map.put("번역자", "홍길동");
		map.put("나이", "24");
		map.put("전화번호", "010-5555-6666");
		map.put("메일주소", "nasundol@daum.net");
		map.put("집주소", "서울시 종로구 신영동");
		
		//	나는 키값은 모르겠고 데이터만 필요하다면.......
		Collection		col = map.values();

		Iterator	iter = col.iterator();
		while(iter.hasNext()) {
			//	순수하게 데이터만 들어있으므러
			String	data = (String) iter.next();
			
			System.out.println(data);
		}
	}
}


