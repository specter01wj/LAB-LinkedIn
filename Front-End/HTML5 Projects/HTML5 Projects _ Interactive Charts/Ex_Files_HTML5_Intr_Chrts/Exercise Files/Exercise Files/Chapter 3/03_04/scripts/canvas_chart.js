// Load source images
function loadImages(sources, callback) {
	var images = {};
	var loadedImages = 0;
	var numImages = 0;
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

// Initialize stage
function initStage(images) {
	var stage = new Kinetic.Stage({
		container: 'container',
		width: 600,
		height: 400
	});

	var dayOneBar = new Kinetic.Rect({
		x: 0,
		y: 0,
		width: 100,
		height: 10,
		name: 'bar',
		fill: '#B20000'
	});
	
	var dayTwoBar = new Kinetic.Rect({
		x: 0,
		y: 0,
		width: 100,
		height: 10,
		name: 'bar',
		fill: 'green'
	});
	
	var dayThreeBar = new Kinetic.Rect({
		x: 0,
		y: 0,
		width: 100,
		height: 10,
		name: 'bar',
		fill: 'blue'
	});
	
	var barOneY = 370;
	var barTwoY = 370;
	var barThreeY = 370;
	
	var barOneGroup = new Kinetic.Group({
		x: 10,
		y: barOneY,
		draggable: false
	});
	
	var barTwoGroup = new Kinetic.Group({
		x: 140,
		y: barTwoY,
		draggable: false
	});
	
	var barThreeGroup = new Kinetic.Group({
		x: 270,
		y: barThreeY,
		draggable: false
	});

	var legendArea = new Kinetic.Rect({
		x: 0,
		y: stage.getHeight() - 20,
		height: 20,
		width: stage.getWidth(),
		fill: 'white'
	});
	
	var dayOneLabel = new Kinetic.Text({
		text: 'Day 1',
		fontSize: 12,
		x: 40,
		y: stage.getHeight() - 18,
		fontFamily: 'sans-serif',
		fill: '#333333'
	});
	
	var dayTwoLabel = new Kinetic.Text({
		text: 'Day 2',
		fontSize: 12,
		x: 170,
		y: stage.getHeight() - 18,
		fontFamily: 'sans-serif',
		fill: '#333333'
	});
	
	var dayThreeLabel = new Kinetic.Text({
		text: 'Day 3',
		fontSize: 12,
		x: 300,
		y: stage.getHeight() - 18,
		fontFamily: 'sans-serif',
		fill: '#333333'
	});
		
	var layer = new Kinetic.Layer();
	var bgLayer = new Kinetic.Layer();

	// Background image
	var bgImg = new Kinetic.Image({
		x: 0,
		y: 0,
		image: images.moonSurface,
		width: 600,
		height: 476,
		name: "image"
	});
	
	bgLayer.add(bgImg);
	layer.add(barOneGroup);
	layer.add(barTwoGroup);
	layer.add(barThreeGroup);
	layer.add(legendArea);
	layer.add(dayOneLabel);
	layer.add(dayTwoLabel);
	layer.add(dayThreeLabel);
	stage.add(bgLayer);
	stage.add(layer);

	barOneGroup.add(dayOneBar);
	
	barTwoGroup.add(dayTwoBar);
	
	barThreeGroup.add(dayThreeBar);

	stage.draw();
	
} // End initStage()

// Update anchors if group moved
function update(activeAnchor) {
	var group = activeAnchor.getParent();
	
	var topLeft = group.get('.topLeft')[0];
	var topRight = group.get('.topRight')[0];
	var bottomRight = group.get('.bottomRight')[0];
	var bottomLeft = group.get('.bottomLeft')[0];
	var theBar = group.get('.bar')[0];
	
	var anchorX = activeAnchor.getX();
	var anchorY = activeAnchor.getY();

	// update anchor positions
	switch (activeAnchor.getName()) {
		  case 'topLeft':
				topRight.setY(anchorY);
				bottomLeft.setX(anchorX);
				break;
		  case 'topRight':
				topLeft.setY(anchorY);
				bottomRight.setX(anchorX);
				break;
	}

	theBar.setPosition(topLeft.getPosition());
	
	var width = topRight.getX() - topLeft.getX();
	var height = bottomLeft.getY() - topLeft.getY();
	if(width && height) {
		  theBar.setSize(width, height);
	}
}

// Create anchor groups
function addAnchor(group, x, y, name) {
	var stage = group.getStage();
	var layer = group.getLayer();
	
	var anchor = new Kinetic.Circle({
		x: x,
		y: y,
		strokeWidth: 0,
		radius: 10,
		name: name,
		draggable: true,
		dragOnTop: false,
		dragBoundFunc: function(pos) {
			return {
				x: this.getAbsolutePosition().x,
				y: pos.y
			}
		}
	});

	anchor.on('dragmove', function() {
		update(this);
		layer.draw();
	});
	anchor.on('mousedown touchstart', function() {
		group.setDraggable(false);
		this.moveToTop();
	});
	anchor.on('dragstart', function() {
		group.setDraggable(true);
		layer.draw();
	});
	anchor.on('dragend', function() {
		group.setDraggable(true);
		layer.draw();
	});
	// add hover styling
	anchor.on('mouseover', function() {
		var layer = this.getLayer();
		document.body.style.cursor = 'pointer';
		this.setStrokeWidth(4);
		layer.draw();
	});
	anchor.on('mouseout', function() {
		var layer = this.getLayer();
		document.body.style.cursor = 'default';
		this.setStrokeWidth(0);
		layer.draw();
	});
	
	group.add(anchor);
}

// Set image sources
var sources = {
	moonSurface: 'images/plum_apollo16_big.jpg'
};

// Load images and initialize stage when done
loadImages(sources, initStage);
