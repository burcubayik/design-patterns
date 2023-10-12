package abstractFactory;

public class MemCache extends Caching{
    @Override
    public void cache(String data) {
        System.out.println("Cached with MemCache");
    }
}
