public class PersonnelFactory {
  public Person createPerson(String personType, String last, String first, String middle, int id, double sal) {
    if (personType == null) {
      return null;
    }
    if (personType.equalsIgnoreCase("employee")) {
      return new Employee(last, first, middle, id, sal);
    } else if (personType.equalsIgnoreCase("executive")) {
      return new Executive(last, first, middle, personType);
    } else if (personType.equalsIgnoreCase("volunteer")) {
      return new Volunteer(last, first, middle, personType);
    } else if (personType.equalsIgnoreCase("security")) {
      return new Security(last, first, middle, personType);
    }
    return null;
  }
  public Personnel getPersonnel(String personType) {
    if (personType == null) {
      return null;
    }
    if (personType.equalsIgnoreCase("employee")) {
      return Employees.getInstance();
    } else if (personType.equalsIgnoreCase("executive")) {
      return Executives.getInstance();
    } else if (personType.equalsIgnoreCase("volunteer")) {
      return Volunteers.getInstance();
    } else if (personType.equalsIgnoreCase("security")) {
      return Securities.getInstance();
    }
    return null;
  }
}
