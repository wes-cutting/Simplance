<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="phone" type="entities.Phone" required="true" %>


<fieldset>

	<legend>Phone</legend>

	<div class="editor-field">
		<label>Cell Phone Number:</label>
		<label>${phone.cell}</label>
	</div>
	<div class="editor-field">
		<label>Home Phone Number:</label>
		<label>${phone.home}</label>		
	</div>
	<div class="editor-field">
		<label>Work Phone Number:</label>
		<label>${phone.work }</label>		
	</div>
	<div class="editor-field">
		<label>Work Phone Extension:</label>
		<label>${phone.work_ext }</label>		
	</div>

</fieldset>