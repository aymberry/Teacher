package VO;
/*
 * 	이 클래스는 오직 데이터를 묶어서 한번에 기억할 역활을 클래스이다.
 * 	이런 클래스는 우리는 VO, DataBean 클래스라고 한다.
 * 
 * 	VO 클래스를 만드는 요령
 * 	1.		데이터를 기억할 변수를 준비한다.
 * 
 *  2.		필요하다면 은닉화 시켜서 사용하면 된다.
 */
import		java.sql.*;
public class GuestVO {
	public int no;
	public String who;
	public String body;
	public Date	date;

}








