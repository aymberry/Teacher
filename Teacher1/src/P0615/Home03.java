package P0615;

public class Home03 {

	public static void main(String[] args) {
		int		age = 34;
		
		String	result = (age >= 20) ? "����" : 
					(age >= 0 && age < 20) ? "�̼���" : "�߸� �Է�";

		System.out.println("����� " + result);
	}
}
