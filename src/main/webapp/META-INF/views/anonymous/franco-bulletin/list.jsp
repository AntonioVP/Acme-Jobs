<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.francoBulletin.list.label.date" path="fecha" width="20%"/>
	<acme:list-column code="anonymous.francoBulletin.list.label.author" path="author" width="20%"/>
	<acme:list-column code="anonymous.francoBulletin.list.label.text" path="text" width="20%"/>
	<acme:list-column code="anonymous.francoBulletin.list.label.summary" path="summary" width="40%"/>
</acme:list>
