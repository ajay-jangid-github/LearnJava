package ExecutionFlow;

//Method Hiding-- when Parent class static method redefined in to child class- that time method only hiding not overriding
///means staic method override nhi hote hain, sirf hiding ho jate hain...
class Parent {
  static void show() {
    System.out.println("from parent method");
  }
}

class Child extends Parent {
  static void show() {
    System.out.println("form child method");
  }
}

public class MethodHiding {
  public static void main(String[] args) {
    Parent obj = new Child();
    obj.show();
  }
}
