import java.util.ArrayList;
import java.util.List;

public class Securities implements Personnel {
  public List<Person> getList() {
    return list;
  }

  private static List<Person> list;
  private static Securities ourInstance = new Securities();

  public static Securities getInstance() {
    return ourInstance;
  }

  private Securities() {
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
