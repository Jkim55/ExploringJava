package inheritance04_lib;

public class Multiplier extends Calculator{
  int x;
  int y;

  public Multiplier(int x, int y) {
    super(x,y)
  }

  public int multiply() {
    return this.x * this.y;
  }
}
