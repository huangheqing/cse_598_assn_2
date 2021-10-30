public class Person {
  public String getLast() {
    return last;
  }

  public String getFirst() {
    return first;
  }

  public String getMiddle() {
    return middle;
  }

  private String last;
  private String first;
  private String middle;


  public Person(String last, String first, String middle) {
    this.last = last;
    this.first = first;
    this.middle = middle;

  }


  public void printName(int order) {

    if (order == 0) {
      System.out.println(first + "  " + middle + "  " + last);

    } else if (order == 1) {

      System.out.println(first + " ," + last + " " + middle);

    } else if (order == 2) {

      System.out.println(last + " ," + first + " " + middle);

    }
  }


}
