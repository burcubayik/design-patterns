package adapterPattern;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(String.format("Logged, %s",message));
    }
}
