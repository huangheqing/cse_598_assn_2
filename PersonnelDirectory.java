import java.util.Scanner;

public class PersonnelDirectory {


  public static void main(String[] args) {
    PersonnelFactory per = new PersonnelFactory();
    Scanner scan = new Scanner(System.in);
    String firstN, lastN, middleN;
    String personType;
    int empID;
    double salary;
    int choice = -1;


    do {
      System.out.println("Welcome to the Personnel Directory Management System");
      System.out.println("====================================================");

      System.out.println("\n\n\t 1. Add Personel");
      System.out.println("\n\t 2. Find Personel");
      System.out.println("\n\t 3. Print Names");
      System.out.println("\n\t 4. Number of Entries in the Directory");

      System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");
      choice = scan.nextInt();
      scan.nextLine();

      switch (choice) {
        case 1:
          System.out.println("Enter person type(employee, executive, volunteer, security): ");
          personType = scan.nextLine();
          System.out.println("Enter first name: ");
          firstN = scan.nextLine();
          System.out.println("Enter last name: ");
          lastN = scan.nextLine();
          System.out.println("Enter middle name: ");
          middleN = scan.nextLine();

          System.out.println("Enter empploy id : ");
          empID = scan.nextInt();
          System.out.println("Enter base salaey");
          salary = scan.nextDouble();
          scan.nextLine();

          per.getPersonnel(personType)
             .addPersonnel(per.createPerson(personType, lastN, firstN, middleN, empID, salary));

          break;

        case 2:
          System.out.println("Enter person type(employee, executive, volunteer, security): ");
          personType = scan.nextLine();
          System.out.println("Enter firts name : ");
          firstN = scan.nextLine();
          System.out.println("Enter last name : ");
          lastN = scan.nextLine();

          boolean found = false;
          int loc = -1;
          for (int i = 0; i < per.getPersonnel(personType).total(); i++) {
            if (per.getPersonnel(personType).getList().get(i).getFirst().equals(firstN) && per.getPersonnel(personType)
                                                                                              .getList()
                                                                                              .get(i)
                                                                                              .getLast()
                                                                                              .equals(lastN)) {
              found = true;
              loc = i;
            }
          }

          if (found) {
            System.out.println("Found");
            per.getPersonnel(personType).getList().get(loc).printName(0);

          } else {
            System.out.println("not found");
            Person p1 = new Person(lastN, firstN, " ");
            per.getPersonnel(personType).getList().add(p1);
          }

          break;

        case 3:
          System.out.println("Enter person type(employee, executive, volunteer, security): ");
          personType = scan.nextLine();
          System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
          int order = scan.nextInt();
          for (int i = 0; i < per.getPersonnel(personType).total(); i++) {

            per.getPersonnel(personType).getList().get(i).printName(order);
          }

          break;

        case 4:
          System.out.println("Enter person type(employee, executive, volunteer, security): ");
          personType = scan.nextLine();
          System.out.println("Total Entries : " + per.getPersonnel(personType).total());

          break;

      }

    } while (true);


  }

}
