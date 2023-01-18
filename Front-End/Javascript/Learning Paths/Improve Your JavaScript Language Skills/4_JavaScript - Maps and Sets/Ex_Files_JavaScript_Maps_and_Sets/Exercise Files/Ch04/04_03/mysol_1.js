//Survey Respondents
const resOne = {id: 1234};
const resTwo = {id: 5678};
const resThree = {id: 9012};
const resFour = {id: 3456};

//Create a new WeakSet and add the above values to your newly created WeakSet. 
let surveyResponse = new WeakSet();
surveyResponse.add(resOne).add(resTwo).add(resThree).add(resFour);
console.log(surveyResponse)

//Does your WeakSet have any responses tied to the {id: 9012}?
console.log(surveyResponse.has(resThree));

//Does your WeakSet have any responses tied to the {id: 0123}?
console.log(surveyResponse.has({id: 0123}));

//We need to delete resThree from the WeakSet.
surveyResponse.delete(resThree);
console.log(surveyResponse);
console.log(surveyResponse.has(resThree));
