package strategy.costumer;

import strategy.strategies.PayStrategy;

public class Customer {
    private PayStrategy buying;
    public Customer (PayStrategy payment) {
        this.buying = payment;
    }
    public void PayMoney(){
        buying.payment();
    }
}
