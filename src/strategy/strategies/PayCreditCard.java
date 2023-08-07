package strategy.strategies;

public class PayCreditCard implements PayStrategy {
    @Override
    public void payment() {
        System.out.println("Выбрана оплата картой");
    }
}
