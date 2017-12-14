package P0825;

public class TestVO {
	public String name;
	public String title;
	public int		hit;
	//	매우 중요	★★★★
	//	만약 JSTL를 사용해서 처리하고자 하면 
	//	VO 클래스는 반드시 getXXX()를 가지고 있어야 한다.
	//	이 함수가 없으면 JSTL 이용해서는 절대로 사용할 수 없다.
	
	//	GET 함수를 만드는 방법
	//		1.	get으로 시작한다.
	//		2.	함수이름을 쓴다.
	//			이때 첫글자는 대문자로 쓰고 다음부터는 마음대로 쓴다.
	//		3.	JSTL에서 사용할 경우에는
	//			get 을 제외한 나머지 함수 이름을 이용한다.
	//			이 경우에도 첫글자는 소문자로 쓰고 
	//			다음부터는 함수 이름을 그대로 쓴다.
	public String getUserName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	public String getAll() {
		return name + "님이 " + title + "을 썼는데 조회수는 " + hit + "입니다.";
	}

	//	참고 JSTL의 장점
	//	변수를 사용하지 않고 get 함수를 사용함에 있어서 장점
	//		데이터를 가공해서 출력할 수 있다.
	
	public String getUname() {
		return name + "님 말씀";
	}
	
	//	우리가 게시판 목록보기를 만든다고 치고....
	public String getUtitle() {
		if(title.length() > 10) {
			return title.substring(0, 10) + "...";
		}
		else {
			return title;
		}
	}
	
	//		이름(name)을 출력할 때....
	//		첫글자만 출력하고 나머지 글자는 **로 감추어서 출력하고 싶다면...
	public String getHname() {
		String	first = name.substring(0, 1);
		String	last = name.substring(1);
		String	temp = "";
		for(int i = 0; i < last.length(); i++) {
			temp = temp + "*";
		}
		
		return first + temp;
		
	}

	
	
}


