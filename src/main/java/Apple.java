public class Apple {

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

    public boolean isAppleShimla() {
        return this.categories.equals(categories.Shimla);
    }

    public boolean isAppleRed() {
        return this.categories.equals(categories.Red);
    }

    public Apple.category getCategories() {
        return this.categories;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
