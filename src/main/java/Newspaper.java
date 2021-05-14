public class Newspaper implements Product{



    enum category {
        HINDU,
        HINDUSTAN_TIMES,
        DAINIK_BHASKAR
    }
    private int amount;
    private int price;
    Newspaper.category category;
    Newspaper(Newspaper.category categories, int amount , int price) {
        this.category = categories;
        this.amount = amount;
        this.price = price;
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
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Newspaper.category getCa() {
        return category;
    }
}
