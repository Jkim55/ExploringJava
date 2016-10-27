public class Rect {
  public int width;
  public int length;

  public Rect (int width, int length){
    this.width = width;
    this.length = length;
  }

  public int Area() {
    return this.width * this.length;
  }

  public static void main(String[] args){
    Rect newRect = new Rect(2, 4);
    System.out.println(newRect.Area());
  }
}
