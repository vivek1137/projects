public class Newspaper implements Product{



    enum category {
        HINDU,
        HINDUSTAN_TIMES,
        DAINIK_BHASKAR
    }
    private int amount;
    private int price;
    Newspaper.category ca;
    Newspaper(Newspaper.category categories, int amount , int price) {
        this.ca = categories;
        this.amount = amount;
        this.price = price;
    }

    public boolean isNewsPaperHindu() {
        return this.ca.equals(ca.HINDU);
    }

    public boolean isNewsPaperHindustanTimes() {
        return this.ca.equals(ca.HINDUSTAN_TIMES);
    }
    public boolean isNewsPaperDainikBhaskar() {
        return this.ca.equals(ca.DAINIK_BHASKAR);
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

    public Newspaper.category getCa() {
        return ca;
    }
}
