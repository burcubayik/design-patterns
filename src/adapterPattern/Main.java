package adapterPattern;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(new Log4NetAdapter());
        productManager.save();

    }
}
