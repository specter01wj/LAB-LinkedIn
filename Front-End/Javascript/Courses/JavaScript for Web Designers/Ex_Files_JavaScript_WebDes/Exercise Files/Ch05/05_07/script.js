var map;
function initMap() {
	var storeLocationHollywood = {lat: 40.326829706785986, lng: -74.5720756934926},
		storeLocationChavez = {lat: 40.3262653332, lng: -74.57053074110001},
		centerPoint = {lat: 40.3262653332, lng: -74.57053074110001};

	map = new google.maps.Map(document.getElementById('hplus-map'), {
		'center' : centerPoint,
		'zoom' : 16,
		'mapTypeId' : google.maps.MapTypeId.HYBRID,
		'draggable' : true,
		'scrollwheel' : true
	});
	
	var popupContentHollywood = 'BHT LLP<br>2106 Deer Creek Dr.<br>Jin Wang';
	
	var popupContentChavez = 'CCGG LLC<br>1107 Deer Creek Dr.<br>James Wang';
	
	var infowindowHollywood = new google.maps.InfoWindow({
			content: popupContentHollywood
		});
	var infowindowChavez = new google.maps.InfoWindow({
			content: popupContentChavez
		});
	
	var markerHollywood = new google.maps.Marker({
			'position': storeLocationHollywood,
			'map': map,
			'title': 'BHT LLP'
		});
	var markerChavez = new google.maps.Marker({
			'position': storeLocationChavez,
			'map': map,
			'title': 'CCGG LLC'
		});
	
	markerHollywood.addListener('click', function() {
		infowindowHollywood.open(map, markerHollywood);
	});
	
	markerChavez.addListener('click', function() {
		infowindowChavez.open(map, markerChavez);
	});
}