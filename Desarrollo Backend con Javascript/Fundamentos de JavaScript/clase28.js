const API_URL = 'https://swapi.dev/api/';
const PEOPLE_URL = 'people/id/';

//Nos permite hacer un request
$.get(
	`${API_URL}${PEOPLE_URL.replace('id', 1)}`,
	{ crossDomain: true },
	function (luke) {
		console.log(`Hola, yo soy ${luke.name}`);
	}
);
