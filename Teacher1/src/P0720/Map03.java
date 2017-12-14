package P0720;
/*
 * 	Map은 키값을 가지고 정렬하게 된다.
 *	
 *	만약 데이터를 이용해서 정렬해야할 필요가 있으면?
 *
 *	원리		Collections.sort()를 이용해서 처리하면 된다.
 *
 *		하지만 이 함수는 Map 를 사용할 수 없기 때문에...	
 *		List 로 변환해야 하는데.....
 *		Map은 List로 바꿀 수 없다.
 *
 *		결론		Map -> Set -> List로 바꾸어서 사용해야 한다.
 *	
 *	문제
 *		친구이름 5사람을 입력하고 이름 순서대로 정렬해서 출력하라.
 *
 */
import		java.util.*;
public class Map03 {
	public static void main(String[] args) {
		TreeMap	map = new TreeMap();
		map.put("친구", "송혜교");
		map.put("웬수", "송중기");
		map.put("동기", "김혜수");
		map.put("여친", "한혜진");
		map.put("남친", "송승헌");
		//	현재 상태 보기
//		Set		set = map.entrySet();
//		Iterator	iter = set.iterator();
//		while(iter.hasNext()) {
//			Map.Entry temp = (Map.Entry) iter.next();
//			String		key = (String) temp.getKey();
//			String		data = (String) temp.getValue();
//			
//			System.out.println(key + " : " + data);
//		}
		
		//	데이터를 이용해서 정렬하고자 하면 List로 변환해야 한다.
		//	직접 변환이 안되므로... Set를 거쳐서 List로 바꾸어야 한다.
		Set		set = map.entrySet();
		//	set에는 Map.Entry가 데이터로 들어간다.
		ArrayList	list = new ArrayList(set);
		//	이 안에는 Map.Entry라는 클래스로 묶은 데이터가 저장된다.
		//	이것을 정렬하려면....
		Collections.sort(list, new MySort03());
		//	문제는	list 안에 있는 데이터는 Map.Entry라는 클래스이고
		//	이 안에는 2개의 데이터가 묶여있다.
		//	그러므로 소트가 되지 않는다?
		//	왜?		둘중 무엇을 이용해서 소트할지 모르므로....
		//			결론		정렬기준을 정하는 클래스를 만들어서 사용해라.
		
		for(int i = 0; i < list.size(); i++) {
			Map.Entry temp = (Map.Entry) list.get(i);
			String	key = (String) temp.getKey();
			String	data = (String) temp.getValue();
			
			System.out.println(key + " : " + data);
		}
	}
}
//	둘중 무엇을 이용해서 정렬할지 모르므로 정렬 기준을 정해야 한다.
class MySort03 implements Comparator {
	public int	compare(Object o1, Object o2) {
		//		o1과 o2에는 비교 대상(List의 데이터)가 들어온다.
		//		우리가 사용하는 List에는 Map.Entry 클래스가 기억되어 있다.
		Map.Entry	temp1 = (Map.Entry) o1;
		Map.Entry	temp2 = (Map.Entry) o2;
		
		String		data1 = (String) temp1.getValue();
		String		data2 = (String) temp2.getValue();
		
		int		result = data1.compareTo(data2);
		
		
		
		return result;
	}
}










