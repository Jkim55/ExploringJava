package inheritance01_lib;

public class Doer {
  public void doStuff() {
    System.out.println("Version 1");
  }

  public void doStuff(String message) {
    System.out.println("Version 2");
  }

  public void doStuff(String message, boolean important) {
    System.out.println("Version 3");
  }

  public void doStuff(boolean important, String message) {
    System.out.println("Version 4");
  }

}
