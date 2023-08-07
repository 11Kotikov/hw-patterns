package strategy;

import strategy.costumer.Customer;
import strategy.strategies.PayCash;
import strategy.strategies.PayCreditCard;
import strategy.strategies.PayStrategy;

//очень простая реализация способов оплаты через паттерн стратегия
public class Main {
    public static void main(String[] args) {
        PayStrategy cash = new PayCash();
        PayStrategy credit = new PayCreditCard();

        Customer customer1 = new Customer(cash);
        Customer customer2 = new Customer(credit);


        customer1.PayMoney();
        customer2.PayMoney();
    }
}
