package Test;
public class Test17 {
	public static void main(String[] args) {
		int	x = 1, y = 10;
		do {
			if(x > y) {		//	6 > 5
				break;
			}
			y--;			//	y = 5
		}while(++x < 10);	//	x = 6 < 10		
		
		
	}
}
