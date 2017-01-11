<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>TPA: Trans Planet Airlines - Modify Photo</title>
<link href="styles/main.css" rel="stylesheet" type="text/css">
<script src="scripts/modernizr-1.6.min.js"></script>
<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
<script src="scripts/kinetic-v4.40.js"></script>
<script src="scripts/canvas_custom.js"></script>
<script src="scripts/binaryajax.js"></script>
<script src="scripts/imageinfo.js"></script>
<script type="text/javascript" src="scripts/html5slider.js"></script>
<script type="text/javascript" src="jscolor/jscolor.js"></script>
<script type="text/javascript">
      window.onload = function() {
		var theBg = localStorage.getItem("theChoice");
        var theFile = localStorage.getItem('uploadedFile');
		var captionFlag = 'false';
		theFile = "uploads/" + theFile;
		theBg = "images/" + theBg;
		var sources = {
          myBg: theBg,
          myImage: theFile
        };

		ImageInfo.loadInfo(theFile, getDimensions);
        loadImages(sources, initStage);

		function getDimensions() {
			var theWidth = ImageInfo.getField(theFile, "width")/2;
			var theHeight = ImageInfo.getField(theFile, "height")/2;
			localStorage.setItem("imageWidth",theWidth);
			localStorage.setItem("imageHeight",theHeight);
			}
		
		$("#captionNav").click(function(e) {
			e.preventDefault();
			$("#textForm").css('display','block');
			$theInfo = "<h1>Step 4: Add a caption to your photo card and drag it into place</h1>";
			$("#steps").html($theInfo);
		});

		
		 $('input').keydown( function(e) {
				var key = e.charCode ? e.charCode : e.keyCode ? e.keyCode : 0;
				if(key == 13) {
					e.preventDefault();
					var inputs = $(this).closest('form').find(':input:visible');
					inputs.eq( inputs.index(this)+ 1 ).focus();
				}
			});		
      };
	  
</script>
</head>

<body id="modifyPage">
<div id="outerWrapper">
  <div id="header"><img src="images/logo.png" width="410" height="181" alt="TPA: Trans Planet Airlines" /><br>
    <img src="images/tpa_name.gif" width="373" height="37" alt="Trans Planet Airlines"> </div>
  <div id="nav">
    <h1>Create Your Own Space Souvenir!</h1>
    <ul>
      <li><a href="index.php">START</a></li>
      <li><a href="beam-up.php">UPLOAD</a></li>
      <li><a href="modify.php">MODIFY</a></li>
      <li id="captionNav"><a href="javascript:void();">CAPTION</a></li>
      <li><a href="javascript:void(); id="saveImage" target="_blank">SAVE</a></li>
    </ul>
  </div>
  <div id="content">
    <div id="steps">
      <h1>Step 3: Reshape and drag your image into position</h1>
    </div>
    <div id="container"></div>
    <form id="textForm" action="modify.php">
      <fieldset>
        <legend>Create your text</legend>
        <p>
          <label for="textBox">Text:</label>
          <input id="textBox" placeholder="Enter a caption" value="" />
        </p>
        <p>
          <label for="textFont">Text Font:</label>
          <select id="textFont">
            <option value="serif">serif</option>
            <option value="sans-serif">sans-serif</option>
            <option value="cursive">cursive</option>
            <option value="fantasy">fantasy</option>
            <option value="monospace">monospace</option>
            <option value="Impact">Impact</option>
          </select>
        </p>
        <p>
          <label for="textSize">Text Size:</label>
          <input type="range" id="textSize" min="0" max="200" value="50"/>
        </p>
      </fieldset>
      <fieldset>
        <legend>Choose a solid color or gradient</legend>
        <p>
          <label for="fillType">Fill Type:</label>
          <select id="fillType">
            <option value="colorFill">Solid Color</option>
            <option value="linearGradient">Linear Gradient</option>
            <option value="radialGradient">Radial Gradient</option>
          </select>
        </p>
        <p>
          <label for="textFillColor">Text Color:</label>
          <input class="color" id="textFillColor" value="FF0000"/>
        </p>
        <p>
          <label for="textFillColor2">Gradient Color:</label>
          <input class="color" id="textFillColor2" value ="000000"/>
        </p>
      </fieldset>
      <fieldset>
        <legend>Add a shadow</legend>
        <p>
          <label for="shadowOffset">Shadow Offset:</label>
          <input type="range" id="shadowOffset"
       min="-10"
       max="10"
       value="4"/>
        </p>
        <p>
          <label for="shadowBlur">Shadow Blur:</label>
          <input type="range" id="shadowBlur"
       min="1"
       max="10"
       value="1" />
        </p>
        <p>
          <label for="shadowColor">Shadow Color:</label>
          <input class="color" id="shadowColor" value="707070"/>
        </p>
      </fieldset>
    </form>
  </div>
  <div id="footer">
    <p>Copyright &copy; 2054 Trans Planet Airlines, LLC. All rights reserved</p>
  </div>
</div>
</body>
</html>
