package proxyPattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //cashleme yapısına benziyor
        CreditBase manager = new CreditManagerProxy();



        System.out.println( manager.calculate());
        System.out.println( manager.calculate());


    }
}
