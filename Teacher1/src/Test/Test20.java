package Test;
public class Test20 {
	public static void main(String[] args) {
		int[]	a = {1, 2, 3, 4, 5, 6};
		
		int	i = a.length  - 1;		//	i = 5;
		while(i >= 0) {
			System.out.println(a[i]);		//	i[5]		6		
											//	i[4]		5
											//	...
											//	i[0] 	1
			i--;								//	i = 0
		}

	}

}
