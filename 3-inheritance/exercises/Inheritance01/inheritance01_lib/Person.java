package inheritance01_lib;

public class Person {
  public void printName(String first, String last) {
    System.out.println(first + " " + last);
  }

  public void printName(String first, String middle, String last) {
    System.out.println(first + " " + middle + " " + last);
  }

  public void printName(String first, String last, int lastFirst) {
    System.out.println(last + ", " + first);
  }
}
