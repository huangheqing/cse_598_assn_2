public class Volunteer extends Person {
  public String getType() {
    return type;
  }

  private String type;
  public Volunteer(String last, String first, String middle, String type) {
    super(last, first, middle);
    this.type = type;
  }
}
