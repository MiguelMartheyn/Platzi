let name = 'Miguel';
let age = 27;

//antes
obj = { name: name, age: age };
//despues
obj2 = { name, age };
console.log(obj2);

//Arrow Functions

const names = [
	{ name: 'Miguel', age: 27 },
	{ name: 'Oscar', age: 32 },
];

let listOfNames = names.map(function (item) {
	console.log(item.name);
});

//es6
let listOfNames2 = names.map((item) => console.log(item.name));

const listOfNames3 = (name, age) => {};

const square = (num) => num * num;

//Promesas

const helloPromise = () => {
	return new Promise((resolve, reject) => {
		if (true) {
			resolve('Todo bien');
		} else {
			reject(new Error('Ups'));
		}
	});
};

helloPromise()
	.then((response) => console.log(response))
	.catch((error) => console.error(error));
