package Menu;

import java.util.ArrayList;

public class MenuRecipes {
    private String nameRestaurant;

    MenuRecipes(String nameRestaurant){
        this.nameRestaurant = nameRestaurant;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    // Array, Lista de las recetas
    ArrayList<Product> product = new ArrayList<>();


    public void addProduct(String nameProduct, int priceProduct){

        product.add(new MenuRecipes.Product(nameProduct,priceProduct));
    }

    public ArrayList<Product> getProduct(){
        return product;
    }

    //Clase anidada
    public static class Product {
        private String nameProduct;
        private int priceProduct;

        private int id = 0;
        private static  int contador = 0;

        Product(String nameProduct, int priceProduct) {
            this.nameProduct = nameProduct;
            this.priceProduct= priceProduct;
            id = contador;
            contador++;

        }

        public String getNameProduct() {
            return nameProduct;
        }

        public void setNameProduct(String nameProduct) {
            this.nameProduct = nameProduct;
        }

        public int getPriceProduct() {
            return priceProduct;
        }

        public void setPriceProduct(int priceProduct) {
            this.priceProduct = priceProduct;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}