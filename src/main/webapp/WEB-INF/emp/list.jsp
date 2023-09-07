<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<h1>Emp List</h1>
<hr>
<form action="/emp/list">
	<input type="text" name="search">
	<input type="submit" value="검색">
</form>
<hr>
<table border="1" width="800">
	<thead>
		<tr>
			<td>empno</td>
			<td>ename</td>
			<td>gender</td>
			<td>job</td>
			<td>mgr</td>
			<td>hiredate</td>
			<td>sal</td>
			<td>comm</td>
			<td>deptno</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="emp" items="${list}">
		<tr>
			<td>${emp.empno}</td>
			<td>${emp.ename}</td>
			<td>${emp.gender}</td>
			<td>${emp.job}</td>
			<td>${emp.mgr}</td>
			<td>${emp.hiredate}</td>
			<td>${emp.sal}</td>
			<td>${emp.comm}</td>
			<td>${emp.deptno}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>