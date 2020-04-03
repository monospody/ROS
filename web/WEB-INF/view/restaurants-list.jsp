
<%--
  Created by IntelliJ IDEA.
  User: martindolinsky
  Date: 26/03/2020
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Restaurants list</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>RESTAURANTS</h2>
		</div>
<%--		<form:form action="search" method="get">--%>
<%--			Search :--%>
<%--			<input type="text" name="word">--%>
<%--			<input type="submit" value="Submit" class="add-button">--%>
<%--		</form:form>--%>

<%--		<form:form action="searchByCity" modelAttribute="restaurants" method="get">--%>
<%--			<label for="cities" class="reservationLabel">Vyber mesto:</label><br>--%>
<%--			<select id="cities" class="reservationInput" name="city">--%>
<%--				<option value="kosice" selected>Košice</option>--%>
<%--				<option value="bratislava">Bratislava</option>--%>
<%--				<option value="presov">Prešov</option>--%>
<%--				<option value="poprad">Poprad</option>--%>
<%--			</select>--%>
<%--			<input type="submit" value="Submit" class="add-button">--%>
<%--		</form:form>--%>
		</div>



	<div id="container">
		<div id="content">
			<input type="button" value="Add restaurant" onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button">
			<table>
				<thead>
				<tr>
					<th>ID</th>
					<th>Owner ID</th>
					<th>Name</th>
					<th>Tables</th>
					<th>Capacity</th>
					<th>Address</th>
					<th>City</th>
					<th>Phone number</th>
					<th>Action</th>
				</tr>
				</thead>

				<c:forEach var="tempRes" items="${restaurants}">

					<c:url var="updateLink" value="/restaurant/showUpdateRestaurantForm">
						<c:param name="restaurantId" value="${tempRes.restaurantId}"/>
					</c:url>
					<c:url var="deleteLink" value="/restaurant/deleteRestaurant">
						<c:param name="restaurantId" value="${tempRes.restaurantId}"/>
					</c:url>
				<tbody>
					<tr>
						<td>${tempRes.restaurantId}</td>
						<td>${tempRes.restaurantOwnerId}</td>
						<td>${tempRes.restaurantName}</td>
						<td>${tempRes.restaurantTables}</td>
						<td>${tempRes.restaurantCapacity}</td>
						<td>${tempRes.restaurantAddress}</td>
						<td>${tempRes.restaurantCity}</td>
						<td>${tempRes.restaurantPhoneNumber}</td>
						<td>
							<a style="text-decoration: none;" href="${updateLink}">Update</a>
							|
							<a style="text-decoration: none;" href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this restaurant ?'))) return false">Delete</a>
						</td>
					</tr>
				</tbody>
				</c:forEach>

			</table>
		</div>
	</div>

</body>
</html>
