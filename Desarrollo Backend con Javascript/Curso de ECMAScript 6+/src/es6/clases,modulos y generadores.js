class calculator {
	constructor() {
		//scope global
		this.valueA = 0;
		this.valueB = 0;
	}

	sum(valueA, valueB) {
		this.valueA = valueA;
		this.valueB = valueB;
		return this.valueA + this.valueB;
	}
}

const calc = new calculator();
console.log(calc.sum(2, 2));

//modulos
import { hello } from './modulo';

hello();

//generators
function* helloWorld() {
	if (true) {
		yield 'Hello, ';
	}
	if (true) {
		yield 'World';
	}
}

const generatorHello = helloWorld();
console.log(generatorHello.next().value);
console.log(generatorHello.next().value);
console.log(generatorHello.next().value);
