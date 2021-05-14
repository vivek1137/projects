import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest {

    private Cart cart;
    private Customer customer;


    @Test
    public void checkbalance()
    {
        Wallet wallet = new Wallet(100000);
        Customer customer = new Customer("Vivek",wallet);
        Assert.assertEquals(customer.GetWalletBalance(),10000);
    }

    @Test
    public void addBalance() {

        Wallet wallet = new Wallet(100000);
        Customer customer = new Customer("Vivek",wallet);
        customer.GetWalletBalance();
        Assert.assertEquals(customer.GetWalletBalance(),15000);
    }

    @Test
    public void TotalItemsInCart()
    {
        cart = new Cart();
        Wallet wallet = new Wallet(100000);
        Customer customer = new Customer("Vivek",wallet);
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
        Wallet wallet = new Wallet(100000);
        Customer customer = new Customer("Vivek",wallet);
        cart.add(apple);
        cart.add(milk);

        double balance = customer.GetWalletBalance();
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
        Wallet wallet = new Wallet(100000);
        Customer customer = new Customer("Vivek",wallet);
        cart.add(apple);
        cart.add(milk);

        double balance = customer.GetWalletBalance();
        double total_amount_to_pay = apple.getAmount()*apple.getPrice() + milk.getAmount()*milk.getPrice();
        Assert.assertEquals(false,balance > total_amount_to_pay);
    }

    @Test
    public void remove_items_from_cart()
    {
        Apple apple = new Apple(Apple.category.Red,100,40);
        Milk milk = new Milk(100,40,Milk.type.CURD);
        Wallet wallet = new Wallet(100000);
        Customer customer = new Customer("Vivek",wallet);
        cart.add(apple);
        cart.add(milk);
        cart.remove(milk);

        Assert.assertEquals(cart.total_cartItems(),3);
    }

}



