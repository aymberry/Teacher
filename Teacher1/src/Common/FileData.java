package Common;
/*
 * 	지금 만들어주는 데이터 클래스는 하나의 파일을 업로드 하던지
 * 	하나의 파일을 다운로드할 목적으로 사용하는 클래스이다.
 * 
 */
public class FileData {
	//	파일이름을 기억할 변수
	//	이것을 주는 이유는 상대방이 같은 이름으로 저장하기를 바래서....
	public String		fileName;
	//	파일의 내용을 기억할 변수
	//	==>		즉, 업로드 다운로드는 파일의 내용을 서로 주면서 해결하는 것이다.	
	public byte[]		buff;


	//	이부분은 원래 업로드를 원하는 부분에서 처리할 내용....
	//	참고	이것은 클라이언트가 서버에게 파일을 업로드하는
	//			부분을 가정한 것이다.
	public void sendFile() {
		//	1.	업로드할 파일의 이름을 알아낸다.
		//	2.	그 이름을 이용해서 File 정보를 만든다.
		//	3.	이 정보를 이용해서 업로드할 파일의 크기를 알아낸다.
		FileData	data = new FileData();
		data.fileName = "알아낸 파일이름";
		//	data.buff = new byte[알아낸크기];
		//	4.	파일 스트림을 생성해서
		//	5.	fs.read(data.buff);
		
		
		//	서버 입장에서는
		//	1.	데이터 받고 프로토콜이 파일 업로드이면.....
		//	2.	같이온 파일 이름을 이용해서 파일 스트림 만들고
		//	예>	FileOuputStream fout = new FileOutputStream("파일이름");
		//	3.	이 스트림으로 같이온 파일 내용을 저장하면 된다.
		//	예>		fout.write(data.buff);

		
		
		
	}
	
	
	
	
	
	
	
}




