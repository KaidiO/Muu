// JavaScript Document
var ans = prompt("Are you sure you want to do that?","");//loome muutuja ans ja seome tulemusega prompt(), ehk mida kirjutati prompt dialoogi 
//prompt() meetod käsitleb kaht komaga eraldatud parameetrit: küsimust kasutajale ja vastust.

if(ans){
	alert("You said "+ans);// vastuse korral lisab muutuja ans vastuse alert boxi.
}
else{
	alert("You refused ta answer");// juhul kui vastaja keeldub vastamast ja ans=0.
}