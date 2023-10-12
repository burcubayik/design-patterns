package abstractFactory;

public class Log4NetLogger extends Logging{
    @Override
    public void log(String message) {
        System.out.println("Logged with log4net");
    }
}
