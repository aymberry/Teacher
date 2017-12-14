package VO;

import java.sql.Date;
import java.sql.Time;

public class FileBoardVO {
	public	int	no;
	public	String	writer;
	public	String	title;
	public	String body;
	public	Date	wDate;
	public	Time	wTime;
	//	참고
	//	오라클에서 날짜를 꺼낼때 getDate()로 꺼내면.....
	//	이것은 순수하게 날짜만 꺼내라는 명령이다.
	//	(즉, 시간은 나오지 않는다.)
	//	만약 시간까지 작업이 필요하다면 두번 꺼내야 한다.
	//		getDate()		날짜만 나온다
	//		getTime()		시간만 나온다.
	//	결론	두번 꺼내야 하므로 변수도 두개 필요하다. 
	public	int		hit;
	public	int		fileCount;		//	첨부된 파일의 개수
	//	=================	게시물 정보
	//	=================	파일 정보
	public int		fno;
	public	int		oriNo;
	public String	oriName;
	public String	saveName;
	public long	length;
	public String	path;
	
	
	
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public int getOriNo() {
		return oriNo;
	}
	public void setOriNo(int oriNo) {
		this.oriNo = oriNo;
	}
	public String getOriName() {
		return oriName;
	}
	public void setOriName(String oriName) {
		this.oriName = oriName;
	}
	public String getSaveName() {
		return saveName;
	}
	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
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
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getwDate() {
		return wDate;
	}
	public void setwDate(Date wDate) {
		this.wDate = wDate;
	}
	public Time getwTime() {
		return wTime;
	}
	public void setwTime(Time wTime) {
		this.wTime = wTime;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getFileCount() {
		return fileCount;
	}
	public void setFileCount(int fileCount) {
		this.fileCount = fileCount;
	}

	
	
}
