function heredaDe(prototipoHijo, prototipoPadre) {
	var fn = function () {};
	fn.prototype = prototipoPadre.prototype;
	prototipoHijo.prototype = new fn();
	prototipoHijo.prototype.constructor = prototipoHijo;
}

function Persona(nombre, apellido, altura) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.altura = altura;
}

Persona.prototype.saludar = function () {
	console.log(`Hola, me llamo ${this.nombre} ${this.apellido}`);
};

//This en las arrow functions pasa a ser igual a windows, por ende no son reconocidas al no estar definidas.
Persona.prototype.presentacion = function () {
	console.log(
		`Hola, me llamo ${this.nombre} ${this.apellido} y soy de estatura ${
			this.altura > 1.8 ? 'alta' : 'baja'
		}`
	);
};

function Desarrollador(nombre, apellido) {
	this.nombre = nombre;
	this.apellido = apellido;
}

heredaDe(Desarrollador, Persona);

Desarrollador.prototype.saludar = function () {
	console.log(
		`Hola, me llamo ${this.nombre} ${this.apellido} y soy desarrollador`
	);
};

let miguel = new Persona('Miguel', 'Martheyn', 1.82);
let erika = new Desarrollador('Erika', 'Luna', 1.5);
// let arturo = new Persona('Arturo', 'Martinez', 1.8);

miguel.saludar();
erika.saludar();
// arturo.presentacion();
