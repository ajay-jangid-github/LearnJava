package ExecutionFlow;

//Method Overloading---means same method name but different parameters...
//method Overloading compile time par decide hota hai.....static binding.

class Parent {
  void show(int a) {
    System.out.println("Integer" + a);
  }

  void show(String b) {
    System.out.println("String" + b);
  }
}

public class MethodOverloading {
  public static void main(String[] args) {
    Parent obj = new Parent();
    obj.show(10);
    obj.show("Hello");

  }
}
