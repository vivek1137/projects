import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {

    ArrayList<Apple> apples;
    ArrayList<Newspaper> newspapers;
    ArrayList<Milk> milks;

    Cart() {
        apples = new ArrayList<Apple>();
        newspapers = new ArrayList<Newspaper>();
        milks = new ArrayList<Milk>();
    }
    public void add_apple_toCart(Apple apple) {
        apples.add(apple);
    }
    public void add_newpaper_toCart(Newspaper newspaper) {
        newspapers.add(newspaper);
    }
    public void add_Milk_toCart(Milk milk) {
        milks.add(milk);
    }
    public void remove_apple_toCart(Apple apple) {
        apples.remove(apple);
    }
    public void remove_newpaper_toCart(Newspaper newspaper) {
        newspapers.remove(newspaper);
    }
    public void remove_Milk_toCart(Milk milk) {
        milks.remove(milk);
    }

}
