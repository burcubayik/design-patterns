package abstractFactory;

public class NLogger extends Logging{
    @Override
    public void log(String message) {
        System.out.println("Logged with nLogger");
    }
}
