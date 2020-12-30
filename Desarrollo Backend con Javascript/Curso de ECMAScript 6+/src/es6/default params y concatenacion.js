//default params y concatenacion

//antes de es6
function newFunction(name, age, country) {
	var name = name || 'oscar';
	var age = age || 32;
	var country = country || 'MX';
	console.log(name, age, country);
}

//en es6
function newFunction2(name = 'oscar', age = 32, country = 'MX') {
	console.log(name, age, country);
}

newFunction();
newFunction2('ricardo', 23, 'CO');

//Antes
let hello = 'Hello';
let world = 'World';
let epicPhrase = hello + ' ' + world;
console.log(epicPhrase);
//Despues
let epicPhrase2 = `${hello} ${world}`;
console.log(epicPhrase2);
