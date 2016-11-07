package inheritance04_lib;

public class Adder extends Calculator {
  int x;
  int y;

  public Adder(int x, int y) {
    super(x,y)
  }

  public int add() {
    return this.x + this.y;
  }
}
