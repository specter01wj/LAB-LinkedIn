function update(group, activeAnchor) {
	var topLeft = group.get(".topLeft")[0];
	var topRight = group.get(".topRight")[0];
	var bottomRight = group.get(".bottomRight")[0];
	var bottomLeft = group.get(".bottomLeft")[0];
	var image = group.get(".image")[0];

	// update anchor positions
	switch (activeAnchor.getName()) {
	  case "topLeft":
		topRight.attrs.y = activeAnchor.attrs.y;
		bottomLeft.attrs.x = activeAnchor.attrs.x;
		break;
	  case "topRight":
		topLeft.attrs.y = activeAnchor.attrs.y;
		bottomRight.attrs.x = activeAnchor.attrs.x;
		break;
	  case "bottomRight":
		bottomLeft.attrs.y = activeAnchor.attrs.y;
		topRight.attrs.x = activeAnchor.attrs.x;
		break;
	  case "bottomLeft":
		bottomRight.attrs.y = activeAnchor.attrs.y;
		topLeft.attrs.x = activeAnchor.attrs.x;
		break;
	}

	image.setPosition(topLeft.attrs.x, topLeft.attrs.y);

	var width = topRight.attrs.x - topLeft.attrs.x;
	var height = bottomLeft.attrs.y - topLeft.attrs.y;
	if(width && height) {
	  image.setSize(width, height);
	}
}
function addAnchor(group, x, y, name) {
	var stage = group.getStage();
	var layer = group.getLayer();

	var anchor = new Kinetic.Circle({
	  x: x,
	  y: y,
	  strokeWidth: 0,
	  radius: 10,
	  name: name,
	  draggable: true
	});

	anchor.on("dragmove", function() {
	  update(group, this);
	  layer.draw();
	});
	anchor.on("mousedown touchstart", function() {
	  group.setDraggable(false);
	  this.moveToTop();
	});
	anchor.on("dragend", function() {
	  group.setDraggable(true);
	  layer.draw();
	});
	// add hover styling
	anchor.on("mouseover", function() {
	  var layer = this.getLayer();
	  document.body.style.cursor = "pointer";
	  this.setStrokeWidth(4);
	  layer.draw();
	});
	anchor.on("mouseout", function() {
	  var layer = this.getLayer();
	  document.body.style.cursor = "default";
	  this.setStrokeWidth(0);
	  layer.draw();
	});

	group.add(anchor);
}
function loadImages(sources, callback) {
	var images = {};
	var loadedImages = 0;
	var numImages = 0;
	for(var src in sources) {
	  numImages++;
	}
	for(var src in sources) {
	  images[src] = new Image();
	  images[src].onload = function() {
		if(++loadedImages >= numImages) {
		  callback(images);
		}
	  };
	  images[src].src = sources[src];
	}
}
function initStage(images) {
	var stage = new Kinetic.Stage({
  		container: "container",
  		width: 640,
  		height: 476
	});
		
	var theW = parseInt(localStorage.getItem("imageWidth"));
	var theH = parseInt(localStorage.getItem("imageHeight"));

	var bgGroup = new Kinetic.Group({
	  	x: 0,
	  	y: 0,
	  	draggable: false
	});
	
	var fgGroup = new Kinetic.Group({
	  	x: 100,
	  	y: 100,
	  	draggable: true
	});
		
	//Create image layer
	var layer = new Kinetic.Layer();
	
	// Set up text layer and variables
	var textLayer = new Kinetic.Layer();
	var textContext = textLayer.getContext('2d');

	var theMessage = "";
	var textFillColor ="#b20000";
	var fontSize = '50';
	var fontFace = 'serif';
	var fillType = "colorFill";
	var textFillColor2 ="#000000";
	var shadowColor = "#707070";
	var shadowBlur = 2;
	var shadowOffset = 4;

	// Create text object
	var theText = new Kinetic.Text({
		x: stage.getWidth() / 2,
		y: stage.getHeight() / 2,
		text: theMessage,
		draggable: true
	});
	
	// Center text
	theText.setOffset({
		x: theText.getWidth() / 2,
	});

	// Add objects to layers and layers to stage
	layer.add(bgGroup);
	layer.add(fgGroup);
	textLayer.add(theText);
	stage.add(layer);
	stage.add(textLayer);
		
	// Background image
	var bgImg = new Kinetic.Image({
		x: 0,
		y: 0,
		image: images.myBg,
		width: 640,
		height: 476,
		name: "image"
	});

    bgGroup.add(bgImg);

	// Uploaded Image
	var myNewImg = new Kinetic.Image({
		x: 0,
		y: 0,
		image: images.myImage,
		width: theW,
		height: theH,
		name: "image"
	});

	fgGroup.add(myNewImg);
	addAnchor(fgGroup, 0, 0, "topLeft");
	addAnchor(fgGroup, theW, 0, "topRight");
	addAnchor(fgGroup, theW, theH, "bottomRight");
	addAnchor(fgGroup, 0, theH, "bottomLeft");
	
	fgGroup.on("dragstart", function() {
		this.moveToTop();
	});
	
	// Draw text and images
	drawText();
	stage.draw();

	// Caption form element listeners
	formElement = document.getElementById("textBox");
	formElement.addEventListener("change", textBoxChanged, false);	

	formElement = document.getElementById("textBox");
	formElement.addEventListener("blur", textBoxChanged, false);	

	formElement = document.getElementById("textFont");
	formElement.addEventListener("change", textFontChanged, false);	
	
	formElement = document.getElementById("textSize");
	formElement.addEventListener("change", textSizeChanged, false);	
	
	formElement = document.getElementById("textFillColor");
	formElement.addEventListener("change", textFillColorChanged, false);	
	
	formElement = document.getElementById("textFillColor2");
	formElement.addEventListener("change", textFillColor2Changed, false);	
	
	formElement = document.getElementById("fillType");
	formElement.addEventListener("change", fillTypeChanged, false);	
	
	formElement = document.getElementById("shadowOffset");
	formElement.addEventListener("change", shadowOffsetChanged, false);	
	
	formElement = document.getElementById("shadowBlur");
	formElement.addEventListener("change", shadowBlurChanged, false);	
	
	formElement = document.getElementById("shadowColor");
	formElement.addEventListener("change", shadowColorChanged, false);	

	// Text event functions
	function textBoxChanged(e) {
		target =  e.target;
		theMessage = target.value;
		drawText();
	}

	function textFontChanged(e) {
		var target =  e.target;
		fontFace =  target.value;
		drawText();
	}

	function textSizeChanged(e) {
		var target =  e.target;
		fontSize = target.value;
		drawText();
	}
	
	function textFillColorChanged(e) {
		target =  e.target;
		textFillColor = "#" + target.value;
		drawText();
	}

	function textFillColor2Changed(e) {
		var target =  e.target;
		textFillColor2 = "#" + target.value;
		drawText();
	}
	
	function fillTypeChanged(e) {
		var target =  e.target;
		fillType =  target.value;
		drawText();
	}
	
	function shadowOffsetChanged(e) {
		var target =  e.target;
		shadowOffset =  parseInt(target.value);
		drawText();
	}
	
	function shadowBlurChanged(e) {
		var target =  e.target;
		shadowBlur =  target.value;
		drawText();
	}
	
	function shadowColorChanged(e) {
		var target =  e.target;
		shadowColor =  "#" + target.value;
		drawText();
	}
	
	// Main text drawing function
	function drawText() { 
		theText.setText(theMessage);
		theText.setFontFamily(fontFace);
		theText.setFontSize(fontSize);
		theText.setOffset({
			x: theText.getWidth() / 2,
		});
	
		theText.setShadowColor(shadowColor);
		theText.setShadowBlur(shadowBlur);
		theText.setShadowOffset(shadowOffset);
		theText.setShadowOpacity(.75);
	
		var textMiddle = theText.getY() + theText.getHeight() / 2;
		var textCenter = theText.getWidth() / 2;
		if (fillType == "linearGradient") {
			var gradient = textContext.createLinearGradient(0, textMiddle, theText.getWidth(), textMiddle);
			gradient.addColorStop(0,textFillColor);
			gradient.addColorStop(1,textFillColor2);
			theText.setFill(gradient);
		} else if (fillType == "radialGradient") {
			var textMiddle = theText.getHeight() / 2;
			var gradient = textContext.createRadialGradient(textCenter, textMiddle, 3, textCenter, textMiddle, textCenter-3);
			gradient.addColorStop(0,textFillColor);
			gradient.addColorStop(.6,textFillColor2);
			theText.setFill(gradient);
		} else { // solid color fill
			theText.setFill(textFillColor);
		}
	
		textLayer.draw();
	}

	// Save canvas to image
	document.getElementById("saveImage").addEventListener("click", function() {
	  stage.toDataURL({
		callback: function(dataUrl) {
		  window.open(dataUrl);
		}
	  });
	}, false);

}

