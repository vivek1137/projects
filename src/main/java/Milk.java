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

    public boolean isMilkExtra() {
        return this.types.equals(type.EXTRA_MALAI);
    }

    public boolean isMilkToned() {
        return this.types.equals(type.TONED);
    }
    public boolean iscurd() {
        return this.types.equals(type.CURD);
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
