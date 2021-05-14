import java.util.ArrayList;
import java.util.List;

public class Apple implements Product{

    enum category {
        Shimla,
        Red
    }
    private int amount;
    private int price;
    Apple.category categories;

    Apple(Apple.category categories,int amount,int price) {
        this.price = price;
        this.amount = amount;
        this.categories = categories;
    }
    public Apple.category getCategories() {
        return this.categories;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
