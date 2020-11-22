var miguel = {
    nombre: 'Miguel',
    apellido: 'Martheyn',
    edad: 27,
    ingeniero: true,
    cocinero: false,
    cantante: false,
    dj: false,
    guitarrista: false,
    drone: true
}

function imprimirProfesiones(persona){

console.log(`${persona.nombre} es:`)

if(persona.ingeniero === true){
console.log('Ingeniero')
}

if(persona.cocinero === true){
    console.log('Cocinero')
    }
if(persona.drone === true){
console.log(' Piloto de drone')
}
}

function imprimirSiEsMayorDeEdad(persona){
    const {nombre, edad} = persona;
    console.log(`${nombre} es ${edad >= 18?'mayor':'menor'} de edad`)
}