function loginWindow(){
	document.getElementById("login").style.display = "block";
		
}
function registerHubWindow(){
	if(document.getElementById("login").style.display = "block"){
		document.getElementById("login").style.display = "none";
	}
	document.getElementById("registerHub").style.display = "block";
	
}
function registerCustomer(){
	document.getElementById("registerHub").style.display = "none";
	document.getElementById("registerCustomer").style.display = "block";
}
function addItem(){
	document.getElementById("items").innerHTML +='<div class="foodWrapReg" ><input type="text" class="foodNameReg" value="Kuracie prsia so zemiakmi"><br><input type="text" class="ingrNameReg" value="(100g kuracie prsia, 150g zemiaky)"><br><input type="text" class="alerNameReg" value="1,2,8,6"><input type="text" class="foodPriceReg" value="9999,50€"></div>';
}
function addCategory(){
	document.getElementById("items").innerHTML += '<input type="text" class="categoryNameReg" value="Polievky"><div class="foodWrapReg"><input type="text" class="foodNameReg" value="Kuracie prsia so zemiakmi"><br><input type="text" class="ingrNameReg" value="(100g kuracie prsia, 150g zemiaky)"><br><input type="text" class="alerNameReg" value="1,2,8,6"><input type="text" class="foodPriceReg" value="9999,50€"></div>'
}
function exit(){
	document.getElementById("login").style.display = "none";
	document.getElementById("registerHub").style.display = "none";
}
function clickCheckBoxReservation(){
	const a = document.getElementById("visibleForm");
	if(a.style.display === "block"){
		a.style.display="none";
	}else {
		a.style.display="block";
		
		
	}
}