import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {


    Items items;

    Shop() {
        items = new Items();
    }

    public void add_apple(Apple apple) {
        this.items.apples.add(apple);
    }

    public void add_newspapers(Newspaper newspaper) {
        this.items.newspapers.add(newspaper);
    }

    public void add_milk(Milk milk) {
        this.items.milks.add(milk);
    }

    public void remove_apple(Apple apple) {
        List<Apple> apples = this.items.apples.stream().filter((s) -> s.getCategories().equals(apple.getCategories())).collect(Collectors.toList());
        this.items.apples.remove(apples);
    }

    public void remove_milk(Milk milk) {
        List<Milk> milks = this.items.milks.stream().filter((s) -> s.getTypes().equals(milk.getTypes())).collect(Collectors.toList());
        this.items.milks.remove(milks);
    }

    public void remove_newspapers(Newspaper newspaper) {
        List<Newspaper> newspapers = this.items.newspapers.stream().filter((s) -> s.getCa().equals(newspaper.getCa())).collect(Collectors.toList());
        this.items.newspapers.remove(newspapers);
    }

}



