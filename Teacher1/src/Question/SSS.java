package Question;

public class SSS {

	public static void main(String[] args) {
		int x = 0, y = 5;
		a:
		for(; ;) {
			x++;
			for(; ;) {
				if(x > --y) {
					break a;
				}
			}
		}
		System.out.println();
	}
}
