public class Milk {



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

    public int getAmountofMilk() {
        return this.amount;
    }

    public Milk.type getTypes() {
        return this.types;
    }

    public int getPrice() {
        return price;
    }
}
