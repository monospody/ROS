<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: martindolinsky
  Date: 23/04/2020
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="sk">

<head>
	<meta charset="UTF-8">
	<title>ROS</title>
	<link rel="icon" href="../../resources/img/icon.png">
	<link href="../../resources/css/style.css" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="systemCompany">

<div class="wrapMenu">
	<nav class="menu">
		<ul class="ulMenu">
			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Upozornenia</p>
					<div class="picMessage"></div>
				</a>
			</li>

			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Pripnuté objednávky</p>
					<div class="picPinned"></div>
				</a>
			</li>

			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Dnešné objednávky</p>
					<div class="picOrders"></div>
				</a>
			</li>

			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Kalendár</p>
					<div class="picCalendar"></div>
				</a>
			</li>

			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Týždenná obsadenosť</p>
					<div class="picWeekly"></div>
				</a>
			</li>

			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Jedálny lístok</p>
					<div class="picMenu"></div>
				</a>
			</li>

			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Reštaurácia</p>
					<div class="picRestaurant"></div>
				</a>
			</li>
			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Reštaurácia</p>
					<div class="picRestaurant"></div>
				</a>
			</li>
			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Reštaurácia</p>
					<div class="picRestaurant"></div>
				</a>
			</li>
			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Reštaurácia</p>
					<div class="picRestaurant"></div>
				</a>
			</li>
			</li>
			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Reštaurácia</p>
					<div class="picRestaurant"></div>
				</a>
			</li>
			<li class="liMenu">
				<a class="aMenu" href="#">
					<p class="menuText">Reštaurácia</p>
					<div class="picRestaurant"></div>
				</a>
			</li>

		</ul>
	</nav>
</div>

<section class="wrap">
	<div class="categoryHeader">
		<h4 class="categoryText">Údaje o reštaurácií</h4>
		<div class="categoryNumbers">
			<p class="categoryNumber numberColor">1</p>
			<p class="categoryNumber">2</p>
			<p class="categoryNumber">3</p>
			<p class="categoryNumber">4</p>
			<p class="categoryNumber">5</p>
			<p class="categoryNumber">6</p>
		</div>
	</div>

	<div class="aboutRestaurantOne">

		<div class="aboutRestaurantWrap">
			<div class="aboutRestaurantInputs">
			<form:form action="registerRestaurant" modelAttribute="restaurant">


				<label class="aboutRestaurantLabel">Meno reštaurácie :</label>
				<br>
				<form:input path="restaurantName" cssClass="aboutRestaurantInput" />
				<br>
				<label class="aboutRestaurantLabel">Adresa reštaurácie :</label>
				<br>
				<form:input path="restaurantAddress" cssClass="aboutRestaurantInput" />
				<br>
				<label class="aboutRestaurantLabel">Vyberte mesto :</label>
				<br>
				<form:input path="restaurantCity" cssClass="aboutRestaurantInput" />
				<br>
				<label class="aboutRestaurantLabel">Telefónne číslo :</label>
				<br>
				<form:input path="restaurantPhoneNumber" cssClass="aboutRestaurantInput" />


			</div>
			<div class="textAboutRestaurant">
				<label class="aboutRestaurantLabel">
					Informácie o reštaurácií :
				</label>
				<br>
				<form:textarea path="restaurantAboutRestaurant" cssClass="aboutRestaurantTextArea" />
			</form:form>
			</div>
		</div>

	</div>

	<div class="categoryHeader">
		<p class="next2">Ďalej</p>
	</div>
</section>



<script src="../../resources/js/app.js"></script>
</body>
</html>
