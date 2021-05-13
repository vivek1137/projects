import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Items {

    ArrayList<Newspaper> newspapers;
    ArrayList<Milk> milks;
    ArrayList<Apple> apples;
    Apple apple;
    Milk milk;
    Newspaper newspaper;


    Items() {

        newspapers = new ArrayList<Newspaper>();
        milks = new ArrayList<Milk>();
        apples = new ArrayList<Apple>();
    }

    public boolean canAppleBeBought(Apple.category type,int quantity) {

        List<Apple> apple = getApples();
        long count = apple.stream().filter((s)-> s.getCategories().equals(type) && s.getAmount() > quantity).count();
        return count >0;

    }

    public boolean canMilkBeBought(Milk.type type,int quantity) {

        List<Milk> milks = getMilks();
        long count = milks.stream().filter((s)-> s.getTypes().equals(type) && s.getAmountofMilk() > quantity).count();
        return count > 0;
    }

    public boolean canNewspaperBeBought(Newspaper.category type,int quantity) {

        List<Newspaper> newspapers = getNewspapers();
        long count = newspapers.stream().filter((s) -> s.getCa().equals(type) && s.getAmount() > quantity).count();
        return count > 0;
    }

    public ArrayList<Apple> getApples() {
        return apples;
    }

    public ArrayList<Milk> getMilks() {
        return milks;
    }

    public ArrayList<Newspaper> getNewspapers() {
        return newspapers;
    }
}
