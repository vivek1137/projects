public class Milk implements Product{

    enum type {
        TONED,
        CURD,
        EXTRA_MALAI,
    }

    private int amount;
    private int price;
    Milk.type types ;

    Milk(int amount,int price,Milk.type type) {
        this.amount = amount;
        this.price = price;
        this.types = type;
    }

    public Milk.type getTypes() {
        return this.types;
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
