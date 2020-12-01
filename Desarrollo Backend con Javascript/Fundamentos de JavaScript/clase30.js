const API_URL = 'https://swapi.dev/api/';
const PEOPLE_URL = 'people/id/';

function obtenerPersonaje(id, callback) {
	//Nos permite hacer un request
	$.get(
		`${API_URL}${PEOPLE_URL.replace('id', id)}`,
		{ crossDomain: true },
		function (luke) {
			console.log(`Hola, yo soy ${luke.name}`);
			callback && callback();
		}
	);
}

obtenerPersonaje(1, function () {
	obtenerPersonaje(2, function () {
		obtenerPersonaje(3);
	});
});
