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

    public void update(Product product,int amount,String signal) {
        if(signal.equals("add")) {
            product.setAmount(amount + product.getAmount());
        }
       if(signal.equals("remove")) {
           product.setAmount(product.getAmount()-amount);
       }
    }

    public int total_cartItems() {
        return products.size();
    }

}
