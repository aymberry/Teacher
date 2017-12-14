<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
$(document).ready(function(){

	$("#btn").click(function(){
		$.ajax({
			url : 'Test012.jsp',
			data : "temp=" + new Date(),
			dataType : 'json',
			type : 'GET',
			success : function(data) {
				var first = data.friend;
//				alert(first)
				var	friends = data.friends;
				//	이 변수에는 리스트가 기억된다.
//				var	a = friends[0];
//				alert(a);

				$.each(friends, function(index, item) {
					alert(item);
				});
			},
			error : function() {
				alert("나오지마");
			}
		});
	});
	
	
});
</script>

<body>
 	<input type="button" id="btn" value="눌러">
 	<div id="result"></div> 
</body>
</html>
