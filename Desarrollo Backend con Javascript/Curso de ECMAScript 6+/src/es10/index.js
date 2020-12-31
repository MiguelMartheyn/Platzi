let array = [1, 2, 3, [1, 2, 3, [1, 2, 3]]];

console.log(array.flat(2)); //aplanar arrays

let array = [1, 2, 3, 4, 5];
console.log(array.flatMap((value) => value * 2)); //Mapear cada elemento

let hello = '     hello world';
console.log(hello);
let hello1 = 'hello world      ';
console.log(hello1);
console.log(hello1.trimEnd());
console.log(hello.trimStart()); //Eliminar espacios de String

//try catch

try {
} catch {
	error;
}

//from entries: pasar de arreglos a objetos o de objetos a arreglos

let entries = [
	['name', 'oscar'],
	['age', 32],
];

console.log(Object.fromEntries(entries));

//objeto tipo simbolo: acceder a la descripcion de objeto tipo simbolo

let mySymbol = 'My Symbol';
let symbol = Symbol(mySymbol);
console.log(symbol.description);
