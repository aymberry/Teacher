package Test;
import		java.util.*;
public class Test072101 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		set.add(new SaGak02(5, 6));
		set.add(new SaGak02(6, 1));
		set.add(new SaGak02(7, 3));
		set.add(new SaGak02(4, 2));
		set.add(new SaGak02(3, 5));
		set.add(new SaGak02(6, 3));
		set.add(new SaGak02(5, 5));
		set.add(new SaGak02(6, 9));
		set.add(new SaGak02(3, 7));
		set.add(new SaGak02(7, 3));

//		TreeSet	aSet = (TreeSet) set.headSet(new SaGak02(4, 5));
//		TreeSet	aSet = (TreeSet) set.tailSet(new SaGak02(4, 5));
		
		SaGak02 temp1 = new SaGak02();
		temp1.area = 10;
		SaGak02 temp2 = new SaGak02();
		temp2.area = 30;
		
		TreeSet	aSet = (TreeSet) set.subSet(temp1, temp2);
		Iterator iter = aSet.iterator();

		while (iter.hasNext()) {
			SaGak02 s = (SaGak02) iter.next();
			System.out.println(s);
		}
		

	}
}

class SaGak02 implements Comparable {
	int garo;
	int sero;
	int area;

	SaGak02() {
	}

	SaGak02(int g, int s) {
		garo = g;
		sero = s;
		area = garo * sero;
	}
	
	int Area02(int g, int s) {
		garo = g;
		sero = s;
		area = garo * sero;
		
		return area;
	}

	public String toString() {
		return "가로 = " + garo + " 세로 = " + sero + " 면적 = " + area;
	}

	public int compareTo(Object o) {

		SaGak02 temp = (SaGak02) o;

		int result = 0;
		result = this.area - temp.area;

		return result;
	}
}

