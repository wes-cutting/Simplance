<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="carrier" type="entities.Insurance_Carrier" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<fieldset>

	<legend>Insurance Carrier</legend>
	
		<div class="editor-field">
		<label>Company Name:</label>
		<input type="text" name="cname" value="${carrier.name}"/>		
	</div>
		<div class="editor-field">
		<label>State:</label>
		<select name=" state">
		<c:forEach items="${DropDownLists.states }" var="state"></c:forEach>
			<option value="${state }"/>
		</select>
	</div>
		<div class="editor-field">
		<label>Contact Number:</label>
		<input type="text" name="number" value="${carrier.contact_Number}"/>
	</div>

</fieldset>
