package P0703;

public class Test01 {
	public static void main(String[] args) {
		Sam01		s1 = new Sam01();
		Sam01		s2 = new Sam01();
		Sam01		s3 = new Sam01();
	
		s1.setNum(5);
		s2.setNum(10);
		s3.setNum(15);
		s1.display();	//	5
		s2.display();	//	10
		s3.display();	//	15
	
	}
}

class Sam01 {
	int		num;
	
	void setNum(/*Sam01 this */int a) {
		/*this.*/num = a;
		
	}
	
	void display(/*Sam01 this */) {
		System.out.println(/*this.*/num);
	}
}