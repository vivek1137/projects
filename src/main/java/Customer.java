import java.util.List;

public class Customer  {


    private String name;
    public Cart cart;
    Wallet wallet;
    public Customer(String name,Wallet wallet) {
        this.wallet = wallet;
        this.name = name;
    }
    public void AddToCart(Product product)
    {
        cart.add(product);
    }

    public void RemoveFromCart(Product product)
    {
        cart.remove(product);
    }

    private double GetTotalPrice()
    {
        return cart.GetTotalPrice();
    }

    public double GetWalletBalance()
    {
        return wallet.getBalance();
    }

    public void PayFromEWallet() throws Exception {
        wallet.DeductAmount(GetTotalPrice());
        EmptyCart();
    }



    private void EmptyCart()
    {
        cart.EmptyCart();
    }

}
