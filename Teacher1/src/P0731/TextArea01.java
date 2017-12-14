package P0731;
/*
 * 	����
 * 
 * 		�ؽ�Ʈ ����� �ϳ� �����
 * 		�Ʒ��ʿ� ���� �ΰ��� ����� ���´�.
 * 
 * 		������ �޸��� ������.
 * 		(�����ϱ�� �ҷ����Ⱑ ������)
 */
import		java.io.*;
import		javax.swing.*;
import		java.awt.*;
import		java.awt.event.*;
public class TextArea01 {
	JTextArea		area;
	JButton		openB, saveB;
	JFrame		frame;
	public TextArea01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		area = new JTextArea();
		//	��
		//		������ ���ڸ� ǥ���Ҷ� ��� ��������
		//		�۲��� ������ �� �ִ�.
		//		�۲� �������
		//		1.	�۲��� �����.
		//		Font	font = new Font("�۲��̸�", �Ӽ�, ũ��);
		//		2.	�ʿ��� ������ �۲��� ����Ѵ�.
		//			��� �Լ�		setFont(font);
		//	�Ӽ�
		//		PLAIN					�Ϲݱ۲�
		//		BOLD					����ü
		//		ITALIC					��︲ü
		//		BOLC + ITALIC		������
		
		Font	font = new Font("�޸տ�ü", Font.PLAIN, 16);
		area.setFont(font);
		JScrollPane	sp = new JScrollPane(area);
		
		openB = new JButton("�ҷ�����");
		saveB = new JButton("�����ϱ�");
		
		MyEvent05		evt = new MyEvent05();
		openB.addActionListener(evt);
		saveB.addActionListener(evt);
		
		
		JPanel p = new JPanel();
		p.add(openB);
		p.add(saveB);
		
		frame.add("Center", sp);
		frame.add("South", p);
		
		frame.setSize(700,  700);
		frame.setVisible(true);
	}
	
	//	������ ���� ���� �Լ�
	void openProc() {
		//	�츮�� ���� ����� ��Ʈ���� �̿��ؼ� ������ �ҷ��ͼ�
		//	�غ�� ����(TextArea)�� ����ϸ� �ȴ�.
		//	1.	Ȥ�� TextArea�� ���� ������ ������ �𸣹Ƿ�....
		//		������.
		area.setText("");
		FileInputStream	fin = null;
		try {
//			fin = new FileInputStream("D:\\��������\\Java\\0731����.txt");
			//	���� ���� ���� ��ȭ���ڸ� �̿��ؼ� 
			//	���ϴ� ������ �����ϵ��� �� �����̴�.
			//	1.	���� ���� ��ȭ���ڸ� ȭ�鿡 �������.
			//		1)	JFileChooser �� �����ϰ�
			JFileChooser	fc = new JFileChooser();
			//		2)	showXXX()�� �̿��ؼ� ȭ�鿡 ����Ѵ�.
			int	type = fc.showOpenDialog(frame);
			//			�߿�	??? �� �� ����
			//					�� ��ȭ���ڸ� ����ϱ� ���� �ƹ��� 
			//					�����̳ʸ� �Է��Ѵ�.(Frame)
			
			//	����	��ȯ���� �ǹ�
			//			�� ���� ���� ��ȭ���ڸ� �����ٵ�...
			//			��ȭ���ڸ� �ݰ��� ������ ������ ��ȯ�ȴ�.
			//		�� �߿��ϳ�
			//		������ ������ ������ ���� �۾� ������ �޶�����
			//		�����̴�.
			//			JFileChooser.CANCEL_OPTION		���
			//			JFileChooser.APPROVE_OPTION		����
			//			JFileChooser.ERROR_OPTION			x ����
			if(type != JFileChooser.APPROVE_OPTION) {
				//	�� ���� ���, x ���߸� �����ٴ� ���̹Ƿ�
				//	�ҷ����� �۾��� �ϸ� �ȵȴ�.
				return;	//	�Լ��� ���̻� �������� ���� ��������.
			}
			//	���� ����� ������ �Ѱ��̹Ƿ�
			//	1.	������ ������ �˾Ƴ���.
			File		file = fc.getSelectedFile();
			//	2.	��Ʈ�� ����
			fin = new FileInputStream(file);
			
			while(true) {
				byte[]	buff = new byte[256];
				int		len = fin.read(buff);
				if(len == -1) {
					break;
				}
				String str = new String(buff, 0, len);
				area.append(str);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				fin.close();
			}
			catch(Exception e) {}
		}
	}
	//	������ ���� ���� �Լ�
	void saveProc() {
		//	����
		//		1.	TextArea�� �Էµ� ������ �˾Ƴ���.
		String	data = area.getText();
		
		//		2.	�� ������ ��Ʈ���� �̿��ؼ� ���Ͽ� �����Ѵ�.
		FileOutputStream fout = null;
		try {
			//	���� ���� ��ȭ���ڸ� �̿��ؼ� ������ ���� �̸���
			//	�˾Ƴ��� �� �̸����� �����ϵ��� ����.
			//	1.	���� ���� ��ȭ���ڸ� ȭ�鿡 �����ش�.
			//		1)		new ��Ų��.
			JFileChooser		fc = new JFileChooser();
			//		2)		showXXX()�� �̿��ؼ� ����Ѵ�.
			int	type = fc.showSaveDialog(frame);
			//	�Ķ����		�ƹ��� �����̳�(�� ��ȭ���ڸ� 
			//					ȭ�鿡 ����ϱ� ���� ���� �����ϴ� ȭ��)
			//	��ȯ��		�� ��ȭ���ڰ� ȭ�鿡�� ������� ����
			//				��� ���߸� �̿��ؼ� ȭ�鿡�� �������
			//				�ߴ��� �� ������ ������ ��ȯ�ȴ�.
			//			JFileChooser.CANCEL_OPTION		���
			//			JFileChooser.APPROVE_OPTION		����
			//			JFileChooser.ERROR_OPTION			x ����
			if(type != JFileChooser.APPROVE_OPTION) {
				//	�̰��� �۾��� ����� ���̴�.
				//	�۾��� �����Ѵ�.
				return;
			}
			//	����� ���õǾ��µ���?
			//	������ ������ ������ �˾Ƴ���
			File		file = fc.getSelectedFile();
			
			//	������ ���Ϸ� ��Ʈ���� �����Ѵ�.
			fout = new FileOutputStream(file);
			
			//	byte[]�� ��ȯ�ؼ�
			byte[]	temp = data.getBytes();
			//	��Ʈ������ ����Ѵ�.
			fout.write(temp);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				fout.close();
			}
			catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new TextArea01();
	}
	//	���� �ΰ��� �̺�Ʈ�� �ɾ�� �Ѵ�.
	//	�̹����� Ŭ���� �Ѱ��� �̿��ؼ� �� ���� ��� ó���ϵ��� �Ѵ�.
	class MyEvent05 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//	�� �Լ��� JVM�� �̺�Ʈ�� �߻��ϸ� �ڵ� ȣ���ϴ� �Լ��̴�.
			//	�̶� JVM�� �߻��� �̺�Ʈ�� ������
			//	ActionEvent e���� �˷��ش�.
			//	��>		�̺�Ʈ�� �߻��� ��ǥ, ���콺 Ŭ�� ȸ��,..
			//	
			//	�׷��Ƿ� �츮�� �� ������ �м��ؼ� �̺�Ʈ�� �Ͼ
			//	��Ȳ�� �� �� �ְ� �ȴ�.
			//	���� �߿��� ��Ȳ		�̺�Ʈ�� �Ͼ ����
			//			�Լ�		getSource();
			JButton	target = (JButton) e.getSource();
			
			if(target == openB) {
				//	�������� Open ���߿��� �̺�Ʈ�� �Ͼ ���̴�.
				//	������ �� �����Ƿ�.... �Լ��� ���� ������.
				openProc();
			}
			else if(target == saveB) {
				//	�������� Save ���߿��� �̺�Ʈ�� �Ͼ ���̴�.
				saveProc();
				//	�Լ��� ��ġ�� ���� Ŭ������ �ڽŰ͵� ����ϰ�
				//	�ٱ��͵� ����� �� �����Ƿ�.. �ƹ����� ������...
			}
		}
	}
}





