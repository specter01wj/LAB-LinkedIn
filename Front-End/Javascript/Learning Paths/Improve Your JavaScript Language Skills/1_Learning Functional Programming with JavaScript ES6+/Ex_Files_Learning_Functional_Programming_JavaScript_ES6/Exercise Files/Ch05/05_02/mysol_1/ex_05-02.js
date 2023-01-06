const electionVotes = [
    'Harry', 'Rick', 'Ben', 'Ben', 'Harry', 'Ashley',
    'Connor', 'Rick', 'Ashley', 'Rick', 'Albert', 'Ben',
    'Michael', 'Rick', 'Albert', 'Karen', 'Harry',
    'Karen', 'Donna', 'Ashley', 'Albert', 'Harry',
    'Dane', 'Dane', 'Rick', 'Donna', 'Mortimer',
];

const tallyVotes = votes => {
    return votes.reduce((acc, item) => ({
      ...acc,
      [item]: acc[item] ? ++acc[item] : 1,
    }), {});
};

const tallyVotes_2 = votes => {
    let nameMap = {};
    votes.map( (item) => {
      nameMap[item] = nameMap[item] ? ++nameMap[item] : 1;
    });
    return nameMap;
};

console.log(tallyVotes(electionVotes));
console.log(tallyVotes_2(electionVotes));

/* Expected Output (something like this):
    {
        Harry: <some number>
        Donna: <some number>
        Rick: <some number>
        ...
    }
*/