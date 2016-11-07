package inheritance04_lib;

public class Subtractor extends Calculator{
  int x;
  int y;

  public Subtractor(int x, int y) {
    super(x,y)
  }

  public int subtract() {
    return this.x - this.y;
  }
}
