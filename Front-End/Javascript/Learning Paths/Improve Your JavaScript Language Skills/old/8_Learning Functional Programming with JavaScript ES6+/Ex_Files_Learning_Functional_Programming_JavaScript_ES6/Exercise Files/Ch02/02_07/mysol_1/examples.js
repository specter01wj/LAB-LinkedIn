
const Person = ({ name, age, job }) => {
    var _name = name;
    var _age = age;
    var _job = job;

    return {
        getName: () => _name,
        getAge: () => _age,
        getJob: () => _job,

        setJob: (newJob) => _job = newJob
    }
}


const me = Person({ name: 'Shaun', age: 25, job: 'developer' });

console.log(me.getName());
me.setJob('Lead Developer');
console.log(me.getJob());

const Person2 = ({ name, age, job }) => {
    var _name = name;
    var _age = age;
    var _job = job;
}
const me2 = Person({ name: 'Shaun', age: 25, job: 'developer' });

console.log(me2._name);
