const API_URL = 'https://swapi.dev/api/';
const PEOPLE_URL = 'people/id/';

function obtenerPersonaje(id, callback) {
	//Nos permite hacer un request
	$.get(
		`${API_URL}${PEOPLE_URL.replace('id', id)}`,
		{ crossDomain: true },
		callback
		// function (luke) {
		// 	console.log(`Hola, yo soy ${luke.name}`);
		// 	callback && callback();
		// }
	).fail(() => {
		console.log(`Sucedio un error. No se pudo obtener el personaje ${id}`);
	});
}

obtenerPersonaje(1, function (personaje) {
	console.log(`Hola, yo soy ${personaje.name}`);

	obtenerPersonaje(2, function (personaje) {
		console.log(`Hola, yo soy ${personaje.name}`);

		obtenerPersonaje(17, function (personaje) {
			console.log(`Hola, yo soy ${personaje.name}`);
		});
	});
});
