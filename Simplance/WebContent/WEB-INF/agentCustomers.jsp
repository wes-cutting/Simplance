<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agent's Customers</title>
</head>
<body>
	<div>
		<table cellpadding="5">
			<tr>
				<th>Name</th>
				<th>BirthDate</th>
				<th>Policy #</th>
			</tr>
			<c:forEach var="customer" items="${agentCustomers}">
				<tr>
					<c:url value="/GetCustomer" var="get">
						<c:param name="id" value="${customer.id }" />
					</c:url>
					<td><a href="${get}">${customer.fullname }</a></td>
					<td>${customer.birthday }</td>
					<td>${customer.policy.name }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>