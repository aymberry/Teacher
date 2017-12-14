package Question;
public class Test072501 {
	Sub01		s1;
	Sub02		s2;
	public Test072501() {
		s1 = new Sub01(this);
		s2 = new Sub02(this);
	}
	public static void main(String[] args) {
		new Test072501();
	}
}

class Sub01 {
	Test072501	main;
	Sub011			s11;
	public Sub01(){}
	public Sub01(Test072501 temp) {
		main = temp;
		s11 = new Sub011(this);
	}
}
class Sub011 {
	Sub01		main;
	public Sub011(){}
	public Sub011(Sub01 temp) {
		main = temp;
	}
}
class Sub02 {
	Test072501	main;
	Sub021			s21;
	public Sub02(){}
	public Sub02(Test072501 temp) {
		main = temp;
		s21 = new Sub021(this);
	}
}
class Sub021 {
	Sub02		main;
	public Sub021(){}
	public Sub021(Sub02 temp) {
		main = temp;
	}
}
