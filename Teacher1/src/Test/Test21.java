package Test;

/* [����1]
class Student?? {
int		year;
int		ban;
int		no;
String	name;
Student??() {}
Student??(int y, int b, int n, String irum) {
	year = y;
	ban = b;
	no = n;
	name = irum;
}

public String toString() {
	return year + " �г� " + ban + " �� " + no + " ���� �л� " + name;
}
}

�� TreeSet�� �Է��� ��
1.	�̰��� ������ �ݵ�� �̸� ������� ���� �� �ֵ��� ����.

2.	�г� ������� �������� �ϸ� ���� �г��̸� �� �������
���� �� �ֵ��� �����غ���.*/

import java.util.*;

public class Test21 {
public static void main(String[] args) {

	TreeSet set = new TreeSet(new MySort01());

	set.add(new Student01(2014, 3, 1, "�����̵�"));
	set.add(new Student01(2015, 2, 2, "Į��"));
	set.add(new Student01(2015, 2, 1, "�Ƶ鷯"));
	set.add(new Student01(2016, 1, 2, "������"));
	set.add(new Student01(2014, 3, 2, "������"));

	Iterator iter = set.iterator();

	while (iter.hasNext()) {
		Student01 s = (Student01) iter.next();
		System.out.println(s);
	}
}
}

class Student01 implements Comparable {
int year;
int ban;
int no;
String name;

Student01() {
}

Student01(int y, int b, int n, String irum) {
	year = y;
	ban = b;
	no = n;
	name = irum;
}

public String toString() {
	return year + " �г� " + ban + " �� " + no + " ���� �л� " + name;
}

public int compareTo(Object o) {

	Student01 temp = (Student01) o;

	int result = 0;
	result = this.name.compareTo(temp.name);
	return result;
}
}

class MySort01 implements Comparator {
public int compare(Object o1, Object o2) {
	Student01 temp1 = (Student01) o1;
	Student01 temp2 = (Student01) o2;

	int temp = temp1.year - temp2.year;

	if (temp == 0) {
		temp = temp1.ban - temp2.ban;
	}
	if (temp == 0) {
		temp = temp1.no - temp2.no;
	}
	
	System.out.println(temp);
	return temp;
}
}
