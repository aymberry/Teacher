package VO;

import java.sql.Date;

/*
 * 	VO Ŭ������ �����͸� ����� �غ� �� ������ �ȴ�.
 * 
 * 	�ٸ� �� VO�� �����͸� JSTL���� �̿��ϱ� ���ؼ��� getXXX()��
 * 	�ʿ��ϴ�.
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
	public	String		kind;		//	����Ʈ���� �ƴ����� ����� ����
	
	
	
	
	
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
	//	JSTL�� ������ �̿��ϴ� ���� �ƴϰ� get �Լ��� �̿��ؼ�
	//	ó���ϰ� �ȴ�.
	//	get �Լ��� �̿��ؼ� �˷��ִ� �����͸� ��ȭ��Ű��
	//	��ȭ�� �����͸� �̿��ϰ� �ȴ�.
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




