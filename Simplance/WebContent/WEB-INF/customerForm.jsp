<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags/EditorTemplates" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
<c:url var="customer" value="/UpdateCustomer" />
<form method="post" action="${customer }">
<input type="hidden" name="id" value="${customer.id }">
<table>
	<tr>
		<td>Last Name</td>
		<td><input type="text" name="lastName" value="${customer.lastname }"></td>
	</tr>
	<tr>
		<td>First Name</td>
		<td><input type="text" name="firstname" value="${customer.firstname }"></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><input type="text" name="gender" value="${customer.gender }"></td>
	</tr>
	<tr>
		<td>Birth Date</td>
		<td><input type="text" name="birthday" value="${customer.birthday }"></td>
	</tr>
	<tr>
		<td>Address</td>
		<z:AddressTemplate address="${customer.address }"></z:AddressTemplate>
	</tr>
	<tr>
		<td>Phone</td>
		<z:PhoneTemplate phone="${customer.phone }"></z:PhoneTemplate>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" name="email" value="${customer.email }"></td>
	</tr>
	<tr>
		<td>Marital Status</td>
		<td>
			<select name="maritalstatus">
				<option ${customer.marital_status eq 'Single' ? 'selected' : '' } >Single</option>
				<option ${customer.marital_status eq 'Married' ? 'selected' : '' } >Married</option>
				<option ${customer.marital_status eq 'Divorced' ? 'selected' : '' } >Divorced</option>
				<option ${customer.marital_status eq 'Widowed' ? 'selected' : '' } >Widowed</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Smoker</td>
		<td><input type="checkbox" name="issmoker" value="${customer.issmoker }"></td>
	</tr>
	<tr>
		<td>Active</td>
		<td><input type="checkbox" name="isactive" value="${customer.isactive}"></td>
	</tr>
	<tr>
		<td>Contracted</td>
		<td><input type="checkbox" name="iscontracted" value="${customer.iscontracted }"></td>
	</tr>
	<tr>
		<td>First Contact Date</td>
		<td><input type="text" name="firstcontactdate" value="${customer.first_contact_date }"></td>
	</tr>
	<tr>
		<td>Insurance Policy</td>
		<td><input type="text" name="insurancepolicy" value="${customer.policy }"></td>
	</tr>
	<tr>
		<td>Agent</td>
		<td><input type="text" name="agent" value="${customer.agent }"></td>
	</tr>
	<tr>
		<td>Sale</td>
		<td><input type="text" name="sale" value="${customer.sale }"></td>
	</tr>
	<tr>
		<ul>
			<c:forEach var="note" items="${customer.notes}">
					<c:url value="/GetNote" var="get">
						<c:param name="id" value="${note.id }" />
					</c:url>
					<li><a href="${get}">${note.subject}</a></li>
			</c:forEach>
		</ul>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Change Customer" name="update">
			<input type="submit" value="Create Customer" name="create">
		</td>
	</tr>
</table>
</form>
</body>
</html>