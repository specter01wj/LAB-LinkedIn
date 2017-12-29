var gMapAPIKey = 'YOUR_API_KEY_HERE';

var map;
function initMap() {
	map = new google.maps.Map(document.getElementById('hplus-map'), {
		'center': {lat: 40.3269115, lng: -74.572301},
		'zoom': 17,
		'mapTypeId' : google.maps.MapTypeId.HYBRID,
		'draggable' : true,
		'scrollwheel' : true
	});
}