public class Main {
    public static void main(String[] args) {


        int i = 1;
        Girl myAnimals = new Girl("Karina");
        myAnimals.addAnimal("Perro",
                "especie perro",
                "caracteristica perro",
                "Me gusta el perro");
        myAnimals.addAnimal("Gato",
                "especie gato",
                "caracteristica gato",
                "Me gusta el gato");
        myAnimals.addAnimal("Pato",
                "especie pato",
                "caracteristica pato",
                "Me gusta el pato");

        System.out.println("\t\t\t\t Mi visita al Zoologico");
        System.out.println("Mi nombre es: "+ myAnimals.getNameGirl()+"\n\n");
        for (Girl.Animal aA:myAnimals.getAnimal()
        ) {
            System.out.println("Animal "+i+"\n");
            System.out.println("Animal: "+ aA.getName()+"\nEspecie: "
                    + aA.getSpecie()+"\nCaracteristicas: "
                    +aA.getFeatures()+"\nLo que me gusto: "
                    +aA.getDescription()+"\n");
            i++;
        }

    }
}
