package Controller.fileBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SuperAction;

public class WriteForm extends SuperAction {
	public String action(HttpServletRequest req, HttpServletResponse resp) {
		//	����
		//	�۾��� ���� �����ִ� �۾��̹Ƿ� ������ ���� ���� �����ָ� �Ǵµ�....
		//	���� ���� �˻簡 �ʿ��� ��찡 �������̴�.
		
		//	��>		�α����� ���� ������ �۾��⸦ ���ϰ� �Ѵٴ���....
		//			�� �۾��� ReBoard�Խ����� WriteForm.java ������
		//			����� �ؼ� ���� �˻� ó���� ���ֱ� �ٶ���.
		
		//	�츮�� ���� �丸 �ҷ�����.
		return "../view/FileBoard/WriteForm.jsp";
	}
}






