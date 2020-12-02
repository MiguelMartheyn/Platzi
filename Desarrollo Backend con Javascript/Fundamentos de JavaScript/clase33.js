const API_URL = 'https://swapi.dev/api/';
const PEOPLE_URL = 'people/id/';

function obtenerPersonaje(id) {
	return new Promise((resolve, reject) => {
		$.get(
			`${API_URL}${PEOPLE_URL.replace('id', id)}`,
			{ crossDomain: true },
			function (data) {
				resolve(data);
			}
		).fail(() => reject(id));
	});
}

obtenerPersonaje(1)
	.then((personaje) => {
		console.log(`Hola, yo soy ${personaje.name}`);
		return obtenerPersonaje(2);
	})
	.then((personaje) => {
		console.log(`Hola, yo soy ${personaje.name}`);
		return obtenerPersonaje(17);
	})
	.then((personaje) => {
		console.log(`Hola, yo soy ${personaje.name}`);
	})
	.catch(function (id) {
		console.log(`Hay un error, no pude obtener el id ${id}`);
	});
