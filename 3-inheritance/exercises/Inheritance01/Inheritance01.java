package galvanize;

import inheritance01_lib.Person;

public class Inheritance01 {
  public static void main(String[] args){
    Person person = new Person();
    person.printName("Ed", "Eades");
    person.printName("Ji", "Young", "Kim");
    person.printName("Ji", "Kim", 33);
  }
}
