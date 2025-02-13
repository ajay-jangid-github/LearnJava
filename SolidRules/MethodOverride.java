package SolidRules;
//we can not override main method.. bcz main is a static method but hiding.

//method override vs Method hiding
//method override--when child class provide version to the parent class which belong to non-static method..
//method hiding --- when child class provide version to the parent class which belong to the static method, that's the reason we can Method hiding, not overriding..

//first program to overriding--

//step1 : create a non-static main method
class Parent {
  void show() { // non-static method
    System.out.println("Parent show");
  }
}

class Child extends Parent {

  void show() { // overriding
    System.out.println("Child show");
  }
}

public class MethodOverride {
  public static void main(String[] args) {
    Parent obj = new Child(); // runtime polymorphism
    obj.show(); // output-- child show
  }
}
