package P0725;

public class Test03 {

	public static void main(String[] args) {
		Sam031	s = new Sam031();
		s.abc();
	}
}

class Sam031 {
	Sam032		s2;
	void abc() {
		//	���� ������ Ŭ���������� ���߿� ������ Ŭ������ �׳�
		//	new ��Ų��.
		
		s2 = new Sam032(this);
		//	������ new ��Ű�鼭 �ڽ��� �ּҸ� �˷��ش�.
	}
}
class Sam032 {
	Sam031		s1;
	
	//	������ ������ ���� new ��ų�� �ڽ��� �ּҸ� �˷��ָ鼭 
	//	�����ϱ�� ��������Ƿ�...
	Sam032() {}
	//	���� �ּҸ� ���� �� �ִ� ������ �Լ��� �غ��Ѵ�. 
	Sam032(Sam031 temp) {
		//	�ڽ��� �غ��� ������ �Ѿ�� �ּҸ� ����Ѵ�.
		s1 = temp;
	}
	
}




