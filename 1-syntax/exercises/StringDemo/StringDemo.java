public class StringDemo {
  public static void main (String[] args){
    String strLiteral = "I'm a String Literal.";
    String strObj = new String("I'm a String Object");

    String fooLiteral = "String Literal";
    String barLiteral = "String Literal";

    String fooObj = new String("String Obj");
    String barObj = new String("String Obj");

    System.out.println("String Literal: " + strLiteral);
    System.out.println("String Object: " + strObj);

    System.out.println("fooLiteral" + fooLiteral);
    System.out.println("barLiteral" + barLiteral);

    System.out.println("== comparison on fooLiteral and barLiteral: " + (fooLiteral == barLiteral));
    System.out.println("== comparison on fooObj and barObj: " + (fooObj == barObj));

    System.out.println("equal() comparison on fooLiteral and barLiteral: " + fooLiteral.equals(barLiteral));
    System.out.println("equal() comparison on fooObj and barObj: " + fooObj.equals(barObj));

    String imImmutable = "I'm immutable";
    String fooImmutable = "I'm immutable";

    imImmutable = imImmutable + ", but it seems like I'm not.";
    System.out.println(imImmutable);

    fooImmutable = imImmutable;
    System.out.println("This is foo: " + fooImmutable);
  }
}
