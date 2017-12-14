package Test;

/* [숙제1]
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
	return year + " 학년 " + ban + " 반 " + no + " 번인 학생 " + name;
}
}

를 TreeSet에 입력할 때
1.	이것을 꺼낼때 반드시 이름 순서대로 꺼낼 수 있도록 하자.

2.	학년 순서대로 꺼내도록 하면 같은 학년이면 반 순서대로
꺼낼 수 있도록 정렬해보자.*/

import java.util.*;

public class Test21 {
public static void main(String[] args) {

	TreeSet set = new TreeSet(new MySort01());

	set.add(new Student01(2014, 3, 1, "프로이드"));
	set.add(new Student01(2015, 2, 2, "칼융"));
	set.add(new Student01(2015, 2, 1, "아들러"));
	set.add(new Student01(2016, 1, 2, "에릭슨"));
	set.add(new Student01(2014, 3, 2, "로저스"));

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
	return year + " 학년 " + ban + " 반 " + no + " 번인 학생 " + name;
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
