/*
$('.message a').click(function(){
   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});
*/
function showLogin(){
	$("#regForm").hide();
	$("#logForm").animate({height: "toggle", opacity: "toggle"}, "slow");
}

function showRegister(){
	$("#logForm").hide();
	$("#regForm").animate({height: "toggle", opacity: "toggle"}, "slow");
}