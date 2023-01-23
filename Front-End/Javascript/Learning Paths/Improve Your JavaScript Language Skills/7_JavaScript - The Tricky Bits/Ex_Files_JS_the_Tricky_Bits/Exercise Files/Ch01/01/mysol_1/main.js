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

    console.log('1st------');
    for (let member of band) {
      console.log(member);
    }

    console.log('2nd------');
    band.forEach((member) => {
      console.log("Introducing…", member);
    })

    console.log('3rd------');
    band.every(function (member) {
        console.log("Introducing…", member);
        if (member === "Ingrid Jensen") {
            return false;
        }
        return true;
    });

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

    console.log('4th------');
    for (let member1 of bands) {
      for (let member2 of member1) {
        console.log(member2);
      }
    }




})();
