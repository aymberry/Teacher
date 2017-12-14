package P0712;

public class Test08 {
	static void abc() {
		xyz();
	}
	static void xyz() {
		int	a = 10;
		int	b = 0;
		int	c;
		try {
			c = a / b;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		lmn();

	}
	static void lmn() {
		abc();
	}
}
