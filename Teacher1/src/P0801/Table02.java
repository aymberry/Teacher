package P0801;
/*
 * 	ģ�� ��ȭ��ȣ�� �����ϴ� ���α׷��� ������.
 */
import		java.awt.*;
import		java.awt.event.*;
import		javax.swing.*;
import		javax.swing.table.*;
//	JTable�� ���� javax.swing.table ��Ű�� �ȿ� �ִ�.
public class Table02 {
	JTable					table;
	DefaultTableModel	model;
	JButton				addB, modifyB, removeB, exitB;
	JTextField				nameF, telF, ageF, addrF;
	public Table02() {
		JFrame	f = new JFrame("��ȭ��ȣ ���� ���α׷�");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] title = {"�̸�", "��ȭ��ȣ", "����", "�ּ�"};
		model = new DefaultTableModel(title, 0);
		//		������ ���� ���� ���� ����� ���弼��.
		table = new JTable(model);
		table.addMouseListener(new TableEvent());
		
		JScrollPane	sp = new JScrollPane(table);

		addB = new JButton("ģ���߰�");
		modifyB = new JButton("��������");
		removeB = new JButton("��������");
		exitB = new JButton("�����ϱ�");
		
		//	�̺�Ʈ ����� �Ѵ�.
		ButtonEvent02		evt = new ButtonEvent02();
		addB.addActionListener(evt);
		modifyB.addActionListener(evt);
		removeB.addActionListener(evt);
		exitB.addActionListener(evt);
		
		JPanel	p1 = new JPanel();
		p1.add(addB);
		p1.add(modifyB);
		p1.add(removeB);
		p1.add(exitB);
		
		JLabel	nameL = new JLabel("Name");
		JLabel	telL = new JLabel("Mobile");
		JLabel	ageL = new JLabel("Age");
		JLabel	addrL = new JLabel("Address");
		
		JPanel	p2 = new JPanel(new GridLayout(4, 1));
		p2.add(nameL);
		p2.add(telL);
		p2.add(ageL);
		p2.add(addrL);
		
		nameF = new JTextField(10);
		telF = new JTextField(10);
		ageF = new JTextField(10);
		addrF = new JTextField(10);
		JPanel	p3 = new JPanel(new GridLayout(4, 1));
		p3.add(nameF);
		p3.add(telF);
		p3.add(ageF);
		p3.add(addrF);

		JPanel	p4 = new JPanel(new BorderLayout());
		p4.add("West", p2);
		p4.add("Center", p3);
		
		ImageIcon logoImg = new ImageIcon("src/P0801/tae.jpg");
		JLabel logoL = new JLabel(logoImg);
		
		JPanel p5 = new JPanel(new BorderLayout());
		p5.add("North", p4);
		p5.add("Center", logoL);
		
		f.add(sp);
		f.add("South", p1);
		f.add("West", p5);
		f.setSize(600, 500);
		f.setVisible(true);
	
	}
	void addProc() {
		//	����
		//	1.	�Է»��ڿ� �Է��� ������ �˾Ƴ���.
		String	name = nameF.getText();
		String	tel = telF.getText();
		String	age = ageF.getText();
		String addr = addrF.getText();
		
		//	2.	���̺� �� ģ���� ������ ����Ѵ�.
		//		���̺� ���ο� ���� ����� ���� ���̺��� ����� �ٲٴ� ����̴�.
		String[] data = {name, tel, age, addr};
		model.addRow(data);
		
		//	�Է»����� ������ ������ �Է��� ���ؼ� ��������
		nameF.setText("");
		telF.setText("");
		ageF.setText("");
		addrF.setText("");
	}
	//	���� ���� �Լ�
	void modifyProc() {
		//	����
		//		1.	�Է»��ڿ� �ִ� ����(������ ����)�� �˾Ƴ���.
		String	name = nameF.getText();
		String	tel = telF.getText();
		String	age = ageF.getText();
		String addr = addrF.getText();
		
		//		2.	���̺� ���������� ������ �ٲ۴�.
		//			���� ������� ���� ���븸 �ٲٴ� ���̹Ƿ� ���̺��� �̿��Ѵ�.
		//			����Լ�	
		//				setValueAt(Object aValue, int row, int column)
		//	������ ���� �˾Ƴ���
		int		row = table.getSelectedRow();
		table.setValueAt(name, row, 0);
		table.setValueAt(tel, row, 1);
		table.setValueAt(age, row, 2);
		table.setValueAt(addr, row, 3);
		
		//	�Է»����� ������ ������ �Է��� ���ؼ� ��������
		nameF.setText("");
		telF.setText("");
		ageF.setText("");
		addrF.setText("");
		
	}
	//	���� �����Լ�
	void removeProc() {
		//	����
		//		������ ���� �˾Ƴ���
		int		row = table.getSelectedRow();
		//		�� ���� �����Ѵ�.
		//		������ ����� �����ϴ� ���̹Ƿ� ���� �̿��Ѵ�.
		//		����Լ�	removeRow(int row)
		model.removeRow(row);
		//	�Է»����� ������ ������ �Է��� ���ؼ� ��������
		nameF.setText("");
		telF.setText("");
		ageF.setText("");
		addrF.setText("");
		
	}
	public static void main(String[] args) {
		new Table02();
	}
	//	����4���� �̺�Ʈ�� ��ġ�� �ؾ��� ���̴�.
	class ButtonEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	4���� ���� ��� ���Լ��� �̿��ϱ�� ����ߴ�.
			//	�׷��Ƿ� � ���߰� �̺�Ʈ�� �߻��ߴ����� �����ؾ� �Ѵ�
			JButton	target = (JButton) e.getSource();
			if(target == addB) {
				//	������ �����Ƿ� ���� �Լ��� ����� ó���ϵ��� ����.
				addProc();
			}
			else if(target == modifyB) {
				modifyProc();
			}
			else if(target == removeB) {
				removeProc();
			}
			else if(target == exitB) {
				System.exit(0);
			}
		}
	}
	//	���̺��� �ַ� �����͸� ����� �� ����ϴ� �����̹Ƿ�
	//	�̺�Ʈ�� ����.
	//	������� ��� ������ �� ����� �� �ִ� ���콺 Ŭ���� �̿��ؼ�
	//	�̺�Ʈ�� ó���ؾ� �Ѵ�.
	class TableEvent extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			//	����
			//		1	���콺�� Ŭ���� ���� ��ġ�� �˾Ƴ���.
			//			����Լ�	getSelectedRow()
			int		row = table.getSelectedRow();
			//		2.	�� ���� �����͸� �˾Ƴ���.
			//			����Լ�	getValueAt(int row, int column)
			String	name = (String) table.getValueAt(row, 0);
			String	tel = (String) table.getValueAt(row, 1);
			String	age = (String) table.getValueAt(row, 2);
			String	addr = (String) table.getValueAt(row, 3);
			
			//		3.	 �˾Ƴ� ����� ���� �ؽ�Ʈ �ʵ忡 ����Ѵ�.
			nameF.setText(name);
			telF.setText(tel);
			ageF.setText(age);
			addrF.setText(addr);
		}
	}
	
	
	
	
	
	
	
	
	
}



