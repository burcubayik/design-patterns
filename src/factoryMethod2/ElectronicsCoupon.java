package factoryMethod2;

import java.util.UUID;

public class ElectronicsCoupon implements Coupon{
    @Override
    public String code() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String message() {
        return "I am an electronic coupon";
    }
}
