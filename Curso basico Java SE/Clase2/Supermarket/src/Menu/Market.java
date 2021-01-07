package Menu;

import java.util.ArrayList;

public class Market {
    private String nameMarket;

    Market(String nameMarket){
        this.nameMarket = nameMarket;
    }

    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    // Array, Lista de productos
    ArrayList<Product> product = new ArrayList<>();


    public void addProduct(String nameProduct, int priceProduct, int stackProduct){

        product.add(new Market.Product(nameProduct,priceProduct,stackProduct));
    }

    public ArrayList<Product> getProduct(){
        return product;
    }

    //Clase anidada
    public static class Product {
        private String nameProduct;
        private int priceProduct;
        private int stackProduct;
        private int id = 0;
        private static  int contador = 0;
       
        Product(String nameProduct, int priceProduct, int stackProduct) {
            this.nameProduct = nameProduct;
            this.priceProduct= priceProduct;
            this.stackProduct = stackProduct;
            id = contador;
            contador++;
            
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public int getStackProduct() {
            return stackProduct;
        }

        public void setStackProduct(int stackProduct) {
            this.stackProduct = stackProduct;
        }
    }
}
