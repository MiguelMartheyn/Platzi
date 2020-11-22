var miguel={
    nombre:'Miguel',
    apellido:'Martheyn',
    edad:27,
    peso:75
}


console.log(`Al inicio del año ${miguel.nombre} pesa ${miguel.peso}Kg`);

const INCREMENTO_PESO = 0.2;
const DIAS_DEL_AÑO = 365;

aumentarDePeso=persona=>persona.peso += INCREMENTO_PESO;
bajarDePeso=persona=>persona.peso -= INCREMENTO_PESO;



for(var i = 1; i <= DIAS_DEL_AÑO; i++){

    var random = Math.random();

    // random < 0.25? (miguel.peso += INCREMENTO_PESO):
    // random < 0.5&& (miguel.peso -= INCREMENTO_PESO);
    random < 0.25? (aumentarDePeso(miguel)):
    random < 0.5&& (bajarDePeso(miguel));


}




console.log(`Al final del año ${miguel.nombre} pesa ${miguel.peso.toFixed(1)}Kg`);