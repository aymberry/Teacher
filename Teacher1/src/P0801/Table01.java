package P0801;
/*
 * 	����
 * 
 * 		����ó�� ǥ�� ���� �� �ȿ� �����͸� �Է��غ���.
 */
import		javax.swing.*;
public class Table01 {
	public Table01() {
		JFrame	f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//	��ĭ�� ������ 1�� �迭�� �����.
		String[] title = {"�̸�", "��ȭ��ȣ", "����", "�ּ�"};
		//	��ĭ�� �� ���� �����͸� 2�� �迭�� �����.
		String[][] data = {{"ȫ�浿", "010-1111-2222", "24", "����� ���α�"}, 
							{"�ھ���", "010-2222-3333", "32", "����� ��õ��"}, 
							{"�嵶��", "010-3333-4444", "27", "����� ���۱�"}};

		//	���� 2���� �����͸� �̿��ؼ� JTable�� �����.
		JTable table = new JTable(data, title);
		//	�̰� ���� ��ũ�ѹٰ� �����Ƿ� ������ �����.
		JScrollPane sp = new JScrollPane(table);
		
		f.add(sp);
		
		f.setSize(400,  400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Table01();
	}
}




