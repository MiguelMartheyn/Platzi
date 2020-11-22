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


function imprimirNombreEnMayusculas(persona){
    //var nombre = persona.nombre
    var {nombre} =  persona;
    console.log(nombre.toUpperCase());
}

function imprimirNombreEdad(persona){
    //var nombre = persona.nombre
    var {nombre,apellido,edad} =  persona;
    console.log(`Hola, me llamo ${nombre} ${apellido} y tengo ${edad} años`);
}

imprimirNombreEnMayusculas(miguel);
imprimirNombreEnMayusculas(dario);
imprimirNombreEdad(miguel);
imprimirNombreEdad(dario);
//imprimirNombreEnMayusculas({nombre:'Pepito'});
//imprimirNombreEnMayusculas({apellido:'Gomez'});

