public class Executive extends Person {
  public String getType() {
    return type;
  }

  private String type;
  public Executive(String last, String first, String middle, String type) {
    super(last, first, middle);
    this.type = type;
  }

}
