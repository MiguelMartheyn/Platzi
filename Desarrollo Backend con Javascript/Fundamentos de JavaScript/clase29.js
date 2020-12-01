const API_URL = 'https://swapi.dev/api/';
const PEOPLE_URL = 'people/id/';

function obtenerPersonaje(id) {
	//Nos permite hacer un request
	$.get(
		`${API_URL}${PEOPLE_URL.replace('id', id)}`,
		{ crossDomain: true },
		function (luke) {
			console.log(`Hola, yo soy ${luke.name}`);
		}
	);
}

obtenerPersonaje(1);
obtenerPersonaje(2);
obtenerPersonaje(3);
