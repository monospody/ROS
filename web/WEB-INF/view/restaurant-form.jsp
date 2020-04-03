<%--
  Created by IntelliJ IDEA.
  User: martindolinsky
  Date: 27/03/2020
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
	<h2>Add Restaurant</h2>

	<form:form action="processAddRestaurantForm" modelAttribute="restaurant" method="post">

		<form:hidden path="restaurantId"/>

		<label>Name</label>
		<form:input path="restaurantName"/>
		<form:errors path="restaurantName" cssClass="error"/>
		<br>
		<label>Address</label>
		<form:input path="restaurantAddress"/>
		<form:errors path="restaurantAddress" cssClass="error"/>
		<br>
		<label>City</label>
		<form:input path="restaurantCity"/>
		<form:errors path="restaurantCity" cssClass="error"/>
		<br>
		<label>Number of tables</label>
		<form:input path="restaurantTables"/>
		<form:errors path="restaurantTables" cssClass="error"/>
		<br>
		<label>Capacity</label>
		<form:input path="restaurantCapacity"/>
		<form:errors path="restaurantCapacity" cssClass="error"/>
		<br>
		<input type="submit" value="Submit">
	</form:form>

	<hr>
	<a href="${pageContext.request.contextPath}/restaurant/list">Back to list</a>
</body>
</html>
