package P0727;
/*
 * 	�� Ŭ������ �������� �۾����� ����ϴ� Ŭ������ ��������
 */
//	���� �ܺ���ġ�� �� Ŭ������ ��ä�� �������� ���ؼ���(����ȭ �Ϸ���)
//	�ݵ�� �� Ŭ������ ����ȭ Ŭ������ ����Ǿ�� �Ѵ�.
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
