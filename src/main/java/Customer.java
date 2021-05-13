import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer implements eWallet{


    private int available_cash;
    public Customer(int available_cash) {
        this.available_cash = available_cash;
    }
    Items items = new Items();

    public void buy_apple(Apple.category category,int quantity) {
        boolean check = items.canAppleBeBought(category,quantity);
        if(check) {
            long count = items.milks.stream().filter((s) -> s.getAmountofMilk()*s.getPrice() <= available_cash).count();
            if(count > 0) {
                System.out.println("Apple bought");
            }
        }
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
