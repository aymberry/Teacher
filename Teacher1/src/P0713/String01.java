package P0713;
public class String01 {
	public static void main(String[] args) {
		//	���α׷� �����ϱ� ���� �޸� ���¸� �˾ƺ���.
		//	�̶� ����ϴ� Ŭ������ Runtime Ŭ�����ε�....
		//	new�� ��ų �� ����.
		//	��� �����Լ��� ã�Ƽ� ������.
		Runtime	run = Runtime.getRuntime();
		long	size = run.freeMemory();
		System.out.println("������ = " + size);
				
		//	���� String Ŭ������ �����͸� 1000�� �����غ���.
		//	��������� ���ؼ� 1000�� �����ϸ� 1000�� �޸� �Ҵ���
		//	�Ͼ�� ������ �����ʹ� Heap �����̹Ƿ� ��� �����ϰ�
		//	�ִ�.
//		String	temp = "����";
//		for(int i = 0; i < 100000; i++) {
//			temp = temp + "�̱���";
//		}
		
		StringBuffer	temp = new StringBuffer("����");
		for(int i = 0; i < 10000; i++) {
			temp = temp.append("�̱���");
		}
		//	���� 1000�� ��ȭ�� ����Ų �� �޸� ���¸� �ٽ� ��������.
		size = run.freeMemory();
		System.out.println("������ = " + size);
		
	}
}




