## Java is Compiled
JavaScript code is initially **interpreted**. We can just send the code *as it is written* to a browser - the browser will read and execute the code line by line.


Java code is **compiled** to **bytecode**. Bytecode is a set of instructions that a machine can understand. We can then use the Java Virtual Machine (JVM) to **execute** the compiled bytecode. Thus, we can run our Java code anywhere we can have a JVM.


## Java code must be contained within a class.
- A class may contain methods.
- The main method is a special method that is executed when you run the class file with the java command.

```java
// filename: Hello.java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello, Java!");
    }

}
```

In order to run our `hello.java` we first have to compile it using the `javac` (**java compiler**) command

```bash
javac Hello.java
```

If there are no errors, Javac took our `hello.java` and compiled it to bytecode stored a file named `Hello.class`. Given the bytecode, we can tell the Java Virtual Machine (JVM) to execute it using the `java` command

```bash
java Hello
// prints: Hello, Java!
```
(no .class needed in running `java Hello`)

##Java Types ad Methods
- methods must have a return type.
  if a method does not return anything, it must have a return type of void.
- variables must have a type.
- parameters must have a type.

Java is statically typed aka need to explicitly specify the \_type_s of the following:
- variables
- parameters of methods
- return values of methods
- Arrays, HashMaps etc...

once a variable has been declared its type cannot be changed.

Java has both **primitive** and **reference** types.

Here is a chart of the most commonly used primitive types:

<table>
  <tr>
    <th>Type</th>
    <th>Precision</th>
    <th>Example</th>
  </tr>
  <tr>
    <td>`int` & `long`</td>
    <td>natural numbers</td>
    <td>0, -10, 2, -2000, 10, 1</td>
  </tr>
  <tr>
    <td>`float` & `double`</td>
    <td>floating point numbers</td>
    <td>3.14156f, -52f, 59957422.234234f</td>
  </tr>
  <tr>
    <td>`boolean`</td>
    <td>binary logic</td>
    <td>true, false</td>
  </tr>
  <tr>
    <td>`char`</td>
    <td>A single Unicode character (single quote)</td>
    <td>'a', 'b', 'c'</td>
  </tr>
  <tr>
    <td>`String`</td>
    <td>A string of chars (double quote)</td>
    <td>"abcdefg", "hello world", "i am immutable"</td>
  </tr>
</table>

##Java Variables
Instead of using var or let, in Java we put what type we would like to use:
- variables must have a type.
- variables declared inside of methods are known as local variables.

```java
public class Ops {
  public static int sum(int x, int y) {
    return x + y;
  }
  public static void main(String [] args){
    int first; // declare a var: first of type int
    first = 1; //assign first a value of 1
    int second = 2; // same as above in one ln
    int result = sum(first, second);   // declare a variable called result of type int
    System.out.println(result);   // print the value stored in variable result
  }
}
```

## Java Classes
- Classes are blueprints for objects.
- Classes can be used as types.
- Constructors are named the same as the class.
- Constructor definitions do not have a return type.
- Objects are instantiated / created by invoking the constructor.

In Java, we create reusable objects using **classes**, but we still need to invoke the constructor ie prototype in JavaScript.

<table>
  <tr>
    <th>JavaScript</th>
    <th>Java</th>
  </tr>
  <tr>
    <td>Every function _can_ be called as a constructor (using `new`)</td>
    <td>Classes and constructors are separate</td>
  </tr>
  <tr>
    <td>you can define properties right inside the constructor</td>
    <td>properties (called "fields" or "instance variables") need to be defined as part of the class definition</td>
  </tr>
  <tr>
    <td>you have to add methods to the prototype</td>
    <td>you cannot define new fields at runtime, like you can with JavaScript objects</td>
  </tr>
  <tr>
    <td>you can add properties at any point</td>
    <td>methods are defined inside the class definition</td>
  </tr>
  <tr>
    <td>you _must_ use `this` to refer to properties inside methods</td>
    <td>you don't need `this` unless there's parameter shadowing happening</td>
  </tr>
</table>

```java
public class Person {
  public String first;  // these are instance variables that can be used in any
  public String last;   // non-static method/constructor within the entire class

  public Person (String first, String last) {
    this.first = first;
    this.last = last;
  }

  public String fullName() {
    return this.first + " " + this.last;
  }

  public static void main (String[] args){
    Person rambo = new Person("Sylvester", "Stallone"); // Person is used like other type declarations since it's a class
    rambo.fullName()
  }

}
```

## Static vs. Instance
Static methods and variables can be used without instantiating the object from the class.
Non-static variables and methods are only accessible from an instantiated object.

- Static fields are attached to the class.
- Static fields can be used with out instantiating the class (without constructing an object.)
- Static fields are shared across all object instances constructed from the class.
- Static variables are known as Class variables.

- Instance fields are attached to the object instances constructed from the class.
- Instance fields are unique to each instance of the object.

### Static Methods:
useful in creating utility objects or libraries, where you want to use methods without having to invoke the constructor.

### Static Variables:
AKA class variables, which are like instance variables but static.

## 'this' in java
`this` is very simple - it always just refers to that _instance_.

## Java properties & method invocations
- Methods are not references; In Java, a method is a field that cannot be referenced, only invoked. In other words, if you call a method name without parenthesis, it will think it is a _variable_.
- Variables cannot have a method as a value.
- Methods cannot be passed into other methods.

## Java Arrays
Arrays are extremely primitive.
- They have no methods; only a `length` property.
- You have to tell Java both _how many_ things you want to put in the Array, and also _what type_ the things are.

Array literal syntax uses curly braces, and you still need to define the _type_ of thing that will go in the array, and also how deeply nested the array will be.

## Java Strings
Java strings are created in 2 ways:
- string literals: If String literals have the same content, then they share a reference
- string objects: String objects have unique references even if they have the same content.
- Strings are immutable, so when we modify them we are actually just creating a new String.

Never use `==`: it compares references not values.
Use the `equals()` or `equalsIgnoreCase()` methods.
