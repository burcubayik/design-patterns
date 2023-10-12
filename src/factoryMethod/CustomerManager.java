package factoryMethod;

public class CustomerManager {
   private final ILoggerFactory loggerFactory;

    public CustomerManager(ILoggerFactory loggerFactory) {
        this.loggerFactory = loggerFactory;
    }

    public void save(){
        System.out.println("Saved");
        Logger logger = loggerFactory.createLogger();
        logger.log();
    }
}
