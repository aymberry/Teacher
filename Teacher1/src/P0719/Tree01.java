package P0719;
import		java.util.*;
public class Tree01 {
	public static void main(String[] args) {
		TreeSet	set = new TreeSet();
		set.add("ȫ�浿");
		set.add("�ھ���");
		set.add("�嵶��");
		set.add("�̱���");
		set.add("������");

		Iterator	iter = set.iterator();
		while(iter.hasNext()) {
			String name = (String) iter.next();
			System.out.println(name);
		}
		
		
		
		
	}

}
