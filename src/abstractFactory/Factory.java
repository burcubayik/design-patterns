package abstractFactory;

public class Factory extends CrossCuttingConcernsFactory{
    @Override
    public Logging createLogger() {
        //iş kurallarımız
        return new Log4NetLogger();
    }

    @Override
    public Caching createCaching() {
        //iş kurallarımız
        return new RedisCache();
    }
}
