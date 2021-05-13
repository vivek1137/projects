public class Newspaper {

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

    public int getAmount() {
        return amount;
    }

    public Newspaper.category getCa() {
        return ca;
    }
}
