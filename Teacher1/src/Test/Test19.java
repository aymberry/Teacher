package Test;
public class Test19 {
	//m00-832-696
	public static void main(String[] args) {
		int	i = 0;
		for(  ; i < 5; i += 2) {	//	6 < 5
					//	i += 2		i = i + 2		i = 6
			
		}
		System.out.println(i);		//	i = 6
	}
}
