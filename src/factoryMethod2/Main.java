package factoryMethod2;

public class Main {
    public static void main(String[] args) {
        //alışverişte puan topluyorsun
        // belli bir tutarın altında alışveriş yaptıysan sana yemek çeki veriyor
        // üstündeysen elektronik eşya için çek veriyor

        CouponFactory factory = new CouponFactory();
        Coupon coupon= factory.getCoupon(30);
        System.out.println(String.format("Coupon code : %s, message: %s",coupon.code(),coupon.message()));

        Coupon coupon2= factory.getCoupon(65);
        System.out.println(String.format("Coupon code : %s, message: %s",coupon2.code(),coupon2.message()));
    }
}
