var gMapAPIKey = 'AIzaSyDYGNx-v5AKnKZ_H6XaIPF6MeQN8FYX46Y';

var map;
function initMap() {
	map = new google.maps.Map(document.getElementById('hplus-map'), {
		center: {lat: -34.397, lng: 150.644},
		zoom: 8
	});
}