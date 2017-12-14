<%@ page contentType="text/plain; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
	오늘은 중 카테고리를 JSON 방식으로 응답하고자 한다
	
	{"cates" : [
		{"code" : "M001L001", "name" : "화일"},
		{"code" : "M001L002", "name" : "디스크"},
		{"code" : "M001L003", "name" : "마우스"}
	] }
--%>
{ "cates" : [
	<c:forEach var="data" items="${MCATE}" varStatus="st">
		<c:if test="${st.last eq false}">
		{"code" : "${data.code}", "name" : "${data.name}"} ,
		</c:if>
		<c:if test="${st.last eq true}">
		{"code" : "${data.code}", "name" : "${data.name}"}
		</c:if>
	</c:forEach>
]}






