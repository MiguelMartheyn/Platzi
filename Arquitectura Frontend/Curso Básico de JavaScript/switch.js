var numero = 1;

switch(numero){
    case 1:
        console.log('soy uno');
        break;
    case 2: 
        console.log('soy un 10');
        break;
    case 100:
        console.log('soy un 100');
        break;
    default:
        console.log('no soy nada');
        break;
}

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
    

        switch(true){

            case (usuario === opt1 && maquina === opt3):
                return "El usuario Gano";
                break;
            case (usuario === opt2 && maquina === opt1):
                return "El usuario Gano";
                break;
            case (usuario === opt3 && maquina === opt2):
                return "El usuario Gano";
                break;
            default:
                return "La maquina Gano"
                break;
        }
    }
    
    const result = usuario === maquina? "Empate!" : validation();
    console.log("El resultado es: "+result);
    
    };