import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {

    private List<Product> products;

    Cart() {
       this.products = new ArrayList<Product>();
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void remove(Product product) {
        this.products.remove(product);
    }

    public int total_cartItems() {
        return products.size();
    }

    public double GetTotalPrice()
    {
        double total = 0;
        for(Product product : products) {
            total = total + product.getAmount()*product.getPrice();
        }
        return total;
    }

    public void EmptyCart()
    {
        products.clear();
    }
}
