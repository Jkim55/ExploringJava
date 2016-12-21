# Inheritance

## Inheritance Basics
- way in which a sub-class can access fields & methods defined in a parent class
- subclasses can optionally do things such as:
  - add new fields and methods
  - override methods to change their behavior
- Classes can only inherit from one other class.

## Method Signatures/Overloading
A **method signature** is comprised of:
- the method name
- the number of parameters
- the types of parameters
- the order of parameters

_method overloading_: The concept of having different methods with the same name


##  Inheritance
The basic syntax for inheriting:


```java
class Vehicle {
}

class Sedan extends Vehicle {  
}

class Dog {
}

class ChocoLab extends Dog {  
}
```

The keyword is `extends` for making something a subclass of another.

## Method Overriding and `super.method`

If a subclass defines a method with the same _method signature_ of its parent class, it _overrides_ that method.

Note, the _method signature_ is sensitive to the # of arguments passed in... To override the superclass method, the signature must match exactly.

**Overridden methods can call the superclass method**

Take the following example:

```java
class Person {
  void speak(String message) {
    System.out.println(message);
  }
  void speak(String message, boolean shout) {
    System.out.println(message.toUpperCase());
  }
}

class Smoker extends Person {
  void speak(String message) {
    System.out.println("*cough*... " + message);
  }
}

class RunIt {
  public static void main(String[] args){
    Smoker smoker = new Smoker();
    smoker.speak("hello");        // prints *cough*... hello (from the subclass)
    smoker.speak("hello", true);  // prints HELLO (from the superclass)
  }
}
```

## Constructor, Inheritance, and `super()`
Every class in Java has a constructor.  By default it's a no-op (that is, it does nothing) method that takes no parameters.

**Constructors are called from the top down**: When you instantiate an object, all matching constructors are called in order:

**Constructors are not inherited, but can call parent constructors with `super()`**: If you define a constructor in a base class that takes parameters, subclasses won't be able to use it
