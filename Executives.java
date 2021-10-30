import java.util.ArrayList;
import java.util.List;

public class Executives implements Personnel {

  public  List<Person> getList() {
    return list;
  }

  private static List<Person> list;

  private static Executives ourInstance = new Executives();

  public static Executives getInstance() {
    return ourInstance;
  }

  private Executives() {
    list = new ArrayList<>();
  }

  @Override
  public void addPersonnel(Person p) {
    list.add(p);
  }

  @Override
  public int total() {
    return list.size();
  }
}
