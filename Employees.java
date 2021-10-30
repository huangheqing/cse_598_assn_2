import java.util.ArrayList;
import java.util.List;

public class Employees implements Personnel {
  private static Employees ourInstance = new Employees();

  public  List<Person> getList() {
    return list;
  }

  private static List<Person> list;

  public static Employees getInstance() {
    return ourInstance;
  }

  private Employees() {
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
