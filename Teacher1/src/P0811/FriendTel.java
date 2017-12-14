package P0811;
/*
 * 	ģ�� ��ȭ��ȣ�� �����ϴ� ���α׷��� ������.
 */
import		java.awt.*;
import		java.awt.event.*;
import		javax.swing.*;
import		javax.swing.table.*;

import		JDBC.*;
import		java.sql.*;
public class FriendTel {
	//	���� ���õ� ������
	JFrame 				f;	
	JTable					table;
	DefaultTableModel	model;
	JTextField				noF, nameF, telF, addrF, birthF, genderF;
	JButton				allB, nameB, telB, modifyB, removeB, addB, exitB;
	
	//	����Ÿ���̽� ó���� ���� ����
	JDBCUtil				db;
	Connection			con;
	PreparedStatement	allS, nameS, telS, addS, modifyS, removeS;
	ResultSet				rs;
	
	public FriendTel() {
		setForm();
		setEvent();
		f.setSize(800, 500);
		f.setVisible(true);
		setDB();
		//	�������ڸ��� �� �ٿ��� ����.
		allProc();
	}

	//	ȭ�� ������ ������ �Լ��� ���� ������
	//	�׷��� �����ϱⰡ ������̴�.
	void setForm() {
		f = new JFrame("��ȭ��ȣ ���� ���α׷� -- (��)���� �ý���");
		f.setResizable(false);
		//	x ���߸� ������ �����ͺ��̽� ����� �����ϰ� ���Ḧ �ؾ� �ϹǷ�.....
		//	x ���߸� ������ ���ϰ� ��������.
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		//	���� ������ ���� �̻ڰ� ��ġ����.
		String[] filed = {"��ȣ", "�̸�", "��ȭ��ȣ", "�ּ�", "�������", "����"};
		model = new DefaultTableModel(filed, 0);
		//	==>		���� �ְ� ���� ����(�����Ͱ� ����) ���̺��� �����.
		table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		JLabel		noL = new JLabel("NO", JLabel.RIGHT);
		JLabel		nameL = new JLabel("Name", JLabel.RIGHT);
		JLabel		telL = new JLabel("TEL", JLabel.RIGHT);
		JLabel		addrL = new JLabel("Address", JLabel.RIGHT);
		JLabel		birthL = new JLabel("Birth", JLabel.RIGHT);
		JLabel		genderL = new JLabel("Gender", JLabel.RIGHT);

		JPanel		p1 = new JPanel(new GridLayout(6, 1));
		p1.add(noL);
		p1.add(nameL);
		p1.add(telL);
		p1.add(addrL);
		p1.add(birthL);
		p1.add(genderL);
		
		noF = new JTextField(10);
		noF.setEnabled(false);
		//	��ȣ�� �ڵ� �Ϸù�ȣ �Է��� �� �����̹Ƿ� ������ �ֵ��� �Ѵ�.
		nameF = new JTextField(10);
		telF = new JTextField(10);
		addrF = new JTextField(10);
		birthF = new JTextField(10);
		genderF = new JTextField(10);
		
		JPanel		p2 = new JPanel(new GridLayout(6, 1));
		p2.add(noF);
		p2.add(nameF);
		p2.add(telF);
		p2.add(addrF);
		p2.add(birthF);
		p2.add(genderF);
		
		JPanel	p3 = new JPanel(new BorderLayout());
		p3.add("West", p1);
		p3.add("Center", p2);
		
		JPanel	p4 = new JPanel(new BorderLayout());
		p4.add("North", p3);
		
		allB = new JButton("��ü �˻�");
		nameB = new JButton("�̸� �˻�");
		telB = new JButton("��ȭ��ȣ �˻�");
		modifyB = new JButton("����");
		removeB = new JButton("����");
		addB = new JButton("�߰�");
		exitB = new JButton("����");
		
		JPanel	p5 = new JPanel();
		p5.add(allB);
		p5.add(nameB);
		p5.add(telB);
		p5.add(addB);
		p5.add(modifyB);
		p5.add(removeB);
		p5.add(exitB);
		
		f.add("West", p4);
		f.add("Center", sp);
		f.add("South", p5);
	}
	
	//	�����ͺ��̽� ó���� ���� �غ� �۾��� �ϱ� ���� �Լ�
	//	����̹� �ε�, ���ؼ�, ������Ʈ��Ʈ ����
	void setDB() {
		try {
			db = new JDBCUtil();
			con = db.getCON();
			//	���� ���� ����� �غ�Ǿ�� �Ѵ�.
			String	allSQL = "SELECT * FROM Friend ORDER BY f_NO";
			String nameSQL = "SELECT * FROM Friend WHERE f_Name LIKE ? ORDER BY f_NO";
			String telSQL = "SELECT * FROM Friend WHERE f_Tel LIKE ? ORDER BY f_NO";
			String addSQL = "INSERT INTO Friend VALUES((SELECT NVL(MAX(f_NO),0) + 1 FROM Friend), ?, ?, ?, TO_DATE(?), ?)";
			String modifySQL = "UPDATE Friend SET f_Name = ? , f_Tel = ? , f_Addr = ? , f_Birth = TO_DATE (?) , f_Gender = ? WHERE f_NO = ?";
			String removeSQL = "DELETE FROM Friend WHERE f_NO = ?";

			allS = con.prepareStatement(allSQL);
			nameS = con.prepareStatement(nameSQL);
			telS = con.prepareStatement(telSQL);
			addS = con.prepareStatement(addSQL);
			modifyS = con.prepareStatement(modifySQL);
			removeS = con.prepareStatement(removeSQL);
		}
		catch(Exception e) {}
	}

	//	�̺�Ʈ ����� ������ �Լ��� ������.
	void setEvent() {
		ButtonEvent evt = new ButtonEvent();
		allB.addActionListener(evt);
		nameB.addActionListener(evt);
		telB.addActionListener(evt);
		addB.addActionListener(evt);
		modifyB.addActionListener(evt);
		removeB.addActionListener(evt);
		exitB.addActionListener(evt);
		
		table.addMouseListener(new TableEvent());
	}
	
	
	
	public static void main(String[] args) {
		new FriendTel();
	}
	//	������ �̺�Ʈ�� ó���� ���� �Լ��� ����� ����
	
	//	���� ���̺��� ������ �����ϱ� ���� �����Լ�
	void removeTable() {
		//	����
		//		��ü�� �Ѳ����� ����� ����� ����.
		
		//		������ �� �� ���� �˾Ƴ���
		int		row = table.getRowCount();
		//		���پ� ������ ������ �Ѵ�.
		for(int i = 0; i < row; i++) {
			model.removeRow(0);
		}
	}
	
	
	//	��ü�� ������ ���̺� ������ ä���ִ� �Լ�
	void allProc() {
		//	����
		try {
			//		���Ǹ� �����ϰ�
			rs = allS.executeQuery(); 
			//		ź���� �������̺��� �̿��ؼ� ���̺� ����Ѵ�.
		
			//	������ �߰�
			//	���� �����Ͱ� ����ִ���......
			//	���� �����͸� ����� �Է� ����.
			removeTable();
			while(rs.next()) {
				//	������ �����͸� ������.
				int		no = rs.getInt("f_NO");
				String	name = rs.getString("f_Name");
				String	tel = rs.getString("f_Tel");
				String	addr = rs.getString("f_Addr");
				Date	birth = rs.getDate("f_Birth");
				String	gender = rs.getString("f_Gender");
				
				//	�� �����͸� ȭ�� ���̺� ����Ѵ�.
				//	�����͸� �߰��ϱ� ���ؼ��� �����Ͱ� Vector, �迭��
				//	�غ�Ǿ� �־�� �Ѵ�.
				
				String[] item = {Integer.toString(no), name, tel, addr, birth.toString(), gender};
				model.addRow(item);
			}
			db.close(rs);
		}
		catch(Exception e) {}
		
	}
	//	�̸� �˻� ���� �Լ�
	void nameProc() {
		//	�̸� �˻��� ���� nameF�� �˻��� �̸��� �Է��� ��
		//	���߸� ������ �� ����� �˾Ƴ����� �ϰ� �ʹ�.
		
		//	����
		//		�Է»��ڿ� �Էµ� �˻� ������ �˾Ƴ���.
		String	search = nameF.getText();
		
		//		���Ǹ� �����Ѵ�.
		//		�̶��� ?�� ä�� �־�� �Ѵ�.
		//		?�� LIKE ���ǿ� ����� ?�̴�.
		//			LIKE '%��%'	�� �������� ���ȴ�.
		//		�׷��Ƿ� ?�� ä�ﶧ�� �ʿ��� %�� ���� ä���־�� �Ѵ�.
		search = "%" + search + "%";
		try {
			nameS.setString(1, search);
			
			rs = nameS.executeQuery();
			//	���� ������ ���̺��� ����°��� ���� �����ϴ�.
			removeTable();
			while(rs.next()) {
				int no = rs.getInt("f_NO");
				String name = rs.getString("f_Name");
				String tel = rs.getString("f_Tel");
				String addr = rs.getString("f_Addr");
				Date birth = rs.getDate("f_Birth");
				String gender = rs.getString("f_Gender");
				
				//	�� �����͸� ȭ�� ���̺� ����Ѵ�.
				//	�����͸� �߰��ϱ� ���ؼ��� �����Ͱ� Vector, �迭�� �غ�Ǿ� �־�� �Ѵ�.
				String[] item = {Integer.toString(no),name,tel,addr,birth.toString(),gender};
				model.addRow(item);
			}
			db.close(rs);			
		}
		catch(Exception e) {}
	}

	//	����
	void telProc() {
		//	��ȭ��ȣ �ʵ忡 ��ȭ��ȣ ���ڸ� 4�ڸ��� �Է��ϸ�
		//	�ش� ��ȭ��ȣ�� ���� ����� �˻��ؼ� ���̺�
		//	����ϵ��� �ϼ���.
		
		
	}
	//	�߰� �����Լ�
	void addProc() {
		//	����
		//		�Է»��ڿ� �Էµ� �׸��� �˾Ƴ���
		String	name = nameF.getText();
		String	tel = telF.getText();
		String	addr = addrF.getText();
		String	birth = birthF.getText();
		String	gender = genderF.getText();
		
		//		�� ������ �����ͺ��̽��� ����Ѵ�.
		//		�̹� �߰� ���Ǹ� ���� ���� Statement�� �غ�Ǿ� �����Ƿ�
		//		? �κ��� ä���ְ� ���Ǹ� �����ϸ� �ȴ�.
		try {
			addS.setString(1, name);
			addS.setString(2, tel);
			addS.setString(3, addr);
			addS.setString(4, birth);			//	????-??-??	�� ����
			addS.setString(5, gender);		//	�ѱ��ڸ� �Է� (M : ��. W : ��)
			
			addS.execute();
		}
		catch(Exception e) {}
	}
	//	���� ���� �Լ�
	void modifyProc() {
		//	�Է� ������ ���� �˾Ƴ���.
		String	no = noF.getText();
		String	name = nameF.getText();
		String	tel = telF.getText();
		String	addr = addrF.getText();
		String	birth = birthF.getText();
		String	gender = genderF.getText();
		
		try {
		//	? ä����
			modifyS.setString(1, name);
			modifyS.setString(2, tel);
			modifyS.setString(3, addr);
			modifyS.setString(4, birth);
			modifyS.setString(5, gender);
			modifyS.setInt(6, Integer.parseInt(no));
		//	���� �����Ѵ�.
			modifyS.execute();
		}
		catch(Exception e) {}
		allProc();
	}
	//	����
	void removeProc() {
		//	����
		//		��ȣ�� �˾Ƴ���
		
		//		? ä���
		
		//		�����Ѵ�.
	}
	//	���α׷� ���� ���� �Լ�
	void exitProc() {
		//	����
		//		������ �����ͺ��̽� �ڿ� �ݰ�
		db.close(allS);
		db.close(nameS);
		db.close(telS);
		db.close(addS);
		db.close(modifyS);
		db.close(removeS);
		db.close(rs);
		db.close(con);
		//		���α׷��� �����Ѵ�.
		System.exit(0);
	}
	
	//	���߿� �̺�Ʈ�� �ɾ ����� ������ ����.
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton	target = (JButton) e.getSource();
			if(target == allB) {
				allProc();
			}
			else if(target == nameB) {
				nameProc();
			}
			else if(target == telB) {
				telProc();
			}
			else if(target == addB) {
				addProc();
			}
			else if(target == modifyB) {
				modifyProc();
			}
			else if(target == removeB) {
				removeProc();
			}
			else if(target == exitB) {
				exitProc();
			}
		}
	}
	//	���̺� ������ �����ϸ� �� ���� ������ ���� �������� �ϰ�ʹ�.
	//	�ٵ�...	���̺��� �̺�Ʈ�� ����.
	//	���	���콺 �̺�Ʈ�� �̿��ؼ� ó���� �����̴�.
	class TableEvent extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			//	����
			//		1.	������ ���� ��ȣ�� �˾Ƴ���.
			int		row = table.getSelectedRow();
			//		2.	���� �� ĭ�� ������ �˾Ƴ���.
			String	no = (String) table.getValueAt(row, 0);
			String	name = (String) table.getValueAt(row, 1);
			String	tel = (String) table.getValueAt(row, 2);
			String	addr = (String) table.getValueAt(row, 3);
			String	birth = (String) table.getValueAt(row, 4);
			String	gender = (String) table.getValueAt(row, 5);
			//		3.	���� �ؽ�Ʈ �ʵ忡 ����Ѵ�.
			noF.setText(no);
			nameF.setText(name);
			telF.setText(tel);
			addrF.setText(addr);
			birthF.setText(birth);
			genderF.setText(gender);
		}
	}
}




