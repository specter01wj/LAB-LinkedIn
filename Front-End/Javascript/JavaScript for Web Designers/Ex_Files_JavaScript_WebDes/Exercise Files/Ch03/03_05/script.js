(function() {
"use strict";

	document.getElementById('cart-hplus').addEventListener('submit', estimateTotal);

	function estimateTotal(e) {
		e.preventDefault();
		
		console.log('You submitted the form.');
	}

})();