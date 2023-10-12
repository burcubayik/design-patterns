package abstractFactory;

public class RedisCache extends Caching{
    @Override
    public void cache(String data) {
        System.out.println("Cached with redis");
    }
}
