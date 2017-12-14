package P0719;
import		java.util.*;
public class Tree03 {
	public static void main(String[] args) {
		TreeSet	set = new TreeSet();
		
		set.add(new Circle03(7));
		set.add(new Circle03(6));
		set.add(new Circle03(2));
		set.add(new Circle03(8));
		set.add(new Circle03(4));
		
		ArrayList	list = new ArrayList(set);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

class Circle03 implements Comparable {
	int			radius;
	float		ground;
	float		area;
	public Circle03() {}
	public Circle03(int r) {
		radius = r;
		ground = (float)(r * 2 * Math.PI);
		area = (float)(r * r* Math.PI);
	}
	//	��������  �� Ŭ������ �ּҸ� ����ϸ�...	HashCode�� ��µǹǷ�..
	//	���ʿ��Ұ� ����.
	//	���� ���� ���ϴ� ������ �˷��ְ� �ʹ�.
	
	public String toString() {
		return "������ = " + radius + " �ѷ� = " + ground + " ���� = " + area; 
	}
	
	public int compareTo(Object o) {
		//	this		���� ù��° �����Ͱ� ������
		//	o			���� �ι�° �����Ͱ� ������
		System.out.println(" �� �ڵ� ����Ǵ� ������ ��¥��");
		Circle03	temp = (Circle03) o;
		
		int	result = this.radius - temp.radius;
		
		return -result;
	}
}








