package factoryMethod2;

public class CouponFactory {
    public Coupon getCoupon(int points){
        if(points<50){
            return new FoodCoupon();
        }
        return new ElectronicsCoupon();
    }
}
