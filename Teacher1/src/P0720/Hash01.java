package P0720;
/*
 * 	기본적인 Map 사용법
 */
import		java.util.*;
public class Hash01 {
	public static void main(String[] args) {
		HashMap	map = new HashMap();
		
		map.put("이름", "홍길동");
		map.put("나이", 18);
		map.put("전번", "010-7777-8888");
		//		..	데이터를 그 데이터를 구분할 수 있는 키값과
		//			한쌍으로 입력을 해야 한다.
		
		//	나는 나이가 필요하면
		int		nai = (int) map.get("나이");
		System.out.println(nai);
	}
}
