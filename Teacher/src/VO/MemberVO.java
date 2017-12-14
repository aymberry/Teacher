package VO;
/*
 * 	데이터만 기억하기 위해서 만들어 놓은 클래스
 * 
 * 	원칙은 필요한 정보를 기억할 변수만 만들어주면 된다.
 */
public class MemberVO {
	//	나는 일부러 private로 변수를 만들었다.
	//	변수는 정보를 기억하는 중요한 역활을 하므로 일반적으로는
	//	노출시키지 않도록 한다.
	//	다른 사용자가 직접 변수에 데이터를 입력하지 못하도록 방지한다.
	//	이런 작업			"은닉화" 한다 라고 표현한다.
	private	String		id;
	private	String		pw;
	private	String		nick;
	//	대신 함수를 이용해서 데이터를 조작할 수 있는 문을 만들어 줌으로
	//	사용자는 변수에 직접 입력하는 대신에 함수를 이용해서
	//	입력(사용)하도록 조치를 해주어야 한다.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
//	public void setId(String temp) {
		//	이 부분에서 뭔가를 처리할 수 있으므로
		//	데이터의 오류를 검사할 수 있기 때문이다.
//		this.id = temp;
//	}
//	public String getId() {
//		return this.id;
//	}

	
	
}



