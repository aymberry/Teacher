package P0718;
/*
 * 	비록 컬렉션이 여러종류이 데이터를 한번에 관리할 수 있다는 
 * 	특징을 가지고 있다.
 * 
 * 	하지만 실무에서는 그렇게 하지 않도록 권장한다.
 * 	(즉, 될 수 있으면 같은 형태의 데이터를 관리하도록 한다.)
 * 
 * 	이 작업을 수행하는 기능이 "제너릭"이라는 것이다.
 * 
 * 	이 소스에서는 여러 종류의 데이터를 관리할 문제점을 보여줄 소스이다.
 */
import		java.util.*;
public class Array02 {
	public static void main(String[] args) {
		ArrayList	list = new ArrayList();
		
		list.add(1);
		list.add("Hong");
		list.add(true);
		list.add(3.14F);
		list.add('A');
		
//		for(int i = 0; i < 5; i++) {
			//	아까는 꺼내자 마자 출력을 했다.
			//	하지만 대부분은 꺼낸 결과를 변수등에 기억해서 사용하는것이
			//	일반적이다.
			
//			int		num = (int) list.get(0);
//			String	name = (String) list.get(1);
			//	.....
			//	이것은 무슨 데이터가 있는지 알고 있으니 가능한 경우에다.
			
//		}

		for(int i = 0; i < 5; i++) {
			//	어떤 형태인지 모르므로... Object로 꺼낼 수 밖에 없다.
			Object		o = list.get(i);
			if(o instanceof Integer) {
				int	num = (int) o;
			}
			else if(o instanceof String) {
				String name = (String) o;
			}
			else if(o instanceof Boolean) {
				boolean	is = (boolean) o;
			}
			else if(o instanceof Float) {
				float fl = (float) o;
			}
			else if(o instanceof Character) {
				char	ch = (char) o;
			}
			//	이처럼 꺼낼때 복잡한 절차를 거쳐서 꺼내야 하는
			//	매우 불편한 점이 생긴다.
		}
	}
}









