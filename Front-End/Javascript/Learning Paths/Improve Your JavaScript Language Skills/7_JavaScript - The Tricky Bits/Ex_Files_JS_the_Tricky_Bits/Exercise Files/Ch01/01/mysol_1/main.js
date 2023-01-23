(function () {
    "use strict";

    // Simple array
    var band = [
        "Renee Rosnes",
        "Anat Cohen",
        "Melissa Aldana",
        "Ingrid Jensen",
        "Noriko Ueda",
        "Allison Miller",
        "Cécile McLorin Salvant",
    ];

    for (let member of band) {
      console.log(member);
    }

    // Nested array
    var bands = [
        [
            "Renee Rosnes",
            "Anat Cohen",
            "Melissa Aldana",
            "Ingrid Jensen",
            "Noriko Ueda",
            "Allison Miller",
            "Cécile McLorin Salvant",
        ],
        [
            "Miles Davis",
            "Wayne Shorter",
            "Herbie Hancock",
            "Ron Carter",
            "Tony Williams",
        ],
        ["Chick Corea", "Miroslav Vitous", "Roy Haynes"],
    ];

    for (let member1 of bands) {
      for (let member2 of member1) {
        console.log(member2);
      }
    }

})();
