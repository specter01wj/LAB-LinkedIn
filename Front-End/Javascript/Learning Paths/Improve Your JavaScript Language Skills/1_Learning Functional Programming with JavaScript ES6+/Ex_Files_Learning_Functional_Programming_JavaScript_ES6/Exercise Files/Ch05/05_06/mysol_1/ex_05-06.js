const currentInputValues = {
    firstName: 'J', // Must be at least 2 characters
    lastName: 'W', // Must be at least 2 characters
    zipCode: '2086', // Must be exactly 5 characters
    state: 'MDVA', // Must be exactly 2 characters
}

const inputCriteria = {
    firstName: [
      value => value.length >= 2
            ? ''
            : 'First name must be at least 2 characters',
    ],
    lastName: [
      value => value.length >= 2
            ? ''
            : 'Last name must be at least 2 characters',
    ],
    zipCode: [
      value => value.length === 5
            ? ''
            : 'Zip must be exactly 5 characters long',
    ],
    state: [
      value => value.length === 2
            ? ''
            : 'State must be exactly 2 characters long',
    ],
};

const getErrorMessages = (inputs, criteria) => {
  return Object.keys(inputs).reduce((acc, fieldName) => [
      ...acc,
      ...criteria[fieldName].map(test =>
          test(inputs[fieldName])),
  ], []).filter(message => message);
}

console.log(getErrorMessages(currentInputValues, inputCriteria));

/*
    Expected Output: [
        'First name must be at least 2 characters',
        'Last name must be at least 2 characters',
        'Zip code must be exactly 5 characters',
        'State must be exactly 2 characters',
    ]
    */