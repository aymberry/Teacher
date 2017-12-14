package P0825;

public class TestVO {
	public String name;
	public String title;
	public int		hit;
	//	�ſ� �߿�	�ڡڡڡ�
	//	���� JSTL�� ����ؼ� ó���ϰ��� �ϸ� 
	//	VO Ŭ������ �ݵ�� getXXX()�� ������ �־�� �Ѵ�.
	//	�� �Լ��� ������ JSTL �̿��ؼ��� ����� ����� �� ����.
	
	//	GET �Լ��� ����� ���
	//		1.	get���� �����Ѵ�.
	//		2.	�Լ��̸��� ����.
	//			�̶� ù���ڴ� �빮�ڷ� ���� �������ʹ� ������� ����.
	//		3.	JSTL���� ����� ��쿡��
	//			get �� ������ ������ �Լ� �̸��� �̿��Ѵ�.
	//			�� ��쿡�� ù���ڴ� �ҹ��ڷ� ���� 
	//			�������ʹ� �Լ� �̸��� �״�� ����.
	public String getUserName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	public String getAll() {
		return name + "���� " + title + "�� ��µ� ��ȸ���� " + hit + "�Դϴ�.";
	}

	//	���� JSTL�� ����
	//	������ ������� �ʰ� get �Լ��� ����Կ� �־ ����
	//		�����͸� �����ؼ� ����� �� �ִ�.
	
	public String getUname() {
		return name + "�� ����";
	}
	
	//	�츮�� �Խ��� ��Ϻ��⸦ ����ٰ� ġ��....
	public String getUtitle() {
		if(title.length() > 10) {
			return title.substring(0, 10) + "...";
		}
		else {
			return title;
		}
	}
	
	//		�̸�(name)�� ����� ��....
	//		ù���ڸ� ����ϰ� ������ ���ڴ� **�� ���߾ ����ϰ� �ʹٸ�...
	public String getHname() {
		String	first = name.substring(0, 1);
		String	last = name.substring(1);
		String	temp = "";
		for(int i = 0; i < last.length(); i++) {
			temp = temp + "*";
		}
		
		return first + temp;
		
	}

	
	
}


