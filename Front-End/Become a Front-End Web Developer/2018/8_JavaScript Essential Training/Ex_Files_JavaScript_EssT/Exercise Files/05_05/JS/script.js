
const CTAELE = document.querySelector('.cta a');

if( CTAELE.hasAttribute('target') ) {
	console.log( CTAELE.getAttribute('target') );
} else {
	CTAELE.setAttribute('target', '_blank');
}
