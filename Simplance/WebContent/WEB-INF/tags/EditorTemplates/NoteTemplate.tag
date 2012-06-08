<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="note" type="entities.Note" %>

<fieldset>
	
	<legend>Note</legend>
	
	<div class="editor-field">
		<label>Date Created:</label>
		<input type="date" name="date" value="${note.date_Created}"/>		
	</div>
	<div class="editor-field">
		<label>Date Last Modified:</label>
		<input type="date" name="dlm" value="${note.date_Last_Modified}"/>		
	</div>
	<div class="editor-field">
		<label>Subject:</label>
		<input type="text" name="cell" value="${note.cell}"/>		
	</div>
	<div class="editor-field">
		<label>Body:</label>
		<textarea>${note.body }</textarea>	
	</div>
	
</fieldset>