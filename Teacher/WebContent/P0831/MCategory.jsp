<?xml version="1.0" encoding="UTF-8" ?>
<%--
	중카테고리를 응답할 예정이다.
	이번에는 xml 파일로 응답해보고자 한다.
	
	xml 파일이 되기 위해서는
	1.	반드시 첫번째 줄에는 헤더가 존재해야 한다.
	2.	반드시 루트 태그가 딱 한개 존재해야 한다.
	3.	모든 정보는 태그로 이루어져야 한다.
	
	오늘은
		<categorys>
			<category>
				<code>L001M001</code>
				<name>???용품</name>
			</category>
			<category>
				<code>L001M001</code>
				<name>???용품</name>
			</category>
			<category>
				<code>L001M001</code>
				<name>???용품</name>
			</category>
		</categorys>
		
	의 형태를 만들어서 응답할 예정이다.
--%>
<%@ page contentType="text/xml; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<categorys>
	<c:forEach var="data" items="${MCATE}">
		<category>
			<code>${data.code}</code>
			<name>${data.name}</name>
		</category>
	</c:forEach>
</categorys>
