// JavaScript Document
document.onkeydown = keyHit;
var thisPic = 0;
var thisText = 0;

var captionText = new Array(
	"Text1",
	"Text2",
	"Text3",
	"Text4"
	)

function keyHit(evt){
	var myPix = new Array("images/callisto.jpg","images/europa.jpg","images/io.jpg","images/ganymede.jpg");
	var imgCt = myPix.length-1;
	var ltArrow = 37;
	var rtArrow = 39;
	
	var thisKey = (evt)? evt.which: window.event.keyCode;
	
	if(thisKey == ltArrow){
		chgSlide(-1);
		
	}
	else if(thisKey == rtArrow){
		chgSlide(1);
		
	}
	return false;
	
	function chgSlide(direction){
				
		thisText++;
		
		thisPic = thisPic + direction;
		if(thisPic > imgCt){
			thisPic = 0;
		}
		if(thisPic < 0){
			thisPic = imgCt;
		}
		if(thisText == captionText.length){
			thisText = 0;
		}
		document.getElementById("myPicture").src = myPix[thisPic];
		document.getElementById("imgText").innerHTML = captionText[thisPic];
	}
}