package galvanize;

import inheritance01_lib.Doer;

public class callingDoer {
  public static void main(String[] args){
    Doer doer = new Doer();

    doer.doStuff();                       // calls version 1
    doer.doStuff("with a string");        // calls version 2
    doer.doStuff("with a string", true);  // calls version 3
    doer.doStuff(false, "with a string"); // calls version 4
  }
}
