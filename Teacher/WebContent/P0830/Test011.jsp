<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#btn").click(function(){
			$.ajax({
				url : 'Test012.jsp',
				dataType : 'xml',
				type : 'GET',
				success : function(data) {
					//	응답받은 내용중에서 책이라는 태그는 몇개인지
					//	알아보자.
//					var	books = $(data).find("책");
//					var	len = $(books).length;
//					alert(len);

					//	첫번째 책의 제목을 알아보자.
//					var	title = $(books).eq(0).find("제목");
//					var	t = $(title).text();
//					alert(t);
					
					//	두번째 책의 저자를 알아보자.
//					var	a = $(books).eq(1).find("저자").text();
//					alert(a);

					//	우리는 응답 받은 데이터를 이쁘게 테이블로
					//	만들어서 원하는 위치에 출력하고자 한다.
					//	xml, Json은 데이터만 오기때문에
					//	자바스크립트에서 html을 만들어서 사용해야 한다.

					//	1.	책을 알아낸다.
					var	books = $(data).find("책");
					//	2.	이 3개의 책을 반복하도록 한다.
					var	result = "<table width='800' align='center' border='1'>";
					$(books).each(function(){
						//	이 안에는 1번부터 한권씩 this 변수에 자동
						//	저장되면서 반복하게 된다.
						//	저자
						var	writer = $(this).find("저자").text();
						var	title = $(this).find("제목").text();
						var	price = $(this).find("가격").text();
						var	pub = $(this).find("출판사").text();
						result += "<tr>";
						result += "<td>" + writer + "</td>";
						result += "<td>" + title + "</td>";
						result += "<td>" + price + "</td>";
						result += "<td>" + pub + "</td>";
						result += "</tr>";
					});
					result = result + "</table>";

					$("#result").html(result);



				},
				error : function() {
					alert("나오지 마라 제발");
				}
			});
		});
	});
</script>
<body>
 <%--	Ajax로 요청할 문서 --%> 
 	<input type="button" id="btn" value="눌러봐"><br>
 	<div id="result">결과가 여기에 나온다.</div>
</body>
</html>

