<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="phone" required = "false" type="entities.Phone" %>

<fieldset>

	<legend>Phone Numbers</legend>
	
	<div class="editor-field">
		<label>Cell Phone Number:</label>
		<input type="text" name="cell" value="${phone.cell}"/>		
	</div>
	<div class="editor-field">
		<label>Home Phone Number:</label>
		<input type="text" name="home" value="${phone.home}"/>		
	</div>
	<div class="editor-field">
		<label>Work Phone Number:</label>
		<input type="text" name="work" value="${phone.work}"/>		
	</div>
	<div class="editor-field">
		<label>Work Phone Extension:</label>
		<input type="text" name="ext" value="${phone.work_ext}"/>		
	</div>
	
</fieldset>

