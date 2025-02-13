package Feb8.Inheritance;

//means-- code reusability....one class property used by anotehr class..

class Parent {
  void fatherMother() {
    System.out.println("From Parent");
  }
}

class Child extends Parent {
  void fatherMother() {
    System.out.println("From Child");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Child obj = new Child();
    obj.fatherMother();
  }
}
