const electionVotes = [
    'Harry', 'Rick', 'Ben', 'Ben', 'Harry', 'Ashley',
    'Connor', 'Rick', 'Ashley', 'Rick', 'Albert', 'Ben',
    'Michael', 'Rick', 'Albert', 'Karen', 'Harry',
    'Karen', 'Donna', 'Ashley', 'Albert', 'Harry',
    'Dane', 'Dane', 'Rick', 'Donna', 'Mortimer',
];

const tallyVotes = votes => {
    let result = {};
    votes.map( (item) => {
        result[item] ? result[item]++ : result[item] = 1;
    });

    return result;
};

const tallyVotes2 = votes => {
    return votes.reduce( (acc, name) => ({
        ...acc, [name]: acc[name] ? acc[name] + 1 : 1
    }), {});
};

console.log(tallyVotes(electionVotes));
console.log(tallyVotes2(electionVotes));
/* Expected Output (something like this):
    {
        Harry: <some number>
        Donna: <some number>
        Rick: <some number>
        ...
    }
*/