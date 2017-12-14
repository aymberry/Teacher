package P0614;

public class Home02 {

	public static void main(String[] args) {
		int		gab = 56827;
		
		int		man = gab / 10000;
		gab = gab - (man * 10000);
		int		chun = gab / 1000;
		gab = gab - (chun * 1000);
		int		bak = gab / 100;
		gab = gab - (bak * 100);
		int		sib = gab / 10;
		gab = gab - (sib * 10);
		int		il = gab / 1;		//	필요없지만....
		System.out.println("만원 = " + man);
		System.out.println("천원 = " + chun);
		System.out.println("백원 = " + bak);
		System.out.println("십원 = " + sib);
		System.out.println("일원 = " + il);
	}

}
