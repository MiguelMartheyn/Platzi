import java.util.ArrayList;

public class Girl {
    private String nameGirl;

    Girl(String nameGirl){
        this.nameGirl = nameGirl;
    }

    public String getNameGirl() {
        return nameGirl;
    }

    public void setNameGirl(String nameGirl) {
        this.nameGirl = nameGirl;
    }

    // Guardo los animales, con ayuda de mi clase anidada
    ArrayList<Animal> animal = new ArrayList<>();


    public void addAnimal(String name, String specie, String features, String description){

        animal.add(new Girl.Animal(name,specie,features,description));
    }

    public ArrayList<Animal> getAnimal(){
        return animal;
    }

    //Clase anidada
    public static class Animal{
        private String name;
        private String specie;
        private String features;
        private String description;

        Animal(String name, String specie, String features, String description){
            this.name = name;
            this.specie = specie;
            this.features = features;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSpecie() {
            return specie;
        }

        public void setSpecie(String specie) {
            this.specie = specie;
        }

        public String getFeatures() {
            return features;
        }

        public void setFeatures(String features) {
            this.features = features;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
