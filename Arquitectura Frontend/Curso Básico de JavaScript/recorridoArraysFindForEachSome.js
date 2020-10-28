var articulos = [
    { nombre: 'bici', costo: 3000},
    { nombre: 'Tv', costo: 2500},
    { nombre: 'Libro', costo: 320},
    { nombre: 'Celular', costo: 10000},
    { nombre: 'Laptop', costo: 20000},
    { nombre: 'Teclado', costo: 500},
    { nombre: 'Audifonos', costo: 1700}
 
 ];

 let encuentraArticulo = articulos.find(find => find.nombre === 'Laptop');
 articulos.forEach(articulo => console.log(articulo.costo));
 let articulosBaratos = articulos.some(some => some.costo <= 700);