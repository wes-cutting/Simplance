<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<c:url var="note" value="/UpdateNote" />
<form method="post" action="${note}">
<input type="hidden" name="id" value="${note.id }">
	<table>
		<tr>
			<td><h1>Subject</h1></td>
			<td><input type="text" name="subject" value="${note.subject}"> </td>
		</tr>
		<tr>
			<td>Body</td>
			<td><textarea name="body" value="${note.body}"></textarea></td>
		</tr>
		<tr>
			<td>Date Created</td>
			<td>${note.date_created}</td>
		</tr>
		<tr>
			<td>Date Last Modified</td>
			<td>${note.date_last_modified}</td>
		</tr>
	</table>
</form>
</body>
</html>