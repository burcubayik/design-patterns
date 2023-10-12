package abstractFactory;

public class ProductManager {
    private final CrossCuttingConcernsFactory crossCuttingConcernsFactory;

    public ProductManager(CrossCuttingConcernsFactory crossCuttingConcernsFactory) {
        this.crossCuttingConcernsFactory = crossCuttingConcernsFactory;
    }

    public void getAll(){
        crossCuttingConcernsFactory.createLogger().log("sfsd");
        crossCuttingConcernsFactory.createCaching().cache("ysdgdg");
        System.out.println("Products listed!");
    }
}
