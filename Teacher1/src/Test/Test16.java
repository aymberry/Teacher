package Test;
public class Test16 {
	public static void main(String[] args) {
		int x = 0, y = 5;
		tp:
		for( ; ;) {		//	무한루프
			x++;		//	x = 1
			for( ; ; )	{
				if(x > --y) {		//	1 > 4	NO
									//	1 > 3	NO
									//	1 > 2	NO
									//	1 > 1	NO
									//	1 > 0	YES
					break tp;	//	바깥  for로 나가세요.
				}
			}
		}
		System.out.println(x);
		System.out.println(y);
	}

}
