package abstractFactory;

public abstract class CrossCuttingConcernsFactory {

    public abstract Logging createLogger();
    public abstract Caching createCaching();

}
