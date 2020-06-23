// Two methods for timers - setTimeout and SetInterval (single / repeating)

function simpleMessage() {
	alert("This is just an alert box");
}

// settimeout is in milliseconds
setTimeout(simpleMessage, 1500);

var myImage = document.getElementById("mainImage");

var imageArray = ["_images/overlook.jpg","_images/winery_sign.jpg","_images/lunch.jpg",
				  "_images/bigSur.jpg","_images/flag_photo.jpg","_images/mission_look.jpg"];
var imageIndex = 0;

function changeImage() {
	myImage.setAttribute("src",imageArray[imageIndex]);
	imageIndex++;
	if (imageIndex >= imageArray.length) {
		imageIndex = 0;
	}
}

// setInterval is also in milliseconds
var intervalHandle = setInterval(changeImage,3000);
console.log(intervalHandle);

myImage.onclick =  function() {
	alert("image interval cancelled!");
	clearInterval(intervalHandle);
};
