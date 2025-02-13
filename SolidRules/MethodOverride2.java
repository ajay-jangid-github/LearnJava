package SolidRules;
//we can not override main method.. bcz main is a static method but hiding.

//method override vs Method hiding
//method override--when child class provide version to the parent class which belong to non-static method..
//method hiding --- when child class provide version to the parent class which belong to the static method, that's the reason i Method hiding, not overriding..

//second program to method-hiding --

//step1 : create a static main method

class Parent {
  public static void display() {
    System.out.println("Parent display");
  }
}

class Child extends Parent {
  public static void display() {
    System.out.println("child display");
  }
}

public class MethodOverride2 {
  public static void main(String[] args) {
    Parent obj = new Child();
    obj.display();
  }
}
