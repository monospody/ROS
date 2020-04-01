
<%--
  Created by IntelliJ IDEA.
  User: martindolinsky
  Date: 26/03/2020
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Restaurants list</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
	<h1>RESTAURANTS</h1>

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
						<td>${tempRes.restaurantPhoneNumber}</td>
						<td>
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this restaurant ?'))) return false">Delete</a>
						</td>
					</tr>
				</tbody>
				</c:forEach>

			</table>
		</div>
	</div>

</body>
</html>
