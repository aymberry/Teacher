package P0707;
public class Test01 {
	public static void main(String[] args) {
//		Father01	f = new Son01();
//		//	���۷����� Father�� �ǰ� �ν��Ͻ��� Son�� �ȴ�.
//		Grand01	g = (Grand01) f;
//		//	���۷����� Grand�� �ǰ� �ν��Ͻ��� Son�� �ȴ�.
//	
//		g.abc();
		//	���� Ŭ����(Grand)�� ������ ����ϴ� �ν��Ͻ��� ����(Son)
		//	�̹Ƿ� �ƹ������ ����.
		
		Grand01	g = new Grand01();
		//	���۷����� Grand�̰� �ν��Ͻ��� Grand�̴�.
		Father01	f = (Father01) g;
		//	���۷����� Father�̰� �ν��Ͻ��� Grand�̴�.
		f.abc();
	}
}

class Grand01 {
	void abc() {
		int	 num = 5;
		this.xyz(num);
	}
	void xyz(int a) {
		
	}
}
class Father01 extends Grand01 {
	void abc() {
		
	}
}
class Son01 extends Father01 {
	void xyz() {
		
	}
}