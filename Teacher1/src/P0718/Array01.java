package P0718;
import		java.util.*;
/*
 * 	5개의 정보를 ArrayList에 넣고 꺼내서 출력해보자.
 */
public class Array01 {
	public static void main(String[] args) {
		ArrayList	list = new ArrayList();
		//	배열의 공간이 10개인 배열이 생긴다.
		
		//	이제 ArrayList에 필요한 데이터를 입력하자.
		list.add(1);
		list.add("Hong");
		list.add(true);
		list.add(Calendar.getInstance());
		list.add(3.14F);
		
		list.add(3, "박아지");
		//	3번 위치에 박아지를 끼워넣으세요.
		
		//	컬렉션의 특징중 하나가 여러가지 형태의 데이터를
		//	한번에 관리할 수 있다는 사실이다.
		//	왜냐하면 add 함수가 Object를 받도록 했기 때문에.....
		
		//	필요한 데이터를 꺼내보자.
		for(int i = 0; i < 6; i++) {
			System.out.println(list.get(i));
			//	List는 입력한 수선대로 보관되어 있다.
		}
		
		//	원하는 것만 꺼낼 수도 있다.
		String	name = (String) list.get(1);
		//		get()의 반환값은 Object이므로 반드시 원하는
		//		데이터 형으로 형 변환해서 사용하도록 한다.
		System.out.println(name);
	}
}
