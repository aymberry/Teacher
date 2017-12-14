package P0719;
/*
 * 	로또번호 발생기를 만들어보자.
 * 
 * 		원리	Set 계열에는 중복 데이터를 허락하지 않는다.
 */
import		java.util.*;
public class Lotto01 {

	public static void main(String[] args) {
		TreeSet		set = new TreeSet();
		//	몇번 발생해야 성공할지 모르므로,......
		while(true) {
			int num = (int)(Math.random() * (45 - 1 + 1) + 1);
			set.add(num);
			//	중복이 되면 지가 알아서 걸러낸다.
			
			if(set.size() == 6) {
				break;
			}
		}
		
		System.out.println(set);

	}

}



