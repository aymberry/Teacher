<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<%--	첫번째 콤보상자에서 다른 항목을 선택하는 순간
			$(콤보상자).change(function(){})		이벤트이다.

		Ajax를 이용해서 중 카테고리를 보내달라고 요청하고
		
		응답받은 문서를 두번째 콤보상자에 표시하면 된다.
 --%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		//	파라메터는 콤보상자 중에서 선택한 항목의 value값이다.
		//		콤보상자에서 선택한 항목을 알아내는 방법
		//		$(콤보상자 option:selected).val();
		$("#lcate").change(function(){
			var	code = $("#lcate option:selected").val();
			$.ajax({
				//	요청의 주인만 다른뿐 요청하는 방식이나
				//	처리 방식은 동일하다.
				url : '../Ajax/MCategory.sun',
				data : 'lcate=' + code,
				dataType : 'json', 
//				dataType : 'xml',
				type : 'GET',
//	JSON 방식 응답시 처리 방식				
				success : function(data) {
					//	응답된 문서를 콤보상자에 넣어보자
					//	1.	기존의 내용을 지우자
					$("#mcate").find("option").remove();
					//	2.	첫줄은 강제로 입력하자.
					$("#mcate").append("<option value='0'>===선택하세요</option>");
					
					//	3.	도착한 JSON 문서를 분석해서 항목을 채우자.
					//		1)	배열을 꺼낸다.
					var	cates = data.cates;
					//		2)	배열을 반복하면서 실제 항목을 꺼내자.
					$.each(cates, function(index, item){
						//	한줄의 내용중 code, name을 꺼내자.
						var	code = item.code;
						var	name = item.name;
						var	option = "<option value='" + code + "'>" + name + "</option>";
						$("#mcate").append(option);
					});
				},
//	xml 응답시 처리 방식				
//				success : function(data) {
					//	이 친구가 응답을 받는 친구이다.
					//	여기서 응답 받은 문서를 강제로 실행시켜 주어야 한다.
					
					//	우리가 할 일은
					//	두번째 콤보상자에 항목을 추가시켜 주어야 한다.
					//	꼭 알아야 함수들
					//		현재 콤보상자에 있는 모든 항목 삭제하기
					//		$(콤보상자).find("option").remove();
					
					//		새로운 옵션 추가하기
					//		$(콤보상자).append(옵션내용);
					
					//	1.	기존의 내용을 삭제하자.
//					$("#mcate").find("option").remove();
					//	2.	강제로 첫줄을 만들어보자.
//					$("#mcate").append("<option value='0'>====선택하세요 ====</option>");
					
					//	3.	도착한 xml 문서중에서 <category> 태그를 찾는다.
//					var	categorys = $(data).find("category");
					//	이것이 여러개 있을 수 있으므로 반복하면서
					//	한개씩 꺼내자
//					$(categorys).each(function(){
//						var	code = $(this).find("code").text();
//						var	name = $(this).find("name").text();
						
//						var	option = "<option value='" + code + "'>" + name + "</option>";
//						$("#mcate").append(option);
//					});
//				},
				error : function() {
					alert("프리즈 나오지 마세요");	
				}
			});
		});
	});
</script>



<body>
<%--	오늘은 콤보상자 두개만 만들어서 테스트 해보자 --%>
	<table width="600" border="1" align="center">
		<tr>
			<td align="center">
				<select id="lcate" style="width:200px">
					<option value="0">===선택하세요===</option>
<c:forEach var="data" items="${LCATE}">
					<option value="${data.code}">${data.name}</option>
</c:forEach>					
				</select>
				<select id="mcate" style="width:200px">
					<option value="0">===선택하세요===</option>
				</select>
			</td>	
		</tr>
	</table>
</body>
</html>





