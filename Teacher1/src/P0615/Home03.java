package P0615;

public class Home03 {

	public static void main(String[] args) {
		int		age = 34;
		
		String	result = (age >= 20) ? "성인" : 
					(age >= 0 && age < 20) ? "미성년" : "잘못 입력";

		System.out.println("당신은 " + result);
	}
}
