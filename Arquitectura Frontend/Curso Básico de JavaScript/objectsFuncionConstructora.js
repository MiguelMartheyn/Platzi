function auto(marca,modelo,anio){
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
 
 }

 var autoNuevo = new auto('Tesla','Model 3',2020);
 var longitud = new auto.length


 function auto (marca, modelo, anio){
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }
  let autos = [];
  for(let i = 0; i < 30 ; i++){
    let marca = prompt("Ingresa la marca del auto");
    let modelo = prompt("Ingresa el modelo del auto");
    let anio = prompt("Ingresa el año del auto");
    autos.push(new auto (marca, modelo, anio));
  }
  
  for(let i = 0; i < autos.length ; i++){
    console.log(autos[i]);
  }