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

  layer.add(legendArea);
  layer.add(dayOneLabel);
  layer.add(dayTwoLabel);
  layer.add(dayThreeLabel);

	stage.add(bgLayer);
  stage.add(layer);

	stage.draw();
	
} // End initStage()

// Update anchors if group moved

// Create anchor groups

// Set image sources
var sources = {
	moonSurface: 'images/plum_apollo16_big.jpg'
};

// Load images and initialize stage when done
loadImages(sources, initStage);
