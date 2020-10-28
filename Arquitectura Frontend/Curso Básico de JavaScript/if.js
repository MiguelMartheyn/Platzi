var edad = 18;

if(edad === 18){
    console.log('Puedes votar, sera tu primera votación');
} else if(edad > 18){
    console.log('Puedes votar de nuevo')
}else{
    console.log('Aun no puedes votar')
}


// condition ? true : false; Operador Ternario

var numero = 1;

var resultado = numero === 1 ? "Si soy un uno" : "No, no soy uno";


function jugar(){

const opt1 = "piedra";
const opt2 = "papel";
const opt3 = "tijera";
let usuario = prompt("Querido usuario, por favor indica tu opción: piedra, papel o tijera?");
let options = new Array([]);
options = [opt1, opt2, opt3];
const optionsRandom = Math.floor(Math.random() * options.length);
const maquina = options[optionsRandom];

function validation() {

    if(usuario === opt1 && maquina === opt3){
        return "El usuario Gano";
    }else if(usuario === opt2 && maquina === opt1){
        return "El usuario Gano";
    }else if(usuario === opt2 && maquina === opt1){
        return "El usuario Gano";
    }else{
       return "La maquina Gano"
    }
}

const result = usuario === maquina? "Empate!" : validation();
console.log("El resultado es: "+result);

};
   









