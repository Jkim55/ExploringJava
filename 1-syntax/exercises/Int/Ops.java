public class Ops {
  public static int sum(int x, int y){
    return x + y;
  }
  public static int multiply(int x, int y, int z){
    return x * y * z;
  }

  public static int power(int x) {
    for(int i=0; i<2;i++){
      x = x * x;
    }
    return x;
  }

  public static void main(String [] args){
    System.out.println( sum (1,2) );
    System.out.println( multiply (12, 10, 2) );

    int first;
    first = 1;
    int second = 2;
    int result = sum(first, second);

    System.out.println( result );
    System.out.println( power(2));
  }

}
