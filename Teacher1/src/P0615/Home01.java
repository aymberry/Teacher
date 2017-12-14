package P0615;

public class Home01 {

	public static void main(String[] args) {
		char	ch = 'f';
		
		char	result = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : (char)(ch - 32);
		
		System.out.println("°á°ú = " + result);

	}

}
