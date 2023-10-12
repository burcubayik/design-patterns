package factoryMethod;

public class LoggerFactory implements ILoggerFactory{
    public Logger createLogger(){
        //duruma göre burada iş geliştirip buna göre logla diyebiliriz. değişikliği buradan yönetmiş oluruz
        return new FileLogger();

    }
}
