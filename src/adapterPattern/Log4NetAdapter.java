package adapterPattern;

public class Log4NetAdapter implements Logger{
    @Override
    public void log(String message) {
        Log4Net log4Net = new Log4Net();
        log4Net.logMessage(message);
    }
}
