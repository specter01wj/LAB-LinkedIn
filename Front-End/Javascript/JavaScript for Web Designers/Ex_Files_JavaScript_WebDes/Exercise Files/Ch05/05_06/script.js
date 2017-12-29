var map;
function initMap() {
	var storeLocation = {lat: 40.3262653332, lng: -74.5705307411};

	map = new google.maps.Map(document.getElementById('hplus-map'), {
		'center' : storeLocation,
		'zoom' : 17,
		'mapTypeId' : google.maps.MapTypeId.HYBRID,
		'draggable' : true,
		'scrollwheel' : true
	});

	var popupContent = 'CCGG<br>1107 Deer Creek Dr.<br>James Wang';
	
	var infowindow = new google.maps.InfoWindow({
		maxWidth: 50,
		content: popupContent
	});
	
	var marker = new google.maps.Marker({
		'position': storeLocation,
		'map': map,
		'title': 'CCGG 1107 house!!!'
	});

	marker.addListener('click', function() {
		infowindow.open(map, marker);
	});

}