// JavaScript Document
window.onload = initAll;

var currImg = 0;
var captionText = new Array(
	"Text1",
	"Text2",
	"Text3",
	"Text4",
	"Text5",
	"Text6",
	"Text7",
	"Text8",
	"Text9",
	"Text10"
	)
	
function initAll (){
	document.getElementById("imgText").innerHTML = captionText[0];
	document.getElementById("prevLink").onclick = processPrevious;
	document.getElementById("nextLink").onclick = processNext;
}

function processPrevious(){
	newSlide(-1);
}
function processNext(){
	newSlide(1);
}
function newSlide(direction){
	var imgCt = captionText.length;
	
	currImg = currImg + direction;
	if(currImg < 0){
		currImg = imgCt-1;
	}
	if(currImg == imgCt){
		currImg = 0;
	}
	document.getElementById("slideshow").src = "images/slideImg" + currImg + ".jpg"
	document.getElementById("imgText").innerHTML = captionText[currImg]
}