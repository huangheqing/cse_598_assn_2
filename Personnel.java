import java.util.ArrayList;

public class Personnel {

  public ArrayList<Person> getPersonList() {
    return personList;
  }

  private ArrayList<Person> personList;

  public Personnel() {
    personList = new ArrayList<>();
  }

  public void addPersonnel(Person p) {
    personList.add(p);
  }

  public int total() {
    return personList.size();
  }
}
