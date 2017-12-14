package P0630;

public class Test08 {
	public static void main(String[] args) {
		//	어디서 데이터를 구했는데 그 데이터가 byte[]로 되었더라.
		//	이것을 어떻게 문자열로 만들어서 사용할까?
		byte[] arr = {'H', 'o', 'n', 'g'};
		
		String	str = new String(arr);
		System.out.println(str);
	}

}
