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
	//	����
	//	����Ŭ���� ��¥�� ������ getDate()�� ������.....
	//	�̰��� �����ϰ� ��¥�� ������� ����̴�.
	//	(��, �ð��� ������ �ʴ´�.)
	//	���� �ð����� �۾��� �ʿ��ϴٸ� �ι� ������ �Ѵ�.
	//		getDate()		��¥�� ���´�
	//		getTime()		�ð��� ���´�.
	//	���	�ι� ������ �ϹǷ� ������ �ΰ� �ʿ��ϴ�. 
	public	int		hit;
	public	int		fileCount;		//	÷�ε� ������ ����
	//	=================	�Խù� ����
	//	=================	���� ����
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
