package P0731;
/*
 * 	����
 * 		��� ���ڸ� �ϳ� ����� �� �ȿ� 5���� �׸��� �־��.
 * 
 * 		�׸��� �����ϸ� ������ �׸��� ȭ�鿡 ����ϵ��� ����.
 */
import		javax.swing.*;
import		javax.swing.event.*;
import		java.awt.*;
public class List01 {
	JList	list;
	public List01() {
		JFrame	frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		//	FlowLayout�� �� ������ ���� ���� ũ��� ����Ƿ�
		//	������ ���� ����� ��Ȯ�ϰ� ���� �ִ� ����� �ϳ��̴�.
		
		String[] item = {"������", "������", "������", "������", "Ȳ�ž�"};
		list = new JList(item);
		list.setVisibleRowCount(3);
		
		list.addListSelectionListener(new MyEvent03());
		//	���� 3�� ������ ���̰� ũ�⸦ ����� �ʹ�.
		
		//	�ڡ�
		//	Ư�� ������ ��ũ�ѹٰ� �ʿ��ϸ� ������ ��ũ�ѹٸ� �����
		//	�־�� �Ѵ�.
		JScrollPane	sp = new JScrollPane(list);
		
		//	�����̳ʿ��� ����Ʈ�� �ƴ� ��ũ�ѹٰ� ���� �Ѵ�.
		//	�ֳ��ϸ� ����Ʈ �ۿ� ��ũ�ѹٸ� ���� ���ұ� ������
		//	��Ŭ�ιٰ� �� ��Ŭ�ι� ���ʿ� ����Ʈ�� ���� ���δ�.
		frame.add(sp);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new List01();
	}
	
	class MyEvent03 implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			//	����
			//		������ �׸� �˾Ƴ���
			String	item = (String) list.getSelectedValue();
			//		ȭ�鿡 ����ϱ�
			System.out.println("���� �׸� = " + item);
			
			//	�� 2�� ����� ��������?
			//		����
			//			���õǱ� ���� �ѹ� �̺�Ʈ�� �߻��ϰ�
			//			���õ� �Ŀ� �ٽ� �ѹ� �̺�Ʈ�� �߻��ϱ� �����̴�.
		}
	}
}





