<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="sale" type="entities.Sale"%>

<fieldset>

	<legend>Sale</legend>

	<div class="editor-field">
		<label>Term Number:</label>
		<input type="number" name="term" value="${sale.term}" />
	</div>
	<div class="editor-field">
		<label>Premium Number:</label>
		<input type="text" name="pnum" value="${sale.premiumNumber}" />
	</div>
	<div class="editor-field">
		<label>Monthly Premium:</label>
		$<input type="number" name="mprem" value="${sale.monthlyPremium}" />
	</div>
	<div class="editor-field">
		<label>Monthly Commission:</label>
		$<input type="number" name="commission" value="${sale.commision}" />
	</div>
	<div class="editor-field">
		<label>Date Created:</label>
		<input type="text" name="comments" value="${sale.comments}" />
	</div>

</fieldset>