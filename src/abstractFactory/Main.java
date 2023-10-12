package abstractFactory;

public class Main {
    //Factorye ek olarak toplu nesne ihtiyacında kullanılır
    //cross cutting concernlerde çok kullanılır
    public static void main(String[] args) {
        ProductManager productManager= new ProductManager(new Factory());
        productManager.getAll();
    }

}
