package P0720;
/*
 * 	알파벳 문자 A~J까지를 랜덤하게 100번 발생한 후
 * 	각각의 문자가 몇번 나왔는지를 알아보자.
 * 
 * 	원리
 * 		map.put("A", 10)		의 방식으로 저장할 예정이다.
 * 		즉,
 * 			키값을 발생한 문자로 하고, 데이터는 발생 회수를 저장하도록 한다.
 */
import		java.util.*;
public class Map01 {
	public static void main(String[] args) {
		TreeMap	map = new TreeMap();
		//	알파벳 문자를 100번 반복하면서 발생하자.
		for(int i = 0; i < 100; i++) {
			char	ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			//	발생한 문자의 회수를 map에 저장하면 된다.
			//	문제....
			if(map.containsKey(ch)) {
				//		이미 발생한 문자는 그 문자의 발생 회수가 저장되어 있고
				//		발생회수가 이미 저장되어 있으므로
				//		지금 발생을 다시 했으므로 1을 증가시켜야 한다.
				//	1.	먼저 현재 발생 회수를 알아낸다.
				int		count = (int) map.get(ch);
				//	2.	회수를 1 증가한다.
				count++;
				//	3.	다시 저장한다.
				map.put(ch, count);
				//	여기서 중요사항
				//		다시 저장하면 먼저 저장된 같은 키값의 데이터는
				//		삭제된다.
			}
			else {
				//		만약 지금 발생한 문자가 처음이라면... 아직 map에 
				//		저장되어 있지 않을 것이다.
				map.put(ch, 1);
			}
		}
		//	이번에는 A : ??		B : ??의 모양으로 출력하고 싶다.
		//	키값도 필요하고 데이터도 필요하다.
		
		Set		dataSet = map.entrySet();
		Iterator	iter = dataSet.iterator();
		while(iter.hasNext()) {
			Map.Entry	temp = (Map.Entry) iter.next();
			char	key = (char) temp.getKey();
			int		count = (int) temp.getValue();
			
			System.out.println(key + "  :  " + count);
		}
	}
}

