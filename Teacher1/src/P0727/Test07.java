package P0727;
import		java.io.*;
public class Test07 {
	public Test07() {
		//	Ư�� ������ ��������.
		//	1.	������ ������ �����Ѵ�.
//		File		file = new File("D:\\sam.txt");
		//	2.	delete()�� �̿��ؼ� �����Ѵ�.
//		file.delete();
		
		//	������ ���� �ϳ��� ������.
		//	1.	���� ���� �̸��� �̿��ؼ� File�� �����Ѵ�.
//		File		file = new File("D:\\ȫ�浿");
		//	2.	mkdir()�� �̿��ؼ� ������ �����.
//		file.mkdir();
		
		//	������ ������ �ϳ� ������(���������� ������)
		//	1.	���� ���� �̸��� �̿��ؼ� File�� �����Ѵ�.
//		File		file = new File("D:\\�ھ���\\�嵶��\\�̱���");
		//	2.	�������� ����(�������� ���ÿ�)�� ����� ������
		//		mkdirs()�� ����ϼ���.
//		file.mkdirs();

		//	Ư�� ������ �̸��� �ٸ� �̸����� �����ϼ���
		//	1.	������ ���ϰ� ������ ������ ��� File �� ���弼��.
		File		oriFile = new File("D:\\1��_��Ÿ��ȸ.zip");
		File		reFile = new File("D:\\Fisrt_Typing.zip");
		//	2.	renameTo�� �̿��ؼ� �̸��� �����Ѵ�.
		oriFile.renameTo(reFile);
		
	}

	public static void main(String[] args) {
		new Test07();

	}

}
