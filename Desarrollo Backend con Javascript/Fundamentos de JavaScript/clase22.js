function Persona(nombre, apellido, altura) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.altura = altura;
}

// Persona.prototype.saludar = function(){
//     console.log(`Hola, me llamo ${this.nombre} ${this.apellido}`)
// }
Persona.prototype.presentacion = () =>{
	console.log(
		`Hola, me llamo ${this.nombre} ${this.apellido} y soy de estatura ${
			this.altura > 1.8 ? 'alta' : 'baja'
		}`
	);
};

let miguel = new Persona('Miguel', 'Martheyn', 1.82);
let erika = new Persona('Erika', 'Luna', 1.5);
let arturo = new Persona('Arturo', 'Martinez', 1.8);

miguel.presentacion();
erika.presentacion();
arturo.presentacion();
