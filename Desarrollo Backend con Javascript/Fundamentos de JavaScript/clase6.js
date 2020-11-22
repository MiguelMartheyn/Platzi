var miguel = {
    nombre: 'Miguel', 
    apellido: 'Martheyn',
    edad: 27

};

var dario = {
    nombre: 'Dario', 
    apellido: 'Susnisky',
    edad: 27

};


function imprimirNombreEnMayusculas({nombre}){
    console.log(nombre.toUpperCase());
}

imprimirNombreEnMayusculas(miguel);
imprimirNombreEnMayusculas(dario);
//imprimirNombreEnMayusculas({nombre:'Pepito'});
//imprimirNombreEnMayusculas({apellido:'Gomez'});