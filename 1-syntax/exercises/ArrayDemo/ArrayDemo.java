public class ArrayDemo {
  public static void main(String[] args){
    // an array of ints with a length of 10
    int[] newArray = new int[10];
    System.out.println(newArray.length);

    String[] strings = {
      "Han Solo",
      "Luke Skywalker",
      "R2D2"
    };
    System.out.println(strings[0]);
    System.out.println(strings.length);
  }
}
