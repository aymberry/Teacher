package VO;

import java.sql.Date;

/*
 * 	VO 클래스는 데이터를 기억할 준비만 해 놓으면 된다.
 * 
 * 	다만 이 VO의 데이터를 JSTL에서 이용하기 위해서는 getXXX()가
 * 	필요하다.
 */
public class ReBoardVO {
	public int			no;
	public	String		writer;
	public String		title;
	public Date		wday;
	public	int			hit;
	public	int			replyCnt;
	public	String		body;
	public	int			oriNo;
	public	int			good;
	public int			bad;
	public	String		kind;		//	베스트인지 아닌지를 기억할 변수
	
	
	
	
	
	public int getOriNo() {
		return oriNo;
	}
	public void setOriNo(int oriNo) {
		this.oriNo = oriNo;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getBad() {
		return bad;
	}
	public void setBad(int bad) {
		this.bad = bad;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	//	JSTL은 변수를 이용하는 것이 아니고 get 함수를 이용해서
	//	처리하게 된다.
	//	get 함수를 이용해서 알려주는 데이터를 변화시키면
	//	변화된 데이터를 이용하게 된다.
	public String getBrBody() {
		return body.replaceAll("\r\n", "<br>");
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getWday() {
		return wday;
	}
	public void setWday(Date wday) {
		this.wday = wday;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getReplyCnt() {
		return replyCnt;
	}
	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}
}




