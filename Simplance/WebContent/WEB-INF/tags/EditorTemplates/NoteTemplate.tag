<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="note" type="entities.Note" %>

<fieldset>
	
	<legend>Note</legend>
	
	<div class="editor-field">
		<label>Date Created:</label>
		<input type="text" name="date" value="${note.date_Created}"/>		
	</div><div class="editor-field">
		<label>Cell Phone Number:</label>
		<input type="text" name="cell" value="${phone.cell}"/>		
	</div><div class="editor-field">
		<label>Cell Phone Number:</label>
		<input type="text" name="cell" value="${phone.cell}"/>		
	</div><div class="editor-field">
		<label>Cell Phone Number:</label>
		<input type="text" name="cell" value="${phone.cell}"/>		
	</div>
	
</fieldset>