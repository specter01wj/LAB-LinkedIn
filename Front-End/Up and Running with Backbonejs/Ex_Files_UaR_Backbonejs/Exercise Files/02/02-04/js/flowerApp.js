var tantalizingTulips = new app.singleFlower({
  name: "Tantalizing Tulips",
  price: 30,
  color: 'Red'
});

var fleurDeLis = new app.singleFlower({
  name: "Fleur Dis Lis",
  price: 50,
  color: 'Blue'
});

var flowerGroup = new app.EuropeanFlower([
  tantalizingTulips, fleurDeLis
]);

tantalizingTulips.set("originCountry", "Holland");

console.log(flowerGroup.toJSON());