package P0614;

public class Test10 {

	public static void main(String[] args) {
		String	str = "Hello";
		int		num = 10;
		
		String	dap = str + num;
		//	���� �ϳ��� ���ڿ��̸� +�� �����ϴ�.
		//	�̷��� �ϸ� �ٸ� ���� �ڵ����� ���ڿ� ó���� �Ǿ
		//	���� ������ ����ȴ�.
		System.out.println(dap);
		System.out.println();
		
		String	a1 = false + "A";		//	falseA
		System.out.println(a1);
		String	a2 = "A" + 4 + 5;		//	A45
		System.out.println(a2);
		String	a3 =  4 + 5 + "A";	//	9A	
		System.out.println(a3);
	}

}
