var redRoses = new app.singleFlower({
  name: 'Red Roses',
  price: 39.95,
  color: 'Red',
  img: 'images/redRoses.jpg',
  link: 'redRose'
});

var rainbowRoses = new app.singleFlower({
  name: 'Rainbow Roses',
  price: 29.95,
  color: 'Orange',
  link: 'rainbowRose'
});

var heirloomRoses = new app.singleFlower({
  name: 'Heirloom Roses',
  price: 19.95,
  img: 'images/heirloomRoses.jpg',
  link: 'heirloomRose'
});

console.log(rainbowRoses.toJSON());
console.log(redRoses.toJSON());
console.log(heirloomRoses.toJSON());
