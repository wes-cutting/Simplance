<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="policy" type="entities.Insurance_Policy"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<fieldset>

	<legend>Insurance Policy</legend>

	<div class="editor-field">
		<label>Insurance Policy Name:</label> <input type="text"
			name="policyname" value="${policy.name}" />
	</div>
	<div class="editor-field">
		<label>Description:</label> <input type="text" name="desc"
			value="${policy.description}" />
	</div>
	<div class="editor-field">
		<label>Date Created:</label> <input type="text" name="date"
			value="${note.date_Created}" />
	</div>
	<div>
		<select name="carrier">
			<c:forEach items="${policy.carrier }" var="c">
				<c:url value="${c.id }" var="cid" />
				<option value="${cid}">${c.name }</option>
			</c:forEach>
		</select>
	</div>
</fieldset>