# Polymorphism

## Abstract Classes
Abstract classes are classes that can define fields and methods, but cannot be instantiated.  You can define Abstract classes like so:

```java
abstract class Importer {
  int importCount = 0;
  abstract void getCount();
}

class JSONImporter extends Importer {
  public void getCount(){
    System.out.println(importCount);
  }
}
```

## Polymorphism and Inheritance

Polymorphism is a powerful software design principle, a _way of programming_, and not an explicit language feature.  You can program polymorphic code can be either in the Functional or Object-Oriented style and it can be written in statically typed or dynamically typed languages.

Polymorphism consists of two parts:

1. A method or statement that can work with objects of _different types_
2. A number of different _types_ of methods with the same _method signature_

```java
abstract class SomeBaseClass {
  abstract void doStuff();
}

class SomeClass extends SomeBaseClass {
  void doStuff(){
    System.out.println("Doing stuff");
  }
}

class SomeOtherClass extends SomeBaseClass {
  void doStuff(){
    System.out.println("Doing other stuff");
  }
}

class Runner {
  void run(SomeBaseClass o) {
    o.doStuff();
  }
}

class Junk {
  public static void main(String[] args){
    Runner runner = new Runner();
    runner.run(new SomeClass());
    runner.run(new SomeOtherClass());
  }
}
```

*How is Polymorphism different from Inheritance?**

Inheritance is one way to _achieve_ polymorphism, if and only if

- methods are defined in the base class
- only behaviors are overridden in the sub classes (not method signatures)

There are other ways to achieve polymorphism, such as Interfaces.

## When to use polymorphism

Any time you see `instanceof` in your code, you should consider whether you can replace it with polymorphism.

Polymorphism forms the basis of non-declarative Dependency Injection.
