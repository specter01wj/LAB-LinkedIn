var gMapAPIKey = 'AIzaSyDYGNx-v5AKnKZ_H6XaIPF6MeQN8FYX46Y';

var map;
function initMap() {
	map = new google.maps.Map(document.getElementById('hplus-map'), {
		center: {lat: 40.3269115, lng: -74.572301},
		zoom: 16
	});
}