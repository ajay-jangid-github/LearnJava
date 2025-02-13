package ExecutionFlow;
//method Overriding --when child class modify, method of parent class.

//and overriding will be decided to runtime..it is called dynamic binding.

class Parent {
  void show() {
    System.out.println("from parent");
  }
}

class Child extends Parent {
  void show() {
    System.out.println("from child");
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    Parent obj = new Child();
    obj.show();
  }
}
