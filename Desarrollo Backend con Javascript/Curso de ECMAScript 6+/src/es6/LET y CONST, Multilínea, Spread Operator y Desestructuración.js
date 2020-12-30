//LET y CONST, Multilínea, Spread Operator y Desestructuración
let lorem =
	'Quiero escribir una frase epica \n' + 'otra frase epica que necesitamos';

//es6
let lorem2 = `otra frase epica que necesitamos 
ahora es otra frase epica`;

console.log(lorem);
console.log(lorem2);

//destructuracion

let person = {
	name: 'oscar',
	age: 32,
	country: 'mx',
};

console.log(person.name, person.age, person.country);
//es6
let { name, age, country } = person;
console.log(name, age, country);

//spread operator

let team1 = ['Oscar', 'Julian', 'Ricardo'];
let team2 = ['Valeria', 'Yesica', 'Camila'];

let education = ['David', ...team1, ...team2];
console.log(education);

//let

{
	var globalVar = 'global var';
}
{
	let globalLet = 'global let';
	console.log(globalLet);
}
console.log(globalVar);

//const

const a = 'b'; // No se puede reasignar
