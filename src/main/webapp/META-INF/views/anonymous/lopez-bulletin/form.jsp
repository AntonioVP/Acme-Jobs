<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.lopez-bulletin.form.label.name" path="name"/>
	<acme:form-textarea code="anonymous.lopez-bulletin.form.label.text" path="text"/>
	<acme:form-textarea code="anonymous.lopez-bulletin.form.label.location" path="location"/>
	
	<acme:form-submit code="anonymous.lopez-bulletin.form.button.create" action="/anonymous/lopez-bulletin/create"/>
	<acme:form-return code="anonymous.lopez-bulletin.form.button.return"/>
</acme:form>