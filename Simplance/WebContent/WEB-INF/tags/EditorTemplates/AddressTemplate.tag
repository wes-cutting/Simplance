<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="address" type="entities.Address" required="false" %>

<fieldset>

	<legend>Address</legend>
	
	<div class="editor-field">
		<label>Street Address:</label>
		<input type="text" name="street" value="${address.streetAddress}"/>		
	</div>
	<div class="editor-field">
		<label>City: </label>
		<input type="text" name="city" value="${address.city}"/>		
	</div>
	<div class="editor-field">
		<label>State:</label>
		<input type="text" name="state" value="${address.state}"/>		
	</div>
	<div class="editor-field">
		<label>ZIP-Code:</label>
		<input type="text" name="zip" value="${address.zip}"/>		
	</div>
	<div class="editor-field">
		<label>Cell Phone Number:</label>
		<input type="text" name="cell" value="${phone.cell}"/>		
	</div>
	
</fieldset>
