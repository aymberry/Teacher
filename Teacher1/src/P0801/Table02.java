package P0801;
/*
 * 	친구 전화번호를 관리하는 프로그램을 만들어보자.
 */
import		java.awt.*;
import		java.awt.event.*;
import		javax.swing.*;
import		javax.swing.table.*;
//	JTable의 모델은 javax.swing.table 패키지 안에 있다.
public class Table02 {
	JTable					table;
	DefaultTableModel	model;
	JButton				addB, modifyB, removeB, exitB;
	JTextField				nameF, telF, ageF, addrF;
	public Table02() {
		JFrame	f = new JFrame("전화번호 관리 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] title = {"이름", "전화번호", "나이", "주소"};
		model = new DefaultTableModel(title, 0);
		//		제목을 쓰고 줄은 없는 모양을 만드세요.
		table = new JTable(model);
		table.addMouseListener(new TableEvent());
		
		JScrollPane	sp = new JScrollPane(table);

		addB = new JButton("친구추가");
		modifyB = new JButton("정보수정");
		removeB = new JButton("원수삭제");
		exitB = new JButton("종료하기");
		
		//	이벤트 등록을 한다.
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
		//	할일
		//	1.	입력상자에 입력한 내용을 알아낸다.
		String	name = nameF.getText();
		String	tel = telF.getText();
		String	age = ageF.getText();
		String addr = addrF.getText();
		
		//	2.	테이블에 그 친구의 정보를 출력한다.
		//		테이블에 새로운 줄을 만드는 것은 테이블의 모양을 바꾸는 기능이다.
		String[] data = {name, tel, age, addr};
		model.addRow(data);
		
		//	입력상자의 내용은 다음번 입력을 위해서 지워주자
		nameF.setText("");
		telF.setText("");
		ageF.setText("");
		addrF.setText("");
	}
	//	수정 전담 함수
	void modifyProc() {
		//	할일
		//		1.	입력상자에 있는 내용(수정한 내용)을 알아낸다.
		String	name = nameF.getText();
		String	tel = telF.getText();
		String	age = ageF.getText();
		String addr = addrF.getText();
		
		//		2.	테이블에 선택한줄의 내용을 바꾼다.
		//			현재 만들어진 줄의 내용만 바꾸는 것이므로 테이블을 이용한다.
		//			사용함수	
		//				setValueAt(Object aValue, int row, int column)
		//	선택한 줄을 알아내고
		int		row = table.getSelectedRow();
		table.setValueAt(name, row, 0);
		table.setValueAt(tel, row, 1);
		table.setValueAt(age, row, 2);
		table.setValueAt(addr, row, 3);
		
		//	입력상자의 내용은 다음번 입력을 위해서 지워주자
		nameF.setText("");
		telF.setText("");
		ageF.setText("");
		addrF.setText("");
		
	}
	//	삭제 전담함수
	void removeProc() {
		//	할일
		//		선택한 줄을 알아내고
		int		row = table.getSelectedRow();
		//		그 줄을 삭제한다.
		//		삭제는 모양을 변경하는 것이므로 모델을 이용한다.
		//		사용함수	removeRow(int row)
		model.removeRow(row);
		//	입력상자의 내용은 다음번 입력을 위해서 지워주자
		nameF.setText("");
		telF.setText("");
		ageF.setText("");
		addrF.setText("");
		
	}
	public static void main(String[] args) {
		new Table02();
	}
	//	단추4개에 이벤트를 설치를 해야할 것이다.
	class ButtonEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	4개의 단추 모두 이함수를 이용하기로 약속했다.
			//	그러므로 어떤 단추가 이벤트가 발생했는지를 구분해야 한다
			JButton	target = (JButton) e.getSource();
			if(target == addB) {
				//	할일이 많으므로 따로 함수를 만들어 처리하도록 하자.
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
	//	테이블은 주로 데이터를 출력할 때 사용하는 도구이므로
	//	이벤트가 없다.
	//	편법으로 모든 도구에 다 사용할 수 있는 마우스 클릭을 이용해서
	//	이벤트를 처리해야 한다.
	class TableEvent extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			//	할일
			//		1	마우스가 클릭된 줄의 위치를 알아낸다.
			//			사용함수	getSelectedRow()
			int		row = table.getSelectedRow();
			//		2.	그 줄의 데이터를 알아낸다.
			//			사용함수	getValueAt(int row, int column)
			String	name = (String) table.getValueAt(row, 0);
			String	tel = (String) table.getValueAt(row, 1);
			String	age = (String) table.getValueAt(row, 2);
			String	addr = (String) table.getValueAt(row, 3);
			
			//		3.	 알아낸 결과를 옆에 텍스트 필드에 출력한다.
			nameF.setText(name);
			telF.setText(tel);
			ageF.setText(age);
			addrF.setText(addr);
		}
	}
	
	
	
	
	
	
	
	
	
}



