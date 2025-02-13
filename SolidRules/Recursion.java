package SolidRules;

public class Recursion {
  public static void show(int n) {
    if (n == 0)
      return; // base case to stop recursion;
    System.out.println("Hello" + n);
    show(n - 1);
  }

  public static void main(String[] args) {
    show(5);
  }
}
