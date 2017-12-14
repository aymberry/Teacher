package P0713;
public class Object02 {
	public static void main(String[] args) {
		Sam02		s = new Sam02();
		//	주소를 한번 출력해 보고
		System.out.println(s);
		//	toString의 결과를 출력한다.
		String	temp = s.toString();
		System.out.println(temp);
		
		//	두 결과는 동일하다.
		//	왜냐하면 내부적으로  toString를 이용하기 때문이다.
	}
}

class Sam02 {
	
}