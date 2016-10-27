public class DemoObject {
  public int foo;

  public DemoObject(int _foo){
    this.foo = _foo;
  }

  public void printMe(){
    System.out.println(this); // prints: memory address & type of the object instance
  }

  public void printFoo(){
    System.out.println(this.foo); // prints value of the object instance's foo variable
  }

  public static void main(String[] args){
    DemoObject objOne = new DemoObject(1);
    objOne.printMe();
    objOne.printFoo();

    DemoObject objTwo = new DemoObject(2);
    objTwo.printMe();
    objTwo.printFoo();
  }
}
