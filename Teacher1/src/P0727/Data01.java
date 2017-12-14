package P0727;
/*
 * 	이 클래스는 여러분의 작업에서 사용하는 클래스로 가정하자
 */
//	만약 외부장치에 이 클래스를 통채로 내보내기 위해서는(직렬화 하려면)
//	반드시 이 클래스는 직렬화 클래스로 선언되어야 한다.
import		java.io.*;
public class Data01 implements Serializable {
	
	String		name;
	int			kor, eng, mat;
	int			total;
	float		avg;
	
	Data01() {}
	Data01(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
		
		total = kor + eng + mat;
		avg = total / 3.0F;
	}
}
