package Test;

public class Test06 {
	public static void main(String[] args) {
		String	city = "서울";
		String	contury = "";
		switch(city) {
		case "서울":			//	city = "서울"
			//	실행내용이 없으므로 다음을 다시 질문
		case "부산":			//	city = "서울" || city = "부산"
			contury = "한국";
								//	break가 없다.
		case "북경":			//	이 부분도 실행한다.
								//	city = "서울" || city = "부산" || city = "북경
			contury = "중국";
								//	break가 없다.
		case "동경":			//	이 부분도 다시 실행하고
								//	city = "서울" || city = "부산" || city = "북경 || city = "동경"
			contury = "일본";
			break;
		default:
			contury = "대상없음";
		}

	}

}
