var articulos = [
    { nombre: 'bici', costo: 300},
    { nombre: 'Tv', costo: 2500},
    { nombre: 'Libro', costo: 320},
    { nombre: 'Celular', costo: 10000},
    { nombre: 'Laptop', costo: 20000},
    { nombre: 'Teclado', costo: 500},
    { nombre: 'Audifonos', costo: 1700}
 
 ];

 let articulosFiltrados = articulos.filter(filter => filter.costo <= 500);
 let nombreArticulos = articulos.map(map => map.nombre);