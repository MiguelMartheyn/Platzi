//Object entries
const data = {
	frontend: 'oscar',
	backend: 'isabel',
	design: 'ana',
};

const entries = Object.entries(data);
console.log(entries);
console.log(entries.length);

//Object values

const data = {
	frontend: 'oscar',
	backend: 'isabel',
	design: 'ana',
};

const values = Object.values(data);
console.log(values);
console.log(values.length);

//padding

const string = 'hello';
console.log(string.padStart(8, 'hi '));
console.log(string.padEnd(12, ' ------'));
console.log('food'.padEnd(12, ' ------'));

//Trailing-Comas

const obj = {
	name: 'oscar', //, al final para evitar errores
};

//async await

const helloWorld = () => {
	return new Promise((resolve, reject) => {
		true
			? setTimeout(() => resolve('Hello World'), 3000)
			: reject(new Error('Error'));
	});
};

const helloAsync = async () => {
	const hello = await helloWorld();
	console.log(hello);
};

helloAsync();

//forma correcta para manejar los errores con async await
const anotherFunction = async () => {
	try {
		const hello = await helloWorld();
		console.log(hello);
	} catch (error) {
		console.error(error);
	}
};

anotherFunction();
