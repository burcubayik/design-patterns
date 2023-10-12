package factoryMethod;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager= new CustomerManager(new LoggerFactory());
        customerManager.save();

    }

}
