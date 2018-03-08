
const IMAGES = document.querySelectorAll('img');

for(let i = 0; i < IMAGES.length; i++) {
	let imageSrc = IMAGES[i].getAttribute('src');
	imageSrc = imageSrc.slice(0, -8);
	console.log(imageSrc);

	let type = IMAGES[i].getAttribute('data-type');
	console.log(type);



}


