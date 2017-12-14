package P0720;
/*
 * 		컬렉션 안에는 무슨 데이터든지 기억할 수 있다.
 * 		
 * 		그러므로 컬렉션 안에 다시 컬렉션을 기억할 수도 있다.
 * 
 * 		예>		ArrayList	list = new ArrayList();
 * 				....
 * 
 * 				HashSet	set = new HashSet();
 * 				set.add(list);
 * 
 * 		이 이론을 응용하는 예로써
 * 		전화번호 관리 프로그램을 만들어보자.
 * 		단		전화번호 관리를 할때 그룹 관리를 가능하도록 하자.
 */
import		java.util.*;
public class Map02 {
	//	지금부터 몇개의 함수를 만들 예정이다.
	//	모든 함수에서 공통으로 사용할 수 있는 변수를 준비한다.
	static	HashMap	map = new HashMap();
	//	몇개의 함수를 만들어보자.
	//		필요한 그룹을 만들어 주는 함수
	static void makeGroup(String groupName) {
		//	먼저 같은 이름의 그룹이 존재하는지 확인하고
		//	없으면 만들고 있으면 만들지 마세요.
//		if(map.containsKey(groupName)) {
//			//	만들지 마세요		할 행동이 없고
//		}
//		else {
//			//	만드세요
//			map.put(groupName, new HashMap());
//		}
		if(! map.containsKey(groupName)) {
			map.put(groupName, new HashMap());
		}
	}
	//		친구를 등록하는 함수
	static void insertFriend(String group, String name, String tel) {
		//	사용자 편의를 위해서.....
		//	사용자가 미처 그룹을 못만들고 친구등록를 할 경우를 대비해서...
		//	먼저 그룹을 만들도록 유도하자.
		makeGroup(group);
		
		//	원리
		//		친구를 등록할 그룹이 사용하는 Map을 꺼낸다.
		HashMap	groupMap = (HashMap) map.get(group);
		//		꺼낸 Map에 친구를 추가하면 된다.
		groupMap.put(name, tel);
	}
	//		그룹을 알려주면 그 그룹의 친구 전체를 출력할 함수
	static void displayGroup(String group) {
		//	원리
		//		꺼낼 그룹이 사용하는 Map을 꺼낸다.
		HashMap	groupMap = (HashMap) map.get(group);
		
		//	이제 이 함수는 이 그룹의 모든데이터를 꺼내기 원하므로...
		Set		set = groupMap.entrySet();
		Iterator	iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry temp = (Map.Entry) iter.next();
			String	name = (String) temp.getKey();
			String tel = (String) temp.getValue();
			System.out.println(name + " : " + tel);
		}
	}

	//		전체를 다 출력하는 함수
	//		힌트
	//			그룹을 알아내는 Map(전체)을 이용해서 반복하면서
	//				각각의 그룹이 사용하는 Map을 하나씩 꺼내고
	//			다시 각각의 그룹이 사용하는 Map을 반복해소
	///			데이터를 꺼낸다.(위의 함수)

	//		그룹과 친구이름을 알려주면 그 친구의 전화번호를 출력하는 함수
	//			1.	그룹이 사용할 Map을 꺼내고
	//			2.	그 Map 안에서 그 사람의 전화번호를 꺼낸다.
	public static void getFriend(String group, String name) {
		//	할일
		//	1.	그 그룹의 Map을 꺼낸다.
		HashMap	groupMap = (HashMap)map.get(group);
		//	2.	그  Map에서 친구 전화번호를 꺼낸다.
		String tel = (String) groupMap.get(name);
		System.out.println(tel);
	}
	 
	
	
	
	public static void main(String[] args) {
		//	5사람만 입력해보자.
		insertFriend("친구", "홍길동", "010-1111-2222");
		insertFriend("동기", "박아지", "010-2222-2222");
		insertFriend("친구", "장독대", "010-3333-2222");
		insertFriend("친구", "이기자", "010-4444-2222");
		insertFriend("동기", "김치국", "010-5555-2222");
		
		//	나는 친구를 꺼내고 싶다.
//		displayGroup("동기");
		getFriend("동기", "박아지");
	}
}
