<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="sk">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ROS</title>
<%--
	<link rel="icon" href="obr/icon.png">
    <link href="style.css" rel="stylesheet">
--%>
	<link rel="icon" href="${pageContext.request.contextPath}/resources/img/icon.png">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/merge-style.css?v=1"/>
</head>
<body class="homepageCustomer">
<div class="leftWall"></div>

<!--
< HOME PAGE
-->
<div class="wrapHomePage">
	<header>
		<div class="logo"></div>
		<div class="wrapLoginForms">
			<input type="button" class="loginButton" onClick="loginWindow()" value="Prihlásiť sa">
			<p class="txt">alebo</p>
			<input type="button" class="registerButton" onClick="registerHubWindow()" value="Registrovať sa">
		</div>
	</header>

	<article>
		<div class="iconRestaurant"></div>
		<h1>Online rezervácia</h1>
		<p class="h1">vo Vaších reštauráciach</p>
		<hr>
	</article>

	<section class="findRestaurant">
		<input type="button" class="findRestaurantButton" value="Nájdi svoju reštauráciu">
	</section>
</div>

<!--
> HOME PAGE
-->

<!--
< LOGIN LOGOUT
-->

	<section id="login">
		<div id="exit" onClick="exit()">X</div>
		<p class="loginHead">Prihlásenie</p>
		<form class="login">

		<div class="loginWrap">
			<label class="loginLabel">Meno alebo e-mailová adresa :</label><br>
			<input class="loginInput" type="text"><br>
			<label class="loginLabel">Heslo :</label><br>
			<input class="loginInput" type="password"><br>
		</div>
			<input class="loginSubmit" type="submit" value="Prihlásiť sa">
		</form>
	</section>

	<section id="registerHub">
		<div id="exit" onClick="exit()">X</div>

		<p class="registerHubHead">Registrovať sa</p>
		<div class="leftReg">
			<p class="regText" onClick="registerCustomer()">Ako zákazník</p>
		</div>

		<div class="rightReg">
			<p class="regText" onClick="registerCompany()">Ako firma</p>
		</div>
	</section>


	<section id="registerCustomer">
		<div id="exit" onClick="exit()">X</div>
		<p class="loginHead">Registrácia zákazníka</p>

		<form:form cssClass="registerCustomer" action="customer/processAddCustomerForm" modelAttribute="customer" method="post">
			<div class="regWrapLeft">
				<label class="regLabel">Meno :</label><br>
				<form:input cssClass="regInput" path="customerFirstName"/>

				<label class="regLabel">Priezvisko :</label><br>
				<form:input cssClass="regInput" path="customerLastName"/>

				<label class="regLabel">E-mailová adresa :</label><br>
				<form:input cssClass="regInput" path="customerEmail"/>
			</div>
			<div class="regWrapRight">

				<label class="regLabel">Telefónne číslo :</label><br>
				<form:input cssClass="regInput" path="customerPhone"/>

				<label class="regLabel">Heslo :</label><br>
				<form:input cssClass="regInput" path="customerPassword"/>

				<label class="regLabel">Potvrdenie hesla :</label><br>
				<form:input cssClass="regInput" path="customerCheckPassword"/>
			</div>
			<input class="regSubmit" type="submit" value="Registrovať sa">
		</form:form>


	</section>


	<section id="registerCompany">
		<div id="exit" onClick="exit()">X</div>
		<p class="loginHead">Registrácia firmy</p>
		<form class="registerCompany" >
		<div class="regWrapLeft">
			<label class="regLabel">Meno :</label><br>
			<input class="regInput" type="text"><br>

			<label class="regLabel">Priezvisko :</label><br>
			<input class="regInput" type="text"><br>

			<label class="regLabel">E-mailová adresa :</label><br>
			<input class="regInput" type="text"><br>

		</div>
		<div class="regWrapRight">

			<label class="regLabel">Telefónne číslo :</label><br>
			<input class="regInput" type="text"><br>

			<label class="regLabel">Heslo :</label><br>
			<input class="regInput" type="password"><br>

			<label class="regLabel">Potvrdenie hesla :</label><br>
			<input class="regInput" type="password"><br>
		</div>
			<div class="inv" onClick="registerCompanyNext()">
				<input class="regSubmit" type="submit" value="Ďalej" disabled="disabled">
			</div>
		</form>
	</section>


	<section id="registerCompanyNext">
		<div id="exit" onClick="exit()">X</div>
		<p class="loginHead">Registrácia zamestnancov</p>
		<form class="registerCompanyNext">
		<div class="regWrapLeft">
			<label class="regLabel">Zamestnanec č.1 :</label><br>
			<input class="regInput" type="text" placeholder="E-mailová adresa zamestnanca"><br>

			<label class="regLabel">Čašník</label>
			<input type="checkbox">
			<label class="regLabel">Kuchyňa</label>
			<input type="checkbox">
			<label class="regLabel">Majiteľ</label>
			<input type="checkbox">

			<br><br>

			<label class="regLabel">Zamestnanec č.2 :</label><br>
			<input class="regInput" type="text" placeholder="E-mailová adresa zamestnanca"><br>

			<label class="regLabel">Čašník</label>
			<input type="checkbox">
			<label class="regLabel">Kuchyňa</label>
			<input type="checkbox">
			<label class="regLabel">Majiteľ</label>
			<input type="checkbox">


		</div>
		<div class="regWrapRight">

			<label class="regLabel">Zamestnanec č.3 :</label><br>
			<input class="regInput" type="text" placeholder="E-mailová adresa zamestnanca"><br>

			<label class="regLabel">Čašník</label>
			<input type="checkbox">
			<label class="regLabel">Kuchyňa</label>
			<input type="checkbox">
			<label class="regLabel">Majiteľ</label>
			<input type="checkbox">

			<br><br>

			<label class="regLabel">Zamestnanec č.4 :</label><br>
			<input class="regInput" type="text" placeholder="E-mailová adresa zamestnanca"><br>

			<label class="regLabel">Čašník</label>
			<input type="checkbox">
			<label class="regLabel">Kuchyňa</label>
			<input type="checkbox">
			<label class="regLabel">Majiteľ</label>
			<input type="checkbox">

		</div>

			<div class="inv" onClick="registerCompanyNext2()">
				<input class="regSubmit" type="submit" value="Ďalej" disabled="disabled">
			</div>

		</form>
	</section>





	<section id="registerCompanyNext2">
		<div id="exit" onClick="exit()">X</div>
		<p class="loginHead">Ďakujeme za Vašu registráciu</p>
		<form class="registerCompanyNext2">
			<p class="regLabel">O ďalšom postupe Vás budeme informovať e-mailom</p>

			<div class="inv" onClick="exit()">
				<input class="regSubmit" type="submit" value="OK" disabled="disabled">
			</div>

		</form>
	</section>

	<section id="reservation">
			<h3>Rezervácia</h3>
	<div class="wrapWholeForm">
		<div class="wrapFirstForm">
			<div class="wrapFormReservation">

				<form:form action="restaurant/searchByCity" modelAttribute="restaurants" method="get">
					<label for="cities" class="reservationLabel">Vyber mesto:</label><br>
					<select id="cities" class="reservationInput" name="city">

						<c:forEach var="city" items="${cities}">
							<option value="${city.toString()}" selected>${city.toString()}</option>
						</c:forEach>

					</select>
					</div>

						<div class="wrapFormReservation">
							<label for="sort" class="reservationLabel">Zoradiť podľa:</label><br>
							<select id="sort" class="reservationInput">
							  <option value="abecedne">abecedne</option>
							  <option value="ceny">ceny</option>
							  <option value="hodnotenia">hodnotenia</option>
							</select>
						</div>

						<div class="wrapFormReservation">
							<label class="reservationLabel">Dátum:</label><br>
							<input type="date" class="reservationInput">
						</div>

						<div class="wrapFormReservation">
							<label for="time" class="reservationLabel">Čas:</label><br>
							<select id="time" class="reservationInput">
							  <option value="rano" selected>ráno</option>
							  <option value="doobedu">doobedu</option>
							  <option value="naobed">na obed</option>
							  <option value="poobede">poobede</option>
							  <option value="vecer">večer</option>
							</select>
						</div>

						<div class="wrapFormReservationCheckBox">
							<input type="checkbox" onchange="clickCheckBoxReservation()"><p class="optionText">Skryté možnosti</p>
						</div>

						<div class="wrapFormReservationSubmit">
							<input type="submit" class="reservationSubmit" value="OK">
						</div>

						<br>
						<br>

					</div>

					<div class="wrapSecondForm" id="visibleForm">
						<div class="wrapFormReservation">
							<label for="filter" class="reservationLabel">Filter:</label><br>
							<select id="filter" class="reservationInput">
							  <option value="sdetmi" selected>s detmi</option>
							  <option value="skocikom">s kocikom</option>
							  <option value="wifi">wifi</option>
							  <option value="romantika">romantika</option>
							</select>
						</div>
					<div class="wrapFormReservation">

					<label class="reservationLabel">Hľadať:</label><br>
					<input type="text" name="word" class="reservationInputSearch">
				</form:form>
			</div>
		</div>
	</div>


	<div class="wrapRestaurants">

		<c:forEach var="restaurant" items="${restaurants}">

			<section class="infoRestaurant">
				<div class="peopleAndPriceSpace"></div>

				<div class="groupPeople">
					<c:forEach begin="0" end="${restaurant.visitors}" varStatus="loop">
						<div class="person"></div>
					</c:forEach>
				</div>

				<div class="groupPrice">
					<c:forEach begin="0" end="${restaurant.priceRange}" varStatus="loop">
						<div class="price"></div>
					</c:forEach>
				</div>
				<p class="nameRestaurant"><c:out value="${restaurant.restaurantName}"/></p>

				<div class="whiteWrap">

					<div class="logoRestaurant" style="background-image: url(${pageContext.request.contextPath}${restaurant.logo})"></div>

					<c:if test="${restaurant.averageRating <= 1}">
						<div class="groupStars">
							<div class="star staryellow"></div>
							<div class="star"></div>
							<div class="star"></div>
						</div>
					</c:if>

					<c:if test="${restaurant.averageRating <= 2 && restaurant.averageRating > 1}">
						<div class="groupStars">
							<div class="star staryellow"></div>
							<div class="star staryellow"></div>
							<div class="star"></div>
						</div>
					</c:if>

					<c:if test="${restaurant.averageRating > 2}">
						<div class="groupStars">
							<div class="star staryellow"></div>
							<div class="star staryellow"></div>
							<div class="star staryellow"></div>
						</div>
					</c:if>

					<p class="percent">${restaurant.percentageRating}%</p>

					 <div class="groupCircles">

						<div class="circle circlegreen">
						</div>
						<div class="circle">
						</div>
						<div class="circle">
						</div>
						<div class="circle">
						</div>

					</div>

				</div>

				<div class="cyanWrap">
					<p class="chooseText">VYBRAŤ</p>
					<p class="fromPrice">od <c:out value="${restaurant.minPriceOrder}"/>€</p>
				</div>

			</section>

		</c:forEach>

	</div>









<!--
LOGIN LOGOUT >
-->



<div class="rightWall"></div>


    <script src="${pageContext.request.contextPath}/resources/js/app.js"></script>
</body>
</html>
