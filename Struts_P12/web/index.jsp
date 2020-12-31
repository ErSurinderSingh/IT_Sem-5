<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="register">
<s:textfield name="roll" label="Enrollment No"></s:textfield>
<s:textfield name="contact" label="Contact No"></s:textfield>
<s:textfield name="s_name" label="Name"></s:textfield>
<s:textfield name="dob" label="Date of Birth"></s:textfield>
<s:submit value="register"></s:submit>

</s:form>