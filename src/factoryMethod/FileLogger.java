package factoryMethod;

public class FileLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Logged with FileLogger");
    }
}
