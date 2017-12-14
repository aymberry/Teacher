package P0721;

enum Sort { 내림차순, 오름차순 }

public class Test09 {

	public static void main(String[] args) {
		MyClass09		my = new MyClass09();
		my.sort = Sort.내림차순;
		
		switch(my.sort) {
		case 내림차순 :
			//
			break;
		case 오름차순 :
			//
			break;
		
		}

	}
}

class MyClass09 {
	//	이 클래스가 학생 성적을 관리하는 클래스인데....
	//	이 학생의 출력 순서를 내림, 오름	중 하나로 결정하고자 한다.
	Sort	sort;
	
	
	
}