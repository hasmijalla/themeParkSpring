<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Page</title>
<style type="text/css">
.error{
color: red;
}
</style>
</head>
<body bgcolor="lightblue">
	<center>

		<h1 style="color:blue">Book A ticket</h1>
		<form:form method="POST" action="booktickets.html"
			modelAttribute="obj">

			<table>

				<tr>

					<td>Ride Name:</td>
					<td><form:select path="rideName">
							<form:options items="${rideList}"/>

						</form:select></td>

				</tr>
				<tr>

					<td>Show Name:</td>
					<td><form:select path="showName">
							<form:options items="${showList}" />
						</form:select></td>
				</tr>

				<tr>
					<td>Is Camera Included</td>
					<td><form:radiobutton path="isCameraIncluded" value="yes"
							label="Yes" /> <form:radiobutton path="isCameraIncluded"
							value="no" label="No" /></td>

				</tr>

				<tr>
					<td>No of Tickets</td>
					<td><form:input path="noOfTickets" type="text" /></td>
					<td><form:errors path="noOfTickets" cssClass="error"></form:errors> </td>
				</tr>

			</table>
			<input type="submit" value="Book">
			<br>
			<a href="index.jsp">Home</a>
			
		</form:form>
	</center>
</body>
</html>