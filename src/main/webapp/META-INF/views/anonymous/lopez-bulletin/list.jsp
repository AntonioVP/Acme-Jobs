<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.lopez-bulletin.list.label.name" path="name" width="20%"/>
	<acme:list-column code="anonymous.lopez-bulletin.list.label.text" path="text" width="60%"/>
	<acme:list-column code="anonymous.lopez-bulletin.list.label.location" path="location" width="60%"/>
	<acme:list-column code="anonymous.lopez-bulletin.list.label.moment" path="moment" width="20%"/>
</acme:list>