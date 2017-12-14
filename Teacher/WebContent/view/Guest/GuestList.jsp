<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<title>jQuery Mobile</title>
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.0/jquery.mobile-1.0.min.css" />
	<script src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.0/jquery.mobile-1.0.min.js"></script>
</head>
<script>
	$(document).ready(function(){
		$("#wBtn").click(function(){
			$title = $("#title").val();
			if($title == "") {
				return;
			}
			$("#wfrm").submit();
			$("#title").val("");
			$("#body").val("");
		});
	});
</script>
<body>
	<div data-role="page" id="page1" data-position="fixed">
		<div data-role="header">
			<h1>방명록</h1>
			<a href="#wform"  data-icon="grid">글쓰기</a>
		</div>
		<div data-role="content">
<c:forEach var="data" items="${LIST}">
			<div data-role="collapsible" data-content-theme="e">
				<h3>${data.title}</h3>
				<p>${data.brbody}</p>
			</div>
</c:forEach>
		</div>
	</div>
	<div data-role="page" id="wform">
		<div data-role="header">
			<a href="#" data-rel="back" data-icon="home">목록보기</a>
			<h1>방명록 쓰기</h1>
		</div>
		<div data-role="content">
			<form method="get" action="../Guest/GuestWrite.dol" id="wfrm">
				<a href="#" id="wBtn" data-role="button" data-inline="true" data-icon="check">글쓰기</a>
				<label for="title">제목</label>
				<input type="text" name="title" id="title">
				<label for="body">내용</label>
				<textarea name="body" id="body" style="height:300px"></textarea>
			</form>
		</div>
	</div>
</body>
</html>
