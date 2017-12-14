<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
<script>
	var	newKind = 0;
	$(document).ready(function() {
		$("#postcodify_search_button").postcodifyPopUp();
		$("#news").click(function() {
			
			newKind = newKind + 1;
			if(newKind == 7) {
				newKind = 1;
			}
			
			//	Ajax 기법으로 뉴스좀 보내달라고 서버에게 부탁하자.
			//	파라메터는 보고싶은 뉴스의 번호를 제공하기로 하자.
			$.ajax({
//				url : 'Test022.jsp',
//				data : 'kind=' + newKind,
				url : 'http://biz.epost.go.kr/openapi',
				data : 'regkey=test&target=postRoad&query=세종로 17',
				dataType : 'xml',
				type : 'GET',
				success : function(data){
					alert(data);
//					$("#result").html(data);
				},
				error : function(a, b, c) {
					alert("나오지 마" + a.status);
				}
			});
		});
	});
</script>
<body>
<%--	이 문서 역시 다음의 메인 페이지라고 가정하자. 
		단추를 누르면 한종류의 뉴스가 나와서 화면을 바꾸도록 해보자.
--%>
<button id="postcodify_search_button">검색</button><br />
		<input type="button" id="news" value="뉴스보기">
		<div id="result"></div>
<%--	옆에 원래는 다른 내용도 만들어서 뉴스만 바뀐다는 사실을
		보여주어야 하는데.... 착한사람 눈에는 옆에 내용이 있다는 사실이 보인다.
--%>		
		
		
</body>
</html>



