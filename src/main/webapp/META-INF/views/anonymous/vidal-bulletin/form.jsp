<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-select code="anonymous.vidalBulletin.form.label.type" path="type">
		<acme:form-option code="anonymous.vidalBulletin.form.label.type.academic" value="ACADEMIC"/>
		<acme:form-option code="anonymous.vidalBulletin.form.label.type.scientific" value="SCIENTIFIC"/>
		<acme:form-option code="anonymous.vidalBulletin.form.label.type.other" value="OTHER"/>
	</acme:form-select>
	<acme:form-textbox code="anonymous.vidalBulletin.form.label.title" path="title"/>
	<acme:form-textbox code="anonymous.vidalBulletin.form.label.author" path="author"/>
	<acme:form-textarea code="anonymous.vidalBulletin.form.label.text" path="text"/>
	
	<acme:form-submit code="anonymous.vidalBulletin.form.button.create" action="/anonymous/vidal-bulletin/create"/>
	<acme:form-return code="anonymous.vidalBulletin.form.button.return"/>
</acme:form>