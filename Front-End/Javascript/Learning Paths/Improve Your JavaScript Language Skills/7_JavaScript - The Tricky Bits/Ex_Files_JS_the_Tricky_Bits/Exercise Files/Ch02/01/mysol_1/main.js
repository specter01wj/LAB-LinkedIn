(function (_) {
  "use strict";

  var kitty = {
      name: "Squiggy",
      color: "orange",
      age: 5,
      chipId: "ZA123456",

      offspring: ["Mars", "Jupiter", "Mercury"],
      bestFriend: {
          name: "Crackers",
      },

      meow: function () {
          return "Meow, says " + this.name;
      },
  };

  var mudge = JSON.parse(JSON.stringify(kitty));
  mudge.name = "Mudge";
  mudge.chipId = "YYZ123";
  console.log(mudge);
  console.log(kitty);


  var knuckle = Object.assign({}, kitty);
  // knuckle = {...kitty};
  knuckle.name = "Knuckle";
  knuckle.bestFriend.name = "Bones";
  knuckle.meow = function () {
      return "Yeeeeeeow, says " + this.name;
      
  };
  console.log(knuckle);
  console.log(kitty);


  var comma = _.cloneDeep(kitty);
  comma.name = "Comma";
  comma.bestFriend.name = "Dash";
  console.log(comma);
  console.log(kitty);


})(_);
