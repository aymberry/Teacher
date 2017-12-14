package P0719;
import		java.util.*;
public class Tree02 {
	public static void main(String[] args) {
		TreeSet	set = new TreeSet(new MySort02());
		//	���� Student02 Ŭ������ �̸� ������� �����ϵ��� 
		//	��Ģ�� ���ߴµ�.... �̹���ŭ�� ����������� �����ϰ� �ʹ�.
		//	���� ��� Comparator�� �̿��� Ŭ������ �����
		//	�� Ŭ������ �˷��ָ� �ȴ�.
		
//		Student02.kind = 2;
		set.add(new Student02("ȫ�浿", 200));
		set.add(new Student02("�ھ���", 210));
		set.add(new Student02("�嵶��", 198));
		set.add(new Student02("�̱���", 222));
		set.add(new Student02("������", 201));
		//	TreeSet�� �����͸� �Է��ϸ� �� �����͸� �����͸� 
		//	�������� �ؼ� �����Ѵ�.
		//	����
		//	���� ���� Ŭ������ ������ �������� ���������� ������ �ʾҴ�.
		//	�׷��� ������ �߻��� ���̴�.
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Student02	s = (Student02) iter.next();
			System.out.println(s);
		}
	
	}
}

class Student02 implements Comparable {
	String	name;
	int		total;
	//	�ʿ��� �������� ���� ������ �����ϰ��� �Ѵ�.
	//	���ı����� ������ ������ ���س���
//	static int kind;		//	���	1	�̸�, 2		����
	Student02() {}
	Student02(String n, int t) {
		name = n;
		total = t;
	}
	
	public String toString() {
		return "�̸� = " + name + " �̰� ���� = " + total;
	}
	
	public int compareTo(Object o) {
		//	�� �Լ��� �����ͷ� ����ϴ� Ŭ������ ��� �Լ��� �Ǿ���.
		//	this	�� ù��° �����Ͱ� ������
		//	o		�� �ι�° �����Ͱ� ���´�.
		
		//	���� ������ ���ϴ� ��Ģ�� ������ �����ϴ�.
		Student02	temp = (Student02) o;
		
		int		result = 0;
//		if(kind == 1) {
			result = this.name.compareTo(temp.name);
//		}
//		else if(kind == 2) {
//			result = this.total - temp.total;
//		}
		return result;
	}
}

class MySort02 implements Comparator {
	public int compare(Object o1, Object o2) {
		Student02	temp1 = (Student02) o1;
		Student02	temp2 = (Student02) o2;
		
		int		r = temp1.total - temp2.total;
		return r;
	}
}






