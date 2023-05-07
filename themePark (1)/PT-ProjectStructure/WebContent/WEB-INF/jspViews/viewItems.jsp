<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
h2{
color=blue;
}
</style>
</head>
<body bgcolor="lightblue">
	<center>
	<h2 style="color:blue">Ride Details</h2>
	<table border="1px solid" >
	<c:forEach var="item" items="${rideListobj}">
	<tr>
	<td>${item.key}</td>
	<td>${item.value}</td>
	</tr>
	</c:forEach>
	</table>
		<h2 style="color:blue">Show Details</h2>
	<table  border="1px solid">
	<c:forEach var="item" items="${showListobj}">
	<tr>
	<td>${item.key}</td>
	<td>${item.value}</td>
	</tr>
	</c:forEach>
	</table>
	<a href="index.jsp">Home</a>
	</center>
</body>
</html>