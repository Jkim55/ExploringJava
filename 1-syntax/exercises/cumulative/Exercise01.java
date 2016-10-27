/*

Convert the following JavaScript to Java:

  console.log("Hello, my name is [insert your name here]")

You'll have to:

- define a class named `Exercise01`
- define the `main` method correctly
- use System.out.println to print the string
- compile with `javac Exercise01.java`
- run with `java Exercise01`

*/
public class Exercise01 {
  public static String greeting (String name) {
    return "Hello, my name is " + name + ".";
  }

  public static void main(String[] args){
    System.out.println(greeting("Ji Kim"));
  }
}
