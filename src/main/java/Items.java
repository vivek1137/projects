import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Items {

    ArrayList<Newspaper> newspapers;
    ArrayList<Milk> milks;
    ArrayList<Apple> apples;


    Items() {
        newspapers = new ArrayList<Newspaper>();
        milks = new ArrayList<Milk>();
        apples = new ArrayList<Apple>();
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
