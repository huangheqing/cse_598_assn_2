public class Security extends Person {
  public String getType() {
    return type;
  }

  private String type;
  public Security(String last, String first, String middle, String type) {
    super(last, first, middle);
    this.type = type;
  }
}
