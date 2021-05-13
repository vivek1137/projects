import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer implements eWallet{


    Items items;
    private int available_cash;
    public Customer(int available_cash) {
        this.available_cash = available_cash;
    }


    @Override
    public void addMoney(int money) {
        this.available_cash = money + this.available_cash;
    }

    @Override
    public int cash_available() {
        return  this.available_cash;
    }
    @Override
    public void removeMoney(int money) {
        if(money >= this.available_cash)
             this.available_cash = this.available_cash - money;
        else {
            System.out.println("Insufficient balance");
        }

    }
}
