import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest {

    private Cart cart;
    private Customer customer;


    @Test
    public void checkbalance()
    {
        Customer customer = new Customer(10000,"Vivek");
        Assert.assertEquals(customer.getBalance(),10000);
    }

    @Test
    public void addBalance() {
        Customer customer = new Customer(10000,"Vivek");
        customer.addMoney(5000);
        Assert.assertEquals(customer.getBalance(),15000);
    }

    @Test
    public void remove_balance() {
        cart = new Cart();
        Apple apple = new Apple(Apple.category.Red,100,40);
        Milk milk = new Milk(100,40,Milk.type.CURD);
        Customer customer = new Customer(10000,"Vivek");
        cart.add(apple);
        cart.add(milk);

        double balance = customer.getBalance();
        double total_amount_to_pay = apple.getAmount()*apple.getPrice() + milk.getAmount()*milk.getPrice();

        double balance_now = balance - total_amount_to_pay;
        Assert.assertEquals(balance_now,2000.0);

        customer.removeMoney(total_amount_to_pay);
        Assert.assertEquals(customer.getBalance(),10000);
    }
    @Test
    public void TotalItemsInCart()
    {
        cart = new Cart();
        Customer customer = new Customer(10000,"Vivek");
        Apple apple = new Apple(Apple.category.Red,100,40);
        Milk milk = new Milk(100,40,Milk.type.CURD);
        cart.add(apple);
        cart.add(milk);
        double TotalItem = cart.total_cartItems();
        Assert.assertEquals(2,TotalItem);
    }

    @Test
    public void CanCheckout()
    {
        cart = new Cart();
        Apple apple = new Apple(Apple.category.Red,100,40);
        Milk milk = new Milk(100,40,Milk.type.CURD);
        Customer customer = new Customer(10000,"Vivek");
        cart.add(apple);
        cart.add(milk);

        double balance = customer.getBalance();
        double total_amount_to_pay = apple.getAmount()*apple.getPrice() + milk.getAmount()*milk.getPrice();

        double balance_now = balance - total_amount_to_pay;
        Assert.assertEquals(true,balance > total_amount_to_pay);
    }

    @Test
    public void CantCheckout()
    {
        cart = new Cart();
        Apple apple = new Apple(Apple.category.Red,100,40);
        Milk milk = new Milk(100,40,Milk.type.CURD);
        Customer customer = new Customer(1000,"Vivek");
        cart.add(apple);
        cart.add(milk);

        double balance = customer.getBalance();
        double total_amount_to_pay = apple.getAmount()*apple.getPrice() + milk.getAmount()*milk.getPrice();
        Assert.assertEquals(false,balance > total_amount_to_pay);
    }

    @Test
    public void remove_items_from_cart()
    {
        Apple apple = new Apple(Apple.category.Red,100,40);
        Milk milk = new Milk(100,40,Milk.type.CURD);
        Customer customer = new Customer(10000,"Vivek");
        cart.add(apple);
        cart.add(milk);
        cart.remove(milk);

        Assert.assertEquals(cart.total_cartItems(),3);
    }

    @Test
    public void change_items_amount_cart()
    {
        Cart cart = new Cart();
        Apple apple = new Apple(Apple.category.Red,100,40);
        Milk milk = new Milk(100,40,Milk.type.CURD);
        Customer customer = new Customer(10000,"Vivek");
        cart.add(apple);
        cart.add(milk);
        cart.update(apple,6,"add");
        cart.update(milk,10,"remove");
        int total_count = milk.getAmount() + apple.getAmount();
        Assert.assertEquals(total_count,196);
    }

}



