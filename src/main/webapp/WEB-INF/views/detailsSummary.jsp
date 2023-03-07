<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내용 요약</title>
</head>
<body>
	<h3>제출된 내용</h3>
	<table>
		<tr>
			<td>이름:</td>
			<td>${detail.name}</td>
		</tr>
		<tr>
			<td>코딩 언어:</td>
			<td>${detail.lang}</td>
		</tr>
		<tr>
			<td>개발 환경:</td>
			<td>${detail.ide}</td>
		</tr>
	</table>
</body>
</html>
