package P0822;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 	��ó�� ��Ʈ�ѷ��� �Ϲ� Ŭ������ �����ϸ� �ȴ�.
 * 
 * 	�� Ŭ������ ������ ������� ���ϰ�
 * 	����ġ �������� ������ �����ؾ� �ϴ� Ŭ�����̴�.
 * 	==>		main()�� �ʿ����.
 * 
 * 	�ٸ� �������� �� Ŭ������ �����ؾ� �ϹǷ� �Լ��� ȣ���ؾ� �Ѵ�.
 * 	==>		�� Ŭ���� �ȿ��� ����ġ ������ ȣ���� �Լ��� ����� �����Ѵ�.
 * 
 * 		�� �Լ��� �� ��� ����ϱ� ���ؼ���
 * 		���� �⺻�� 	��û							request
 * 						����ó���� �ϱ� ���ؼ�		response�� �ʿ�� �Ѵ�.
 * 		(�ݵ�� ������� ���� �ƴϰ� �ʿ��Ұ� ���Ƽ�)
 * 
 * 	���Ŀ��� �Ϲ� Ŭ������ ����� ������� �ذ��ϸ� �ȴ�.
 */
public class Imsi01 {

	public void action
		(HttpServletRequest request, HttpServletResponse response) {
		//	�� �ȿ��� Ŭ���̾�Ʈ�� ��û�� ������ ó���ϴ�
		//	�����Ͻ� ������ �����ϸ� �ȴ�.
		System.out.println("Test01��û�� ���� ��Ʈ�ѷ��̴�.");
	}
	
}








