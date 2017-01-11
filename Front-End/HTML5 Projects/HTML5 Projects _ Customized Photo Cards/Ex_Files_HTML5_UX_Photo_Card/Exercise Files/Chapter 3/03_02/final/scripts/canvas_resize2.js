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
          layer.draw();
        });
        anchor.on("mouseout", function() {
          var layer = this.getLayer();
          document.body.style.cursor = "default";
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

        var bgGroup = new Kinetic.Group({
          x: 0,
          y: 0,
          draggable: false
        });
        var newImageGroup = new Kinetic.Group({
          x: 100,
          y: 110,
          draggable: true
        });
        var layer = new Kinetic.Layer();

        /*
         * go ahead and add the groups
         * to the layer and the layer to the
         * stage so that the groups have knowledge
         * of its layer and stage
         */
        layer.add(bgGroup);
        layer.add(newImageGroup);
        stage.add(layer);

        // background
        var bgImg = new Kinetic.Image({
          x: 0,
          y: 0,
          image: images.bgImage,
          width: 640,
          height: 476,
          name: "image"
        });

        bgGroup.add(bgImg);

        // Uploaded image
		var myImg = new Kinetic.Image({
          x: 0,
          y: 0,
          image: images.newImage,
		  width: theW,
		  height: theH,
          name: "image"
        });

        newImageGroup.add(myImg);
        addAnchor(newImageGroup, 0, 0, "topLeft");
        addAnchor(newImageGroup, theW, 0, "topRight");
        addAnchor(newImageGroup, theW, theH, "bottomRight");
        addAnchor(newImageGroup, 0, theH, "bottomLeft");

        newImageGroup.on("dragstart", function() {
          this.moveToTop();
        });

        stage.draw();

		
/*
        var newImageGroup = new Kinetic.Group({
          x: 111,
          y: 161,
          draggable: true
        });
        var layer = new Kinetic.Layer();

        layer.add(newImageGroup);
        stage.add(layer);

        // New Image
		theW = localStorage.getItem("imageWidth");
		theH = localStorage.getItem("imageHeight");
        var myImg = new Kinetic.Image({
          x: 0,
          y: 0,
          image: images.newImage,
		  width: theW,
		  height: theH,
          name: "image"
        });

        newImageGroup.add(myImg);
        addAnchor(newImageGroup, 0, 0, "topLeft");
        addAnchor(newImageGroup, theW, 0, "topRight");
        addAnchor(newImageGroup, theW, theH, "bottomRight");
        addAnchor(newImageGroup, 0, theH, "bottomLeft");

        newImageGroup.on("dragstart", function() {
          this.moveToTop();
        });
		
        stage.draw();
*/		
        document.getElementById("save").addEventListener("click", function() {
          /*
           * since the stage toDataURL() method is asynchronous, we need
           * to provide a callback
           */
          stage.toDataURL({
            callback: function(dataUrl) {
              /*
               * here you can do anything you like with the data url.
               * In this tutorial we'll just open the url with the browser
               * so that you can see the result as an image
               */
              window.open(dataUrl);
            }
          });
        }, false);
      }

