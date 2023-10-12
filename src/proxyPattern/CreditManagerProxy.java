package proxyPattern;

public class CreditManagerProxy extends CreditBase{
    private CreditManager creditManager;
    private int cachedValue;
    @Override
    public int calculate() throws InterruptedException {
        if(creditManager == null){
            creditManager = new CreditManager();
            cachedValue = creditManager.calculate();
        }
        return cachedValue;
    }
}
