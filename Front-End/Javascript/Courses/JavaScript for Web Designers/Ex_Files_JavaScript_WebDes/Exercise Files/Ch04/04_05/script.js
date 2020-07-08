(function(){
'use strict';

document.addEventListener('DOMContentLoaded', function(){
	var c = document.getElementById('current-time');
	var currentDate = document.getElementById('current-date');
	
	setInterval(updateTime, 1000);
	
	function updateTime() {
		var d = new Date();
	
		var hours = d.getHours(),
			minutes = d.getMinutes(),
			month = formatMonth(d.getMonth()),
			date = d.getDate(),
			ampm = 'AM';
			
		if (hours > 12) {
			hours -= 12;
			ampm = 'PM';
		} else if (hours === 0) {
			hours = 12;
		}
		
		if (minutes < 10) {
			minutes = '0' + minutes;
		}
		
		var sepClass = '';
		if (d.getSeconds() % 2 === 1) sepClass = 'trans';
		
		var sep = '<span class="' + sepClass + '">:</span>';
	
		c.innerHTML = hours + sep + minutes + ' ' + ampm;
		currentDate.textContent = month + ' ' + date;
	}

	function formatMonth(m) {
		m = parseInt(m, 10);
	
		if (m < 0) {
			m = 0;
		} else if (m > 11) {
			m = 11;
		}
		
		var monthNames = [
			'January', 'February', 'March',
			'April', 'May', 'June', 
			'July', 'August', 'September',
			'October', 'November', 'December'
		];
		
		return monthNames[m];
	}

});


})();