package P0621;

public class Home01 {
	public static void main(String[] args) {
		int		num = 0;		//	더할 숫자
		int		hap = 0;		//	던한 결과를 기억할 숫자
		while(hap < 100000) {
			num++;		//	더할 숫자를 하나씩 증가하면서
			hap = hap + num;
		}
		System.out.println(num + "까지 더하면 결과 = " + hap);
	}
}
	