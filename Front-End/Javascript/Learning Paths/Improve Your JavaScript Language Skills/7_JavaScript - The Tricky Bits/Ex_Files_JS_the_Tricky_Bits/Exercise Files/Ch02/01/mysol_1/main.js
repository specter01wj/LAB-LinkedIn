(function () {
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




})();
