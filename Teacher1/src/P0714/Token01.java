package P0714;
/*
 * 	����	�ϳ��� ���ڿ��� 3����� �̸��� �Ѳ����� �Է��� ��
 * 			�и��ؼ� ����ϼ���.
 */
import		java.util.*;
public class Token01 {
	public static void main(String[] args) {
//		String	names = "ȫ�浿 �ھ��� �嵶��";
		//	���� ������ �߽����� �̸��� �����ڴ�....
		String names = "www.daum.net:8080/Test/index.txt";
		//	���� . : / �� �̿��ؼ� �����͸� �и��ϰ� �ʹ�.
		
		StringTokenizer	token = new StringTokenizer(names, ".:/", true);
		//	�̻���� �Ͼ�� �̹� �и��Ǿ �������͸��� ���Ǿ� �ִ�.
		//	�������͸��� �ӽñ������̹Ƿ� �ڵ� �����ȴ�.
		//	(�ѹ� ����ϸ� ������ �����Ѵ�.)
		//	������ �ٽ� ����ϱ� ���ؼ��� �ֱ����ġ�� �޸𸮷�
		//	�Űܾ� �Ѵ�.
		String[]	name;		//	�������� ����� �𸣹Ƿ� �迭�� �������.
		int	size = token.countTokens();
		//	�и��� ������ŭ �迭�� �غ��Ѵ�.
		name = new String[size];
		
		//	���� �ϳ��� ������....
		//	������ �۾��� �ݺ��ؾ� ���ٵ�.... ��� �ݺ��ϸ� �� ������ �𸥴�.
		int		pos = 0;	//	�迭�� ���� ��ġ�� ����� ����
		while(token.hasMoreTokens()) {
			//	���� ������� ���� �����Ͱ� ����������.... 
			//	����ؼ� �ݺ��ϵ��� �Ѵ�.
			name[pos] = token.nextToken();
			pos++;
		}
		//	����	�� �۾��� split�� �̿��ϸ� �ѹ��� ������.
//		name = names.split(" ");

		//	����� ����� ����.
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		
		
	}

}

