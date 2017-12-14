package P0811;
/*
 * 	친구 전화번호를 관리하는 프로그램을 만들자.
 */
import		java.awt.*;
import		java.awt.event.*;
import		javax.swing.*;
import		javax.swing.table.*;

import		JDBC.*;
import		java.sql.*;
public class FriendTel {
	//	폼에 관련된 변수들
	JFrame 				f;	
	JTable					table;
	DefaultTableModel	model;
	JTextField				noF, nameF, telF, addrF, birthF, genderF;
	JButton				allB, nameB, telB, modifyB, removeB, addB, exitB;
	
	//	데이타베이스 처리를 위한 변수
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
		//	시작하자마자 다 다오게 하자.
		allProc();
	}

	//	화면 구성을 전담할 함수를 따로 만들자
	//	그러면 관리하기가 쉬울것이다.
	void setForm() {
		f = new JFrame("전화번호 관리 프로그램 -- (주)선돌 시스템");
		f.setResizable(false);
		//	x 단추를 누르면 데이터베이스 사용을 중지하고 종료를 해야 하므로.....
		//	x 단추를 누르지 못하게 방지하자.
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		//	이제 도구를 만들어서 이쁘게 배치하자.
		String[] filed = {"번호", "이름", "전화번호", "주소", "생년월일", "성별"};
		model = new DefaultTableModel(filed, 0);
		//	==>		제목만 있고 줄은 없는(데이터가 없는) 테이블을 만든다.
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
		//	번호는 자동 일련번호 입력을 할 예정이므로 보여만 주도록 한다.
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
		
		allB = new JButton("전체 검색");
		nameB = new JButton("이름 검색");
		telB = new JButton("전화번호 검색");
		modifyB = new JButton("수정");
		removeB = new JButton("삭제");
		addB = new JButton("추가");
		exitB = new JButton("종료");
		
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
	
	//	데이터베이스 처리를 위한 준비 작업을 하기 위한 함수
	//	드라이버 로딩, 컨넥션, 스테이트먼트 생성
	void setDB() {
		try {
			db = new JDBCUtil();
			con = db.getCON();
			//	먼저 질의 명령이 준비되어야 한다.
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

	//	이벤트 등록을 전담할 함수를 만들자.
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
	//	각각의 이벤트를 처리할 전담 함수를 만들어 주자
	
	//	현재 테이블의 내용을 삭제하기 위한 전담함수
	void removeTable() {
		//	원리
		//		전체를 한꺼번에 지우는 방법은 없다.
		
		//		지워야 할 줄 수를 알아내고
		int		row = table.getRowCount();
		//		한줄씩 삭제해 나가야 한다.
		for(int i = 0; i < row; i++) {
			model.removeRow(0);
		}
	}
	
	
	//	전체를 꺼내서 테이블에 내용을 채워주는 함수
	void allProc() {
		//	할일
		try {
			//		질의를 실행하고
			rs = allS.executeQuery(); 
			//		탄생한 가상테이블을 이용해서 테이블에 기록한다.
		
			//	문제점 발견
			//	기존 데이터가 살아있더라......
			//	기존 데이터를 지우고 입력 하자.
			removeTable();
			while(rs.next()) {
				//	한줄의 데이터를 꺼낸다.
				int		no = rs.getInt("f_NO");
				String	name = rs.getString("f_Name");
				String	tel = rs.getString("f_Tel");
				String	addr = rs.getString("f_Addr");
				Date	birth = rs.getDate("f_Birth");
				String	gender = rs.getString("f_Gender");
				
				//	이 데이터를 화면 테이블에 기록한다.
				//	데이터를 추가하기 위해서는 데이터가 Vector, 배열로
				//	준비되어 있어야 한다.
				
				String[] item = {Integer.toString(no), name, tel, addr, birth.toString(), gender};
				model.addRow(item);
			}
			db.close(rs);
		}
		catch(Exception e) {}
		
	}
	//	이름 검색 전담 함수
	void nameProc() {
		//	이름 검색은 먼저 nameF에 검색할 이름을 입력한 후
		//	단추를 누르면 그 사람만 알아내도록 하고 싶다.
		
		//	할일
		//		입력상자에 입력된 검색 내용을 알아낸다.
		String	search = nameF.getText();
		
		//		질의를 실행한다.
		//		이때는 ?를 채워 주어야 한다.
		//		?는 LIKE 질의에 사용할 ?이다.
		//			LIKE '%김%'	의 형식으로 사용된다.
		//		그러므로 ?를 채울때도 필요한 %를 만들어서 채워주어야 한다.
		search = "%" + search + "%";
		try {
			nameS.setString(1, search);
			
			rs = nameS.executeQuery();
			//	이후 꺼내서 테이블을 만드는것은 위와 동일하다.
			removeTable();
			while(rs.next()) {
				int no = rs.getInt("f_NO");
				String name = rs.getString("f_Name");
				String tel = rs.getString("f_Tel");
				String addr = rs.getString("f_Addr");
				Date birth = rs.getDate("f_Birth");
				String gender = rs.getString("f_Gender");
				
				//	이 데이터를 화면 테이블에 기록한다.
				//	데이터를 추가하기 위해서는 데이터가 Vector, 배열로 준비되어 있어야 한다.
				String[] item = {Integer.toString(no),name,tel,addr,birth.toString(),gender};
				model.addRow(item);
			}
			db.close(rs);			
		}
		catch(Exception e) {}
	}

	//	숙제
	void telProc() {
		//	전화번호 필드에 전화번호 뒤자리 4자리만 입력하면
		//	해당 전화번호를 가진 사람을 검색해서 테이블에
		//	출력하도록 하세요.
		
		
	}
	//	추가 전담함수
	void addProc() {
		//	할일
		//		입력상자에 입력된 항목을 알아내고
		String	name = nameF.getText();
		String	tel = telF.getText();
		String	addr = addrF.getText();
		String	birth = birthF.getText();
		String	gender = genderF.getText();
		
		//		그 내용을 데이터베이스에 기록한다.
		//		이미 추가 질의를 위한 전담 Statement는 준비되어 있으므로
		//		? 부분을 채워주고 질의를 실행하면 된다.
		try {
			addS.setString(1, name);
			addS.setString(2, tel);
			addS.setString(3, addr);
			addS.setString(4, birth);			//	????-??-??	의 형식
			addS.setString(5, gender);		//	한글자만 입력 (M : 남. W : 여)
			
			addS.execute();
		}
		catch(Exception e) {}
	}
	//	수정 전담 함수
	void modifyProc() {
		//	입력 상자의 내용 알아낸다.
		String	no = noF.getText();
		String	name = nameF.getText();
		String	tel = telF.getText();
		String	addr = addrF.getText();
		String	birth = birthF.getText();
		String	gender = genderF.getText();
		
		try {
		//	? 채워서
			modifyS.setString(1, name);
			modifyS.setString(2, tel);
			modifyS.setString(3, addr);
			modifyS.setString(4, birth);
			modifyS.setString(5, gender);
			modifyS.setInt(6, Integer.parseInt(no));
		//	질의 실행한다.
			modifyS.execute();
		}
		catch(Exception e) {}
		allProc();
	}
	//	숙제
	void removeProc() {
		//	할일
		//		번호만 알아내서
		
		//		? 채우고
		
		//		실행한다.
	}
	//	프로그램 종료 전담 함수
	void exitProc() {
		//	할일
		//		접속한 데이터베이스 자원 닫고
		db.close(allS);
		db.close(nameS);
		db.close(telS);
		db.close(addS);
		db.close(modifyS);
		db.close(removeS);
		db.close(rs);
		db.close(con);
		//		프로그램을 종료한다.
		System.exit(0);
	}
	
	//	단추에 이벤트를 걸어서 기능을 구현해 보자.
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
	//	테이블에 한줄을 선택하면 그 줄의 내용이 옆에 나오도록 하고싶다.
	//	근데...	테이블에는 이벤트가 없다.
	//	편법	마우스 이벤트를 이용해서 처리할 예정이다.
	class TableEvent extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			//	할일
			//		1.	선택한 줄의 번호를 알아낸다.
			int		row = table.getSelectedRow();
			//		2.	줄의 각 칸의 내용을 알아낸다.
			String	no = (String) table.getValueAt(row, 0);
			String	name = (String) table.getValueAt(row, 1);
			String	tel = (String) table.getValueAt(row, 2);
			String	addr = (String) table.getValueAt(row, 3);
			String	birth = (String) table.getValueAt(row, 4);
			String	gender = (String) table.getValueAt(row, 5);
			//		3.	옆의 텍스트 필드에 출력한다.
			noF.setText(no);
			nameF.setText(name);
			telF.setText(tel);
			addrF.setText(addr);
			birthF.setText(birth);
			genderF.setText(gender);
		}
	}
}




