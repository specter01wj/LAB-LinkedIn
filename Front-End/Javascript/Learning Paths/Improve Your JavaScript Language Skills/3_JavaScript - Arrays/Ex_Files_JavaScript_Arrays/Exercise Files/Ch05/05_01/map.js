const friends = [
  { firstname: 'Jane', lastname: 'Doe' },
  { firstname: 'John', lastname: 'Smith' },
  { firstname: 'Alex', lastname: 'Trebek' },
];

//Create a new array that includes only the full name (firstname + lastname) of each friend.

let fullName = friends.map((name) => {
  return `${name.firstname} ${name.lastname}`;
  
});

console.log(fullName);
