<%@ taglib uri="/struts-tags" prefix="s" %>

<h3>All Records:</h3>
<s:iterator  value="list">
<fieldset>
<s:property value="roll"/><br/>
<s:property value="name"/><br/>
<s:property value="Dob"/><br/>
<s:property value="contact"/><br/>
</fieldset>
</s:iterator>