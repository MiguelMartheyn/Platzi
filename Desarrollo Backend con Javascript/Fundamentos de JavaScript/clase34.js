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

let ids = [1, 2, 3, 4, 5, 6, 7];

var promesas = ids.map((map) => obtenerPersonaje(map));
Promise.all(promesas)
	.then((personajes) => console.log(personajes))
	.catch((id) => {
		console.log(`Hay un error, no pude obtener el id ${id}`);
	});
