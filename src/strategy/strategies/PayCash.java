package strategy.strategies;

public class PayCash implements PayStrategy {

    @Override
    public void payment() {
        System.out.println("Выбрана оплата наличными");
    }
}
