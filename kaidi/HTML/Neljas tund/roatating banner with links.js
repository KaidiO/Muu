// JavaScript Document
window.onload = initBannerLink;
// luuakse 2 muutujat, esimene adImages koos massiiviga, teisele muutujale thisAd antakse algväärtus.
var adImages = new Array("images/banner1.gif","images/banner2.gif","images/banner3.gif");
var adURL = new Array("hesburger.com","sun.com","microsoft.com");
var thisAd = 0;

function rotate(){
	thisAd++;
	if(thisAd == adImages.length){
		thisAd = 0;
	}	
document.getElementById("adBanner").src = adImages[thisAd];

setTimeout("rotate()",3*1000);
}

function newLocation(){
	document.location.href = "http://www." + adURL[thisAd];
	return false;
}

function initBannerLink(){
	if(document.getElementById("adBanner").parentNode.tagName == "A"){
		document.getElementById("adBanner").parentNode.onclick = newLocation;
	}
	rotate();
}