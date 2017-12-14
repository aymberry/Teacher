package P0714;
/*
 * 	문제	하나의 문자열에 3사람의 이름을 한꺼번에 입력한 후
 * 			분리해서 사용하세요.
 */
import		java.util.*;
public class Token01 {
	public static void main(String[] args) {
//		String	names = "홍길동 박아지 장독대";
		//	나는 공백을 중심으로 이름을 나누겠다....
		String names = "www.daum.net:8080/Test/index.txt";
		//	나는 . : / 를 이용해서 데이터를 분리하고 싶다.
		
		StringTokenizer	token = new StringTokenizer(names, ".:/", true);
		//	이사람말 믿어라 이미 분리되어서 레지스터리에 기억되어 있다.
		//	레지스터리를 임시기억장소이므로 자동 삭제된다.
		//	(한번 사용하면 저절로 삭제한다.)
		//	다음에 다시 사용하기 위해서는 주기억장치인 메모리로
		//	옮겨야 한다.
		String[]	name;		//	아직까지 몇개인지 모르므로 배열을 못만든다.
		int	size = token.countTokens();
		//	분리된 개수만큼 배열을 준비한다.
		name = new String[size];
		
		//	이제 하나씩 꺼내자....
		//	꺼내는 작업을 반복해야 할텐데.... 몇번 반복하면 다 꺼낼지 모른다.
		int		pos = 0;	//	배열의 방의 위치를 기억할 변수
		while(token.hasMoreTokens()) {
			//	아직 사용하지 않은 데이터가 남아있으면.... 
			//	계속해서 반복하도록 한다.
			name[pos] = token.nextToken();
			pos++;
		}
		//	참고	이 작업을 split를 이용하면 한번에 끝낸다.
//		name = names.split(" ");

		//	결과를 출력해 보자.
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		
		
	}

}

