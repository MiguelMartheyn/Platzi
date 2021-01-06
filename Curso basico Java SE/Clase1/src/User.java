public class User {
    private String name;
    private int account;

    User(String name, int account){
        this.name = name;
        this.account = account;
    }

    public void showName(){
        System.out.println("Nombre del Cliente: " + name);
        System.out.println("");
    }
    public void showAccount(){
        System.out.println("Saldo del Cliente: " + account);
        System.out.println("");
    }

    public void addCash(int cash){
        this.account += cash;
        System.out.println("Nuevo saldo del Cliente: " + account);
        System.out.println("");
    }
    public void deleteCash(int cash){
        if(this.account >= cash) {
            this.account -= cash;
            System.out.println("Nuevo saldo del Cliente: " + account);
            System.out.println("");
        }else{
            System.out.println("No cuenta con saldo sufifiente");
            System.out.println("Saldo actual del Cliente: " + account);
            System.out.println("");
        }
    }
}
