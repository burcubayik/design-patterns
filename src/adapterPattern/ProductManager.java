package adapterPattern;

public class ProductManager {
    private final Logger logger;

    public ProductManager(Logger logger) {
        this.logger = logger;
    }

    public void save(){
        logger.log("Product Data");
        System.out.println("Saved to DB");
    }
}
