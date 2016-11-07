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

## Constructor, Inheritance, and super()
