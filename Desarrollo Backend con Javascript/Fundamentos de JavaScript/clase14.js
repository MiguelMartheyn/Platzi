var miguel={
    nombre:'Miguel',
    apellido:'Martheyn',
    edad:27,
    peso:75
}


console.log(`Al inicio del año ${miguel.nombre} pesa ${miguel.peso}Kg`);

const INCREMENTO_PESO = 0.3;
const DIAS_DEL_AÑO = 365;

aumentarDePeso=persona=>persona.peso += INCREMENTO_PESO;
bajarDePeso=persona=>persona.peso -= INCREMENTO_PESO;
comeMucho = ()=>Math.random() < 0.3;
realizaDeporte = () => Math.random() < 0.4;

const META = miguel.peso - 3;
var dias = 0;

while(miguel.peso > META){
    
    comeMucho()&&aumentarDePeso(miguel);
    realizaDeporte()&&bajarDePeso(miguel);
    dias += 1;

}




console.log(`pasaron ${dias} dias hasta que  ${miguel.nombre} adelgazo 3Kg`);