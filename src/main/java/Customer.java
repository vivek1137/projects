import java.util.List;

public class Customer implements Wallet {


    private double balance;
    private String name;
    public List<Cart> cart;
    public Customer(double available_cash,String name) {
        this.balance = available_cash;
        this.name = name;
    }

    @Override
    public void addMoney(double money) {
        this.balance = money + this.balance;
    }

    @Override
    public double getBalance() {
        return  this.balance;
    }
    @Override
    public void removeMoney(double money) {
        if(money >= this.balance)
             this.balance = this.balance - money;
    }
}
