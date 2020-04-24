<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="sk">

<head>
    <meta charset="UTF-8">
    <title>ROS</title>
	<link rel="icon" href="obr/icon.png">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="systemCompany">

<!--
< HOME PAGE
-->
<div class="wrapHomePage">
		<div class="logo"></div>
	
	<section id="registerCompany">
		<p class="loginHead">Registrácia majiteľa</p>
		
		<form:form class="registerCompany" onSubmit="registerCompany()" 
					action="processAddOwnerForm" modelAttribute="owner" method="post">
					
		<form:hidden path="ownerId"/>
		
		<div class="regWrapLeft">
			<label class="regLabel">Názov firmy:</label><br>
			<form:input class="regInput" type="text" path="ownerCompanyName"/><br>
		
			<label class="regLabel">Meno :</label><br>
			<form:input class="regInput" type="text" path="ownerFirstName"/><br>
			
			<label class="regLabel">Priezvisko :</label><br>
			<form:input class="regInput" type="text" path="ownerLastName"/><br>
			
			<label class="regLabel">E-mailová adresa :</label><br>
			<form:input class="regInput" type="text" path="ownerEmail"/><br>
			
			<label class="regLabel">Telefónne číslo :</label><br>
			<form:input class="regInput" type="text" path="ownerPhoneNumber"/><br>
			
			<label class="regLabel">Heslo :</label><br>
			<form:input class="regInput" type="password" path="ownerPassword"/><br>
			
			<label class="regLabel">Potvrdiť heslo :</label><br>
			<form:input class="regInput" type="password" path="ownerCheckPassword"/><br>
			
			<label class="regLabel">Adresa firmy</label><br>
			<label class="regLabel">Ulica :</label><br>
			<form:input class="regInput" type="text" path="ownerStreet" /><br>
			
			<label class="regLabel">PSČ :</label><br>
			<form:input class="regInput" type="text" path="ownerZipCode" /><br>
			
			<label class="regLabel">Mesto :</label><br>
			<form:input class="regInput" type="text" path="ownerCity" /><br>
		
		</div>
		<div class="regWrapRight">	
		
			<label class="regLabel">IČO :</label><br>
			<form:input class="regInput" type="text" path="ownerICO"/><br>
			
			<label class="regLabel">IČDPH :</label><br>
			<form:input class="regInput" type="text" path="ownerIcDPH"/><br>
			
			<label class="regLabel">DIČ :</label><br>
			<form:input class="regInput" type="text" path="ownerDIC"/><br>
			
			<label class="regLabel">Fakturačná adresa "</label><br>
			<label class="regLabel">Ulica :</label><br>
			<form:input class="regInput" type="text" path="ownerInvoiceStreet"/><br>
			
			<label class="regLabel">PSČ :</label><br>
			<form:input class="regInput" type="text" path="ownerInvoiceZipCode"/><br>
			
			<label class="regLabel">Mesto :</label><br>
			<form:input class="regInput" type="text" path="ownerInvoiceCity"/><br>
			
			
		</div>
				<input class="regSubmit" type="submit" value="OK">
			<br>
			<br>
			
		
		</form:form>
	</section>
	</div>

    <script src="js/app.js"></script>
</body>
</html>