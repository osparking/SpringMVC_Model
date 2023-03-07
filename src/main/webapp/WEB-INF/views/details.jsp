<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>환영 페이지</title>
</head>
<body>
	<h2>GeeksforGeeks - 범타이거 공간 - 환영</h2>
	<h3>다음 상자를 채우시오</h3>
	<form:form action="submit" method="post" modelAttribute="detail">
		<table>
			<tr>
				<td><form:label path="name">이름: </form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="lang">코딩 언어: </form:label></td>
				<td><form:radiobutton path="lang" label="Java" value="Java"/>
				    <form:radiobutton path="lang" label="C 언어" value="C 언어"/>
				    <form:radiobutton path="lang" label="Python" value="Python"/></td>
			</tr>
			<tr>
				<td><form:label path="ide">개발 환경: </form:label></td>
				<td><form:select path="ide" items="${ideNames}" /></td>
			</tr>
			<tr>
				<td><form:button>저장</form:button></td>
			</tr>
		</table>
	</form:form>

</body>
</html>