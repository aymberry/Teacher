<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/xml; charset=UTF-8" %>
 <%--	응답할 문서 
 		오늘은 Ajax로 문서를 요청하면 그 문서는 xml 파일로 만들어서
 		응답하기로 약속했다.
 		
 		이 문서 자체가 xml 문서로 탄생되어야 한다.
 		즉, 서버가 이 jsp 문서를 실행해서 결과를 xml 문서로 만들어야 한다.
 --%> 
<책정보>
	<책>
		<저자>홍길동</저자>
		<제목>자바의 정석</제목>
		<가격>28,000원</가격>
		<출판사>도우</출판사>
	</책>
	<책>
		<저자>박아지</저자>
		<제목>오라클</제목>
		<가격>27,000원</가격>
		<출판사>삼양</출판사>
	</책>
	<책>
		<저자>장독대</저자>
		<제목>JSP 배워라</제목>
		<가격>29,000원</가격>
		<출판사>이지스</출판사>
	</책>
</책정보>