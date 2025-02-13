package SolidRules;

public class OverloadMain {
  public static void main(String[] args) {
    System.out.println("Hello world");
    main(10); // overloaded method call
  }

  public static void main(int x) {
    System.out.println("Overloaded main() with x" + x);
  }
}
