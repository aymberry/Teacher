package VO;
/*
 * 	�����͸� ����ϱ� ���ؼ� ����� ���� Ŭ����
 * 
 * 	��Ģ�� �ʿ��� ������ ����� ������ ������ָ� �ȴ�.
 */
public class MemberVO {
	//	���� �Ϻη� private�� ������ �������.
	//	������ ������ ����ϴ� �߿��� ��Ȱ�� �ϹǷ� �Ϲ������δ�
	//	�����Ű�� �ʵ��� �Ѵ�.
	//	�ٸ� ����ڰ� ���� ������ �����͸� �Է����� ���ϵ��� �����Ѵ�.
	//	�̷� �۾�			"����ȭ" �Ѵ� ��� ǥ���Ѵ�.
	private	String		id;
	private	String		pw;
	private	String		nick;
	//	��� �Լ��� �̿��ؼ� �����͸� ������ �� �ִ� ���� ����� ������
	//	����ڴ� ������ ���� �Է��ϴ� ��ſ� �Լ��� �̿��ؼ�
	//	�Է�(���)�ϵ��� ��ġ�� ���־�� �Ѵ�.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
//	public void setId(String temp) {
		//	�� �κп��� ������ ó���� �� �����Ƿ�
		//	�������� ������ �˻��� �� �ֱ� �����̴�.
//		this.id = temp;
//	}
//	public String getId() {
//		return this.id;
//	}

	
	
}



