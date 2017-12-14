package VO;

public class GuestVO2 {
	public 	int			no;
	public	String		title;
	public	String		body;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	public String getBrbody() {
		if(body == null) {
			return "";
		}
		else {
			return body.replaceAll("\r\n", "<br>");
		}
	}
}
