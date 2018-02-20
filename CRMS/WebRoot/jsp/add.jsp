<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>add</title>
	</head>
	<body>
	<form action="add.action" method="post">
		<table align="center" border="1" bgcolor="lightgreen">
			<tr>
				<th>
					化学试剂名称
				</th>
				<td>
					<input name="dname" />
				</td>
			</tr>
			<tr>
				<th>
					化学试剂产地
				</th>
				<td>
					<input name="addr" />
				</td>
			</tr>
			<tr>
				<th>
					化学试剂描述
				</th>
				<td>
					<input name="ddesc" />
				</td>
			</tr>
			<tr>
				<th align="left">
					化学试剂类型编号
				</th>
				<td>
					<select name="tid">
					<c:forEach var="type" items="${types}">
				<option value="${type.tid}">${type.tname}</option>
					
					</c:forEach>
					</select>
				</td>
			</tr>
			<tr><td><input type="submit" value="添加"/></td></tr>
			
		</table>
		</form>
	</body>
</html>
