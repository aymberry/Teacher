package P0712;

public class Test09 {

	public static void main(String[] args) {
		int	age = 0;
		
		try {
			age = -18;
			if(age < 0) {
				throw new Exception();
				//	���̰� ������ JVM���� ������ ������ �޶�� ��Ź�Ѵ�.
			}
		}
		catch(Exception e) {
			age = -age;
		}
		System.out.println("����� ���̴� = " + age);
	}

}
