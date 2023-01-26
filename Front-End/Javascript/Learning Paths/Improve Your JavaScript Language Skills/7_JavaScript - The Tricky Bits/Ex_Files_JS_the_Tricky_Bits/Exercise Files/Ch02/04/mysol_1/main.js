Drupal = { behaviors: {} };

(function (Drupal) {
    "use strict";

    Drupal.behaviors.myModule = {
        url: "http://www.example.com",

        getData: function () {
            console.log("Let's get data from ", this.url);
        },

        attach: function () {
            var btn = document.querySelector("#go");

            btn.addEventListener("click", function clickGo(evt) {
                evt.preventDefault();

                // Drupal.behaviors.myModule.getData();
                this.getData();
            }.bind(this));

            /* var clickGo = function (evt) {
                evt.preventDefault();

                this.getData();
            }.bind(this);

            btn.addEventListener("click", clickGo); */
        },
    };

    // Invoke all the behaviors
    Object.keys(Drupal.behaviors).every(function (behaviorName) {
        Drupal.behaviors[behaviorName].attach();
        return true;
    });
})(Drupal);
