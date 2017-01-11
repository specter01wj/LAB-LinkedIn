<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>TPA: Trans Planet Airlines - Modify Photo</title>
<link href="styles/main.css" rel="stylesheet" type="text/css">
<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
<script src="http://d3lp1msu2r81bx.cloudfront.net/kjs/js/lib/kinetic-v4.5.4.min.js"></script>
<script src="scripts/canvas_resize.js"></script>
<script src="scripts/binaryajax.js"></script>
<script src="scripts/imageinfo.js"></script>
<script type="text/javascript">
      window.onload = function() {
		var theBg = localStorage.getItem("theChoice");
        var theFile = localStorage.getItem('uploadedFile');
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
		
		$("#saveImage").click(function(e) {
			e.preventDefault();
			$theInfo = "<h1>Step 4:  Right click on image and choose <span class='highlight'>Save Image</span></h1>";
			$("#steps").html($theInfo);
		});
      };
	  
</script>
</head>

<body onmousedown="return false;">
<div id="outerWrapper">
  <div id="header"><img src="images/logo.png" width="410" height="181" alt="TPA: Trans Planet Airlines" /><br>
  <img src="images/tpa_name.gif" width="373" height="37" alt="Trans Planet Airlines">
  </div>
  <div id="nav">
  <h1>Create Your Own Space Souvenir!</h1>
    <ul>
      <li><a href="index.php">START</a></li>
      <li><a href="beam-up.php">UPLOAD</a></li>
      <li><a href="modify.php">MODIFY</a></li>
      <li><a href=# id="saveImage">SAVE</a></li>
    </ul>
  </div>
<div id="content">
<div id="steps">
  <h1>Step 3: Reshape and drag your image into position</h1>
  </div>
<div id="container"></div>
      <button id="save">
        Save as image
      </button>

</div>
<div id="footer">
  <p>Copyright &copy; 2054 Trans Planet Airlines, LLC. All rights reserved</p>
</div></div>
</body>
</html>
