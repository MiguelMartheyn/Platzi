var signo = prompt('Cual es tu signo?');


switch (signo) {
    case 'aries':
        console.log('info aries')
        break;
    case 'acuario':
        console.log('info acuario')
        break;
    case 'piscis':
        console.log('info piscis')
        break;   

    default:
        console.log('Digite un valor adecuado')
        break;
}