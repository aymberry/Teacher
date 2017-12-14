package Question;

public class Test001 {
	public static void main(String[] args) {
		char[][] star = {{'*', '*', ' ', ' ', ' '}, 
				{'*', '*', ' ', ' ', ' '}, 
				{'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}};
		char[][] start2 = new char[5][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++) {
				start2[j][3 - i] = star[i][j];
			}
		}

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(start2[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
