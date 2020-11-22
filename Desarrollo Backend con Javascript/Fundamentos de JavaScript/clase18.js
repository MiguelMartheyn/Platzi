var sacha = {
	nombre: 'Sacha',
	apellido: 'Lifszyc',
	altura: 1.72,
};

var alan = {
	nombre: 'Alan',
	apellido: 'Perez',
	altura: 1.86,
};

var martin = {
	nombre: 'Martin',
	apellido: 'Gomez',
	altura: 1.85,
};

var dario = {
	nombre: 'Dario',
	apellido: 'Juarez',
	altura: 1.71,
};

var vicky = {
	nombre: 'Vicky',
	apellido: 'Zapata',
	altura: 1.56,
};

var paula = {
	nombre: 'Paula',
	apellido: 'Barros',
	altura: 1.76,
};

var personas = [sacha, alan, martin, dario, vicky, paula];

var personasAltas = personas.filter((filter) => filter.altura > 1.8);

var personasBajas = personas.filter((filter) => filter.altura <= 1.8);

console.log(
	`Las personas altas son las siguientes: ${personasAltas.map(
		(persona) => persona.nombre
	)}`
);

console.log(
	`Las personas bajas son las siguientes: ${personasBajas.map(
		(persona) => persona.nombre
	)}`
);
