import java.util.ArrayList;
import java.util.List;

public class Volunteers implements Personnel {
  private static Volunteers ourInstance = new Volunteers();

  public  List<Person> getList() {
    return list;
  }

  private static List<Person> list;

  public static Volunteers getInstance() {
    return ourInstance;
  }

  private Volunteers() {
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
