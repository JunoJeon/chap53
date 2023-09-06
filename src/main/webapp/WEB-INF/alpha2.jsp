<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>alpha.jsp</title>
<style type="text/css">

</style>
</head>
<body>
<h1>Alpha Form 실습</h1>
<hr>
<form action="/alpha2">
	<fieldset>
		<legend>Position</legend>
		<label>line</label>
		<input name="line" type="number" value="${empty param.line ? ' ' : param.line}" min="1" max="20">
		<label>column</label>
		<input name="column" type="number" value="${empty param.column ? ' ' : param.column}" min="1" max="40">
	</fieldset>
	
	<fieldset>
		<legend>Character</legend>
		<c:forEach var="ch" items="${chs}">
			<label>${ch}</label>
			<c:choose>
				<c:when test="${empty param.ch and ch == 'A'}">
					<input name="ch" type="radio" value="${ch}" checked="checked">
				</c:when>
				<c:when test="${!empty param.ch and param.ch == ch}">
					<input name="ch" type="radio" value="${ch}" checked="checked">
				</c:when>
				<c:otherwise>
					<input name="ch" type="radio" value="${ch}">
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</fieldset>
	
	<fieldset>
		<legend>Color</legend>
			<label>FG</label>
			<select>
				<c:forEach var="color" items="${colors}">
					<option value="${color}">${color}</option>
				</c:forEach>
			</select>
			<label>BG</label>
			<select>
				<c:forEach var="color" items="${colors}">
					<option value="${color}">${color}</option>
				</c:forEach>
			</select>
	</fieldset>
	
	<input type="submit" value="select">
</form>
<hr>
<table>
	<tbody>
	<c:forEach var="row" items="${alphas}">
		<tr>
			<c:forEach var="alpha" items="${row}"> 
			<td style="color:${alpha.fg}; background:${alpha.bg}">${alpha.ch}</td>
			</c:forEach>
		</tr>
	</c:forEach>
	</tbody>
</table>
<hr>
</body>
</html>