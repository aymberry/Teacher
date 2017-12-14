package P0712;

public class Test09 {

	public static void main(String[] args) {
		int	age = 0;
		
		try {
			age = -18;
			if(age < 0) {
				throw new Exception();
				//	나이가 음수면 JVM에게 에러로 인정해 달라고 부탁한다.
			}
		}
		catch(Exception e) {
			age = -age;
		}
		System.out.println("당신의 나이는 = " + age);
	}

}
