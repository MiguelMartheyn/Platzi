class Persona {
	constructor(nombre, apellido, altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
	}
	saludar(fn) {
		console.log(`Hola, me llamo ${this.nombre} ${this.apellido}`);
		fn && fn(this.nombre, this.apellido, false);
	}

	presentacion() {
		console.log(
			`Hola, me llamo ${this.nombre} ${this.apellido} y soy de estatura ${
				this.altura > 1.8 ? 'alta' : 'baja'
			}`
		);
	}
}

class Desarrollador extends Persona {
	constructor(nombre, apellido, altura) {
		super(nombre, apellido, altura);
	}
	saludar(fn) {
		console.log(
			`Hola, me llamo ${this.nombre} ${this.apellido} y soy desarrollador`
		);
		fn && fn(this.nombre, this.apellido, true);
	}
}

function responderSaludo(nombre, apellido, esDev) {
	console.log(`Buen dia ${nombre} ${apellido}`);
	esDev && console.log(`Ah mira, no sabia que eras desarrollador`);
}

let miguel = new Persona('Miguel', 'Martheyn', 1.82);
let erika = new Desarrollador('Erika', 'Luna', 1.5);
let arturo = new Desarrollador('Arturo', 'Calle', 1.4);

miguel.saludar(responderSaludo);
erika.saludar(responderSaludo);
arturo.saludar();
