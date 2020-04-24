<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: martindolinsky
  Date: 6/04/2020
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="sk">

<head>
	<meta charset="UTF-8">
	<title>ROS</title>
	<link rel="icon" href="${pageContext.request.contextPath}/resources/img/icon.png">
<%--	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/merge-style.css?v=1"/>--%>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>
		body {
			background-color: gray;
		}
	</style>
</head>
<body class="reservation">

<div class="leftWallReservation"></div>
<div class="rightWallReservation"></div>

<div class="wrapReservation">
	<div class="logoBottom"></div>
	<h2>Rezervácia</h2>
<form:form cssClass="reservationForm" action="processAddReservationForm" modelAttribute="order" method="post">
		<div class="wrapReservationContainers">
			<div class="reservationNameRestaurant">Geronimo Express</div>

			<div class="reservationContainer">
				<label class="reservationDate">
					Dátum:
				</label>
				<form:input path="orderDateDate" type="date" cssClass="reservationInputDate"/>
			</div>

			<div class="reservationContainer2">
				<label for="reservationFrom" class="reservationDate">
					Od:
				</label>
				<form:input path="orderFromHour" type="number" min="7" max="22" value="7" cssClass="reservationInput"/>
				<p class="reservationColon">:</p>
				<form:select path="orderFromMinute" id="reservationFrom" cssClass="reservationSelect">
					<form:option value="00" />
					<form:option value="10" />
					<form:option value="20" />
					<form:option value="30" />
					<form:option value="40" />
					<form:option value="50" />
				</form:select>
			</div>

			<div class="reservationContainer2">
				<label for="reservationTo" class="reservationDate">
					Do:
				</label>
				<form:input path="orderToHour" type="number" min="7" max="22" value="7" cssClass="reservationInput"/>
				<p class="reservationColon">:</p>

				<form:select path="orderToMinute" id="reservationTo" cssClass="reservationSelect">
					<form:option value="00" />
					<form:option value="10" />
					<form:option value="20" />
					<form:option value="30" />
					<form:option value="40" />
					<form:option value="50" />
				</form:select>
			</div>
			<p class="reservationInfo">V prípade predĺženia rezervácie na mieste je nutné kontaktovať personál.</p>
		</div>

		<section class="reservationTable">
			<p class="reservationTableText">Vyberte si stôl a počet osôb:</p>

			<div class="wrapGridTableInfo">
				<div class="reservationGrid">
					<div class="wrapLines">
						<div class="line">
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>
						<div class="line">

							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>

						<div class="line">

							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>
						<div class="line">

							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>

						<div class="line">

							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>
						<div class="line">

							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>
						<div class="line">

							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>
						<div class="line">

							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>
						<div class="line">

							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>
						<div class="line">

							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<label class="container">
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
						</div>
					</div>



				</div>

				<div class="reservationTableInfo">
					<div class="reservationChoose">
						<p class="reservationChooseText">Stôl :</p>
						<p class="reservationTableName">H1</p><br>
						<p class="reservationChooseText">Osoby :</p>
						<input type="number" value="5" class="reservationChooseInput">
					</div>
					<div class="reservationLegendTables">

						<div class="blueCircle"></div>
						<p class="reservationLegendText">voľný stôl</p>


						<div class="redCircle"></div>
						<p class="reservationLegendText">obsadený stôl</p>

					</div>
					<div class="reservationLegendTables">
						<div class="whiteSquare"></div>
						<p class="reservationLegendText">chodba</p>


						<div class="yellowCircle"></div>
						<p class="reservationLegendText">váš stôl</p>

					</div>

				</div>

			</div>
			<p class="reservationTableText2">Jedálny lístok reštaurácie :</p>
			<div id="wrapMenuCategory">
				<c:forEach var="category" items="${categories}">
					<p class="categoryName">${category.categoryName}</p>
					<div class="aboutMenu">
						<p class="aboutMenuText" style="flex-grow:5;">Meno</p>
						<p class="aboutMenuText aler" style="flex-grow:1;">Alergény</p>
						<p class="aboutMenuText" style="flex-grow:3;">Suroviny</p>
						<p class="aboutMenuText" style="flex-grow:2;">Cena</p>
						<p class="aboutMenuText" style="flex-grow:1;">Počet</p>
					</div>
					<c:forEach var="product" items="${products}">
						<c:if test="${product.productCategoryId == category.categoryId}">
							<div class="aboutMenu2">
								<p class="aboutMenuTextFood" style="flex-grow:2;">${product.productName}</p>
								<p class="aboutMenuTextFood aler" style="flex-grow:1; background:#e5e5e5;">1,7,2</p>
								<p class="aboutMenuTextFood materials">${product.productInfoRecipe}</p>
								<p class="aboutMenuTextFood" style="flex-grow:2; background:#cfedf4; font-family:NunitoBold;">3,50€</p>
								<p class="aboutMenuTextFood plusButton">+</p>
								<p class="aboutMenuTextFood counter">
									0
								</p>
								<p class="aboutMenuTextFood minusButton">-</p>
							</div>
						</c:if>
					</c:forEach>
				</c:forEach>
			</div>

			<div id="wrapMenuCategory">
				<p class="categoryName">Polievky</p>
				<div class="aboutMenu">
					<p class="aboutMenuText" style="flex-grow:5;">Meno</p>
					<p class="aboutMenuText aler" style="flex-grow:1;">Alergény</p>
					<p class="aboutMenuText" style="flex-grow:3;">Suroviny</p>
					<p class="aboutMenuText" style="flex-grow:2;">Cena</p>
					<p class="aboutMenuText" style="flex-grow:1;">Počet</p>
				</div>
				<div class="aboutMenu2">
					<p class="aboutMenuTextFood" style="flex-grow:2;">Kuracie prsia na smotane</p>
					<p class="aboutMenuTextFood aler" style="flex-grow:1; background:#e5e5e5;">1,7,2</p>
					<p class="aboutMenuTextFood materials">100g kuracie prsia, 50g smotana</p>
					<p class="aboutMenuTextFood" style="flex-grow:2; background:#cfedf4; font-family:NunitoBold;">3,50€</p>
					<p class="aboutMenuTextFood plusButton">+</p>

					<p class="aboutMenuTextFood counter">
						1
					</p>
					<p class="aboutMenuTextFood minusButton">-</p>
					</p>
				</div>
				<div class="aboutMenu2">
					<p class="aboutMenuTextFood" style="flex-grow:2;">Kuracie prsia na smotane</p>
					<p class="aboutMenuTextFood aler" style="flex-grow:1; background:#e5e5e5;">1,7,2</p>
					<p class="aboutMenuTextFood materials">100g kuracie prsia, 50g smotana</p>
					<p class="aboutMenuTextFood" style="flex-grow:2; background:#cfedf4; font-family:NunitoBold;">3,50€</p>
					<p class="aboutMenuTextFood plusButton">+</p>

					<p class="aboutMenuTextFood counter">
						1
					</p>
					<p class="aboutMenuTextFood minusButton">-</p>
					</p>
				</div>
				<div class="aboutMenu2">
					<p class="aboutMenuTextFood" style="flex-grow:2;">Kuracie prsia na smotane</p>
					<p class="aboutMenuTextFood aler" style="flex-grow:1; background:#e5e5e5;">1,7,2</p>
					<p class="aboutMenuTextFood materials">100g kuracie prsia, 50g smotana</p>
					<p class="aboutMenuTextFood" style="flex-grow:2; background:#cfedf4; font-family:NunitoBold;">3,50€</p>
					<p class="aboutMenuTextFood plusButton">+</p>

					<p class="aboutMenuTextFood counter">
						1
					</p>
					<p class="aboutMenuTextFood minusButton">-</p>
					</p>
				</div>
				<div class="aboutMenu2">
					<p class="aboutMenuTextFood" style="flex-grow:2;">Kuracie prsia na smotane</p>
					<p class="aboutMenuTextFood aler" style="flex-grow:1; background:#e5e5e5;">1,7,2</p>
					<p class="aboutMenuTextFood materials">100g kuracie prsia, 50g smotana</p>
					<p class="aboutMenuTextFood" style="flex-grow:2; background:#cfedf4; font-family:NunitoBold;">3,50€</p>
					<p class="aboutMenuTextFood plusButton">+</p>

					<p class="aboutMenuTextFood counter">
						1
					</p>
					<p class="aboutMenuTextFood minusButton">-</p>
					</p>
				</div>
				<div class="aboutMenu2">
					<p class="aboutMenuTextFood" style="flex-grow:2;">Kuracie prsia na smotane</p>
					<p class="aboutMenuTextFood aler" style="flex-grow:1; background:#e5e5e5;">1,7,2</p>
					<p class="aboutMenuTextFood materials">100g kuracie prsia, 50g smotana</p>
					<p class="aboutMenuTextFood" style="flex-grow:2; background:#cfedf4; font-family:NunitoBold;">3,50€</p>
					<p class="aboutMenuTextFood plusButton">+</p>

					<p class="aboutMenuTextFood counter">
						1
					</p>
					<p class="aboutMenuTextFood minusButton">-</p>
					</p>
				</div>

			</div>

			<br>
			<div class="wrapSubmitReservation">
				<input type="submit" class="reservationSubmit" value="Rekapitulácia objednávky">
			</div>

		</section>



	</form>
</form:form>
</div>

<script src="js/app.js"></script>
</body>
</html>
